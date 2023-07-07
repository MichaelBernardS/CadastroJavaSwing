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
        String sql = "DELETE FROM pedido WHERE id = ? ";
        int opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do pedido "
                + p.getData() + "?", "Exclusão de um pedido", JOptionPane.YES_NO_OPTION);
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
        String sql = "SELECT p.id, p.data, p.id_cliente FROM pedido as p JOIN cliente as c ON (p.id_cliente = c.id) ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            ResultSet resultado = smt.executeQuery();
            while (resultado.next()) {
                Pedido p = new Pedido();
                Cliente c = new Cliente();
                c.setId(resultado.getInt("c.id"));
                c.setNome(resultado.getString("nome"));
                c.setCpfcnpj(resultado.getString("cpfcnpj"));
                c.setEndereco(resultado.getString("endereco"));
                p.setId(resultado.getInt("id"));
                p.setData(resultado.getDate("data"));
                p.setCliente(c);
                lista.add(p);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os registros");
        }
        return lista;
    }
    
}