package model.dao;

import controle.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import controle.Pedido;
import java.util.ArrayList;
import java.util.List;
import db.Conectar;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class PedidoDAO {

    public void cadastrar(Pedido p) {
        Connection con = Conectar.getConectar();
        String sql = "INSERT INTO pedido (data, id_cliente) VALUES (?,?) ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setDate(1, new java.sql.Date(p.getData().getTime()));
            smt.setInt(2, p.getCliente().getId());
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o pedido!");
        }
    }

    public void atualizar(Pedido p) {
        Connection con = Conectar.getConectar();
        String sql = "UPDATE pedido "
                + "SET data = ?, id_cliente = ? "
                + "WHERE id = ? ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setDate(1, new java.sql.Date(p.getData().getTime()));
            smt.setInt(2, p.getCliente().getId());
            smt.setInt(3, p.getId());
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro!");
        }
    }

    public void saveOrUpdate(Pedido pedido) {
        if (pedido.getId() == null) {
            cadastrar(pedido);
        } else {
            atualizar(pedido);
        }
    }

    public void excluir(Pedido p) {
        Connection con = Conectar.getConectar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String sql = "DELETE FROM pedido WHERE id = ? ";
        int opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do pedido "
                + "de Id: " + p.getId() + " com data: " + sdf.format(p.getData()) + "?", "Exclusão de um pedido", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement smt = con.prepareStatement(sql)) {
                smt.setInt(1, p.getId());
                smt.executeUpdate();
                smt.close();
                con.close();
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o registro");
            }
        }
    }

    public List<Pedido> listarTodos() {
        Connection con = Conectar.getConectar();
        List<Pedido> lista = new ArrayList<>();
        String sql = "SELECT pedido.*, cliente.Id as IdCliente, cliente.nome as ClNome, cliente.cpfcnpj as ClCpfcnpj, cliente.endereco as ClEndereco "
                + "from pedido inner join cliente on pedido.Id_Cliente = cliente.Id order by id ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            ResultSet rs = smt.executeQuery();
            List<Pedido> list = new ArrayList<>();
            Map<Integer, Cliente> map = new HashMap<>();

            while (rs.next()) {

                Cliente cl = map.get(rs.getInt("IdCliente"));

                if (cl == null) {
                    cl = instantiateCliente(rs);
                    map.put(rs.getInt("IdCliente"), cl);
                }

                Pedido ped = instantiatePedido(rs, cl);
                list.add(ped);
            }
            return list;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os registros");
        }
        return lista;
    }

    private Pedido instantiatePedido(ResultSet rs, Cliente cl) throws SQLException, java.sql.SQLException {
        Pedido obj = new Pedido();
        obj.setId(rs.getInt("Id"));
        obj.setData(rs.getDate("data"));
        obj.setCliente(cl);
        return obj;
    }

    private Cliente instantiateCliente(ResultSet rs) throws SQLException, java.sql.SQLException {
        Cliente c = new Cliente();
        c.setId(rs.getInt("IdCliente"));
        c.setNome(rs.getString("ClNome"));
        c.setCpfcnpj(rs.getString("ClCpfcnpj"));
        c.setEndereco(rs.getString("ClEndereco"));
        return c;
    }
}
