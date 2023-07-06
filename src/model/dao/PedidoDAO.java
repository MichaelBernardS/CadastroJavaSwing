package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
    
}