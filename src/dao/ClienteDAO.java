package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import controle.Cliente;
import java.util.ArrayList;
import java.util.List;
import utilitário.Conectar;
import static validacaocpfcnpj.ValidaCPF.imprimeCPF;

public class ClienteDAO {

    public void cadastrar(Cliente c) {
        Connection con = Conectar.getConectar();
        String sql = "INSERT INTO cliente (nome, cpfcnpj, endereco) VALUES (?,?,?) ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, c.getNome());
            smt.setString(2, imprimeCPF(c.getCpfcnpj()));
            
            smt.setString(3, c.getEndereco());
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "CPF repetido!");
        }
    }

    public void atualizar(Cliente c) {
        Connection con = Conectar.getConectar();
        String sql = "UPDATE cliente "
                + "SET nome = ?, cpfcnpj = ?, endereco = ? "
                + "WHERE id = ? ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, c.getNome());
            smt.setString(2, imprimeCPF(c.getCpfcnpj()));
            smt.setString(3, c.getEndereco());
            smt.setInt(4, c.getId());
            smt.executeUpdate();
            smt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro!");
        }
    }

    public void saveOrUpdate(Cliente cliente) {
        if (cliente.getId() == null) {
            cadastrar(cliente);
        } else {
            atualizar(cliente);
        }
    }

    public void excluir(Cliente c) {
        Connection con = Conectar.getConectar();
        String sql = "DELETE FROM cliente WHERE id = ? ";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o cliente "
                + c.getNome() + "?", "Excluir", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement smt = con.prepareStatement(sql)) {
                smt.setInt(1, c.getId());
                smt.executeUpdate();
                smt.close();
                con.close();
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o registro");
            }
        }
    }

    public List<Cliente> listarTodos() {
        Connection con = Conectar.getConectar();
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente ORDER BY id ";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            ResultSet resultado = smt.executeQuery();
            while (resultado.next()) {
                Cliente c = new Cliente();
                c.setId(resultado.getInt("id"));
                c.setNome(resultado.getString("nome"));
                c.setCpfcnpj(resultado.getString("cpfcnpj"));
                c.setEndereco(resultado.getString("endereco"));
                lista.add(c);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os registros");
        }
        return lista;
    }
}
