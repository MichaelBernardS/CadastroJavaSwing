package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import controle.Item;
import java.util.ArrayList;
import java.util.List;
import db.Conectar;

public class ItemDAO { 

    public void cadastrar(Item i) {
        Connection con = Conectar.getConectar();
        String sql = "INSERT INTO item (Descricao, Preco) VALUES (?, ?) ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, i.getDescricao());
            smt.setDouble(2, i.getPreco());
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o produto");
        }
    }

    public void atualizar(Item i) {
        Connection con = Conectar.getConectar();
        String sql = "UPDATE item "
                + "SET Descricao = ?, Preco = ? "
                + "WHERE id = ? ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, i.getDescricao());
            smt.setDouble(2, i.getPreco());
            smt.setInt(3, i.getId());
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro!");
        }
    }

    public void saveOrUpdate(Item item) {
        if (item.getId() == null) {
            cadastrar(item);
        } else {
            atualizar(item);
        }
    }

    public void excluir(Item i) {
        Connection con = Conectar.getConectar();
        String sql = "DELETE FROM item WHERE id = ? ";
        int opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do item "
                + i.getDescricao() + "?", "Exclusão de um item", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement smt = con.prepareStatement(sql)) {
                smt.setInt(1, i.getId());
                smt.executeUpdate();
                smt.close();
                con.close();
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o registro");
            }
        }
    }

    public List<Item> listarTodos() {
        Connection con = Conectar.getConectar();
        List<Item> lista = new ArrayList<>();
        String sql = "SELECT * FROM item ORDER BY id ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            ResultSet resultado = smt.executeQuery();
            while (resultado.next()) {
                Item i = new Item();
                i.setId(resultado.getInt("Id"));
                i.setDescricao(resultado.getString("Descricao"));
                i.setPreco(resultado.getDouble("Preco"));
                lista.add(i);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os registros");
        }
        return lista;
    }
}