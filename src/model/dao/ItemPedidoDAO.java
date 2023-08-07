package model.dao;

import controle.Cliente;
import controle.Item;
import controle.Pedido;
import db.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import controle.ItemPedido;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItemPedidoDAO {

    public void cadastrar(ItemPedido itPe) {
        Connection con = Conectar.getConectar();
        String sql = "INSERT INTO itempedido (Qtde, PrecoVenda, Id_Pedido, Id_Item) VALUES (?,?,?,?) ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setInt(1, itPe.getQtde());
            smt.setDouble(2, itPe.getPrecoVenda());
            smt.setInt(3, itPe.getPedido().getId());
            smt.setInt(4, itPe.getItem().getId());
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Item de pedido foi cadastrado!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o item de pedido!");
        }
    }

    public void atualizar(ItemPedido itPe) {
        Connection con = Conectar.getConectar();
        String sql = "UPDATE itempedido "
                + "SET Qtde = ?, PrecoVenda = ?, Id_Pedido = ?, Id_Item = ? "
                + "WHERE id = ? ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setInt(1, itPe.getQtde());
            smt.setDouble(2, itPe.getItem().getPreco());
            smt.setInt(3, itPe.getPedido().getId());
            smt.setInt(4, itPe.getItem().getId());
            smt.setInt(5, itPe.getId());
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro!");
        }
    }

    public void saveOrUpdate(ItemPedido itPe) {
        if (itPe.getId() == null) {
            cadastrar(itPe);
        } else {
            atualizar(itPe);
        }
    }

    public void excluir(ItemPedido itPe) {
        Connection con = Conectar.getConectar();
        String sql = "DELETE FROM itempedido WHERE id = ? ";
        int opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do item de pedido "
                + "de Id: " + "?", "Exclusão de um pedido", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement smt = con.prepareStatement(sql)) {
                smt.setInt(1, itPe.getId());
                smt.executeUpdate();
                smt.close();
                con.close();
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o registro");
            }
        }
    }

    public Set<ItemPedido> listarTodos() {
        Connection con = Conectar.getConectar();
        Set<ItemPedido> lista = new HashSet<>();
        String sql = "SELECT * FROM itempedido ORDER BY id ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                Cliente cl = instantiateCliente(rs);
                Item it = instantiateItem(rs);
                Pedido ped = instantiatePedido(rs, cl);
                ItemPedido itPe = instantiateItemPedido(rs, ped, it);
                lista.add(itPe);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os registros");
        }
        return lista;
    }

    public List<ItemPedido> acharPelaData(Date dataInicio, Date dataFinal) {
        Connection con = Conectar.getConectar();
        List<ItemPedido> lista = new ArrayList<>();
        String sql = "SELECT pedido.Id as PedId, pedido.Data as PedData, itempedido.Id as Id, cliente.Id as IdCliente, cliente.Nome as ClNome, cliente.cpfcnpj as ClCpfcnpj, cliente.endereco as ClEndereco, item.Id as ItId, item.Descricao as ItDescricao,item.Preco as ItPreco, itempedido.Qtde as Qtde, itempedido.PrecoVenda as PrecoVenda "
                + "FROM itempedido "
                + "INNER JOIN pedido ON pedido.Id = itempedido.Id_Pedido "
                + "INNER JOIN item ON item.Id = itempedido.Id_Item "
                + "INNER JOIN cliente ON cliente.Id = pedido.Id_Cliente "
                + "WHERE pedido.Data between ? and ? "
                + "ORDER BY pedido.Data ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setDate(1, new java.sql.Date(dataInicio.getTime()));
            smt.setDate(2, new java.sql.Date(dataFinal.getTime()));
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                Cliente cl = instantiateCliente(rs);
                Item it = instantiateItem(rs);
                Pedido ped = instantiatePedido(rs, cl);
                ItemPedido itPe = instantiateItemPedido(rs, ped, it);
                lista.add(itPe);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os registros");
        }
        return lista;
    }

    private Pedido instantiatePedido(ResultSet rs, Cliente cl) throws SQLException, java.sql.SQLException {
        Pedido p = new Pedido();
        p.setId(rs.getInt("PedId"));
        p.setData(rs.getDate("PedData"));
        p.setCliente(cl);
        return p;
    }

    private Cliente instantiateCliente(ResultSet rs) throws SQLException, java.sql.SQLException {
        Cliente c = new Cliente();
        c.setId(rs.getInt("IdCliente"));
        c.setNome(rs.getString("ClNome"));
        c.setCpfcnpj(rs.getString("ClCpfcnpj"));
        c.setEndereco(rs.getString("ClEndereco"));
        return c;
    }

    private Item instantiateItem(ResultSet rs) throws SQLException, java.sql.SQLException {
        Item i = new Item();
        i.setId(rs.getInt("ItId"));
        i.setDescricao(rs.getString("ItDescricao"));
        i.setPreco(rs.getDouble("ItPreco"));
        return i;
    }

    private ItemPedido instantiateItemPedido(ResultSet rs, Pedido ped, Item it) throws SQLException, java.sql.SQLException {
        ItemPedido itPe = new ItemPedido();
        itPe.setId(rs.getInt("Id"));
        itPe.setQtde(rs.getInt("Qtde"));
        itPe.setPrecoVenda(rs.getDouble("PrecoVenda"));
        itPe.setPedido(ped);
        itPe.setItem(it);
        return itPe;
    }
}
