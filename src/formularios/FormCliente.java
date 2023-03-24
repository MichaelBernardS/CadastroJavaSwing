package formularios;

import controle.Cliente;
import dao.ClienteDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validacaocpfcnpj.ValidaCNPJ;
import validacaocpfcnpj.ValidaCPF;

public class FormCliente extends javax.swing.JFrame {

    public FormCliente() {
        initComponents();
        preencherTabela();
        jBexcluir.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pesquisaNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTcliente = new javax.swing.JTable();
        jBnovo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jid = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jnome = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jcpfcnpj = new javax.swing.JLabel();
        jFcpfcnpj = new javax.swing.JFormattedTextField();
        jendereco = new javax.swing.JLabel();
        jTendereco = new javax.swing.JTextField();
        jtipo = new javax.swing.JLabel();
        jBsalvar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        campoCPF = new javax.swing.JRadioButton();
        campoCNPJ = new javax.swing.JRadioButton();
        jBcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jTcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Cpf/Cnpj", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTclienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTcliente);

        jBnovo.setText("NOVO");
        jBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Tira fundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista de Clientes", jPanel3);

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Clientes");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jid.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jid.setText("ID:");

        jTid.setEditable(false);
        jTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidActionPerformed(evt);
            }
        });

        jnome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jnome.setText("Nome:");

        jcpfcnpj.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jcpfcnpj.setText("CPF/CNPJ:");

        jFcpfcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFcpfcnpjActionPerformed(evt);
            }
        });

        jendereco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jendereco.setText("Endereço:");

        jtipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtipo.setText("Tipo:");

        jBsalvar.setText("Gravar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });

        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        campoCPF.setText("CPF");
        campoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFActionPerformed(evt);
            }
        });

        campoCNPJ.setText("CNPJ");
        campoCNPJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoCNPJMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCPF)
                    .addComponent(campoCNPJ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcpfcnpj)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jnome))
                            .addComponent(jid, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jtipo, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jendereco))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFcpfcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(505, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTendereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTnome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(147, 147, 147))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnome))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jtipo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFcpfcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcpfcnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jendereco))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        Cliente c = new Cliente();
        int opcao = jTcliente.getSelectedRow();
        if (opcao >= 0) {
            c.setId(Integer.parseInt(jTcliente.getValueAt(opcao, 0).toString()));
            c.setNome(jTcliente.getValueAt(opcao, 1).toString());
            c.setCpfcnpj(jTcliente.getValueAt(opcao, 2).toString());
            c.setEndereco(jTcliente.getValueAt(opcao, 3).toString());
            ClienteDAO cdao = new ClienteDAO();
            cdao.excluir(c);
            preencherTabela();
            jTabbedPane1.setSelectedIndex(0);
            jTid.setText("");
            jTnome.setText("");
            jFcpfcnpj.setText("");
            jTendereco.setText("");
        }
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        Cliente c = new Cliente();
        ClienteDAO cdao = new ClienteDAO();
        if (!"".equals(jTid.getText())) {
            c.setId(Integer.parseInt(jTid.getText()));
        }
        c.setNome(jTnome.getText());
        c.setCpfcnpj(jFcpfcnpj.getText());
        c.setEndereco(jTendereco.getText());
        if (jFcpfcnpj.getText().length() <= 11 ) {
        if (ValidaCPF.isCPF(jFcpfcnpj.getText()) == true) {
            cdao.saveOrUpdate(c);
            preencherTabela();
            jTabbedPane1.setSelectedIndex(0);
            jTid.setText("");
            jTnome.setText("");
            campoCPF.setSelected(false);
            campoCNPJ.setSelected(false);
            jcpfcnpj.setText("CPF/CNPJ:");
            jFcpfcnpj.setText("");
            jTendereco.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "CPF inválido!");
        }
        }
        
        if (jFcpfcnpj.getText().length() >= 12 ) {
        if (ValidaCNPJ.isCNPJ(jFcpfcnpj.getText()) == true) {
            cdao.saveOrUpdate(c);
            preencherTabela();
            jTabbedPane1.setSelectedIndex(0);
            jTid.setText("");
            jTnome.setText("");
            campoCPF.setSelected(false);
            campoCNPJ.setSelected(false);
            jcpfcnpj.setText("CPF/CNPJ:");
            jFcpfcnpj.setText("");
            jTendereco.setText("");
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "CNPJ inválido!");
        }
        }
    }//GEN-LAST:event_jBsalvarActionPerformed

    public void preencherTabela() {
        ClienteDAO cdao = new ClienteDAO();
        List<Cliente> lista = cdao.listarTodos();
        DefaultTableModel modeloTabela = (DefaultTableModel) jTcliente.getModel();
        modeloTabela.setRowCount(0);
        for (Cliente c : lista) {
            modeloTabela.addRow(new Object[]{c.getId(), c.getNome(), c.getCpfcnpj(), c.getEndereco()});
        }
    }

    private void jTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidActionPerformed

    }//GEN-LAST:event_jTidActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        jTid.setText("");
        jTnome.setText("");
        campoCPF.setSelected(false);
        campoCNPJ.setSelected(false);
        jcpfcnpj.setText("CPF/CNPJ:");
        jFcpfcnpj.setText("");
        jTendereco.setText("");
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        jBexcluir.setVisible(false);
    }//GEN-LAST:event_jBnovoActionPerformed

    private void jTclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTclienteMouseClicked
        if (evt.getClickCount() == 2) {
            jBexcluir.setVisible(true);
            int opcao = jTcliente.getSelectedRow();
            if (opcao >= 0) {
                jTid.setText(jTcliente.getValueAt(opcao, 0).toString());
                jTnome.setText(jTcliente.getValueAt(opcao, 1).toString());
                if (jTcliente.getValueAt(opcao, 2).toString().length() <= 14) {
                    jcpfcnpj.setText("CPF:");
                    campoCPF.setSelected(true);
                jFcpfcnpj.setText((jTcliente.getValueAt(opcao, 2).toString().substring(0, 3) + jTcliente.getValueAt(opcao, 2).toString().substring(4, 7) + jTcliente.getValueAt(opcao, 2).toString().substring(8, 11) + jTcliente.getValueAt(opcao, 2).toString().substring(12, 14)));
                }
                if (jTcliente.getValueAt(opcao, 2).toString().length() >= 15) {
                    jcpfcnpj.setText("CNPJ:");
                    campoCNPJ.setSelected(true);
                jFcpfcnpj.setText((jTcliente.getValueAt(opcao, 2).toString().substring(0, 2) + jTcliente.getValueAt(opcao, 2).toString().substring(3, 6) + jTcliente.getValueAt(opcao, 2).toString().substring(7, 10) + jTcliente.getValueAt(opcao, 2).toString().substring(11, 15) + jTcliente.getValueAt(opcao, 2).toString().substring(16, 18)));
                }
                jTendereco.setText(jTcliente.getValueAt(opcao, 3).toString());
                jTabbedPane1.setSelectedIndex(1);
            }
        }
    }//GEN-LAST:event_jTclienteMouseClicked

    private void campoCNPJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCNPJMouseClicked
        if (campoCNPJ.isSelected()) {
            campoCPF.setSelected(false);
            jcpfcnpj.setText("CNPJ:");
        }
    }//GEN-LAST:event_campoCNPJMouseClicked

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
        if (campoCPF.isSelected()) {
            campoCNPJ.setSelected(false);
            jcpfcnpj.setText("CPF:");
        }
    }//GEN-LAST:event_campoCPFActionPerformed

    private void jFcpfcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFcpfcnpjActionPerformed

    }//GEN-LAST:event_jFcpfcnpjActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton campoCNPJ;
    private javax.swing.JRadioButton campoCPF;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBnovo;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JFormattedTextField jFcpfcnpj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTcliente;
    private javax.swing.JTextField jTendereco;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTnome;
    private javax.swing.JLabel jcpfcnpj;
    private javax.swing.JLabel jendereco;
    private javax.swing.JLabel jid;
    private javax.swing.JLabel jnome;
    private javax.swing.JLabel jtipo;
    private javax.swing.JTextField pesquisaNome;
    // End of variables declaration//GEN-END:variables
}
