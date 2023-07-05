package formularios;

import controle.Cliente;
import controle.Item;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.ClienteDAO;
import model.dao.ItemDAO;
import validacaocpfcnpj.ValidaCNPJ;
import validacaocpfcnpj.ValidaCPF;

public class FormCliente extends javax.swing.JFrame {

    public FormCliente() {
        initComponents();
        preencherTabelaCliente();
        jBexcluirCliente.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Abas = new javax.swing.JTabbedPane();
        Clientes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pesquisaClientes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTcliente = new javax.swing.JTable();
        jBnovoCliente = new javax.swing.JButton();
        jLimgLupaCliente = new javax.swing.JLabel();
        CadastroDeClientes = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jid = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jnome = new javax.swing.JLabel();
        jTFnomeCliente = new javax.swing.JTextField();
        jcpfcnpj = new javax.swing.JLabel();
        jFcpfcnpjCliente = new javax.swing.JFormattedTextField();
        jendereco = new javax.swing.JLabel();
        jTFenderecoCliente = new javax.swing.JTextField();
        jtipo = new javax.swing.JLabel();
        jBgravarCliente = new javax.swing.JButton();
        jBexcluirCliente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        campoCPF = new javax.swing.JRadioButton();
        campoCNPJ = new javax.swing.JRadioButton();
        jBcancelarCliente = new javax.swing.JButton();
        Produtos = new javax.swing.JPanel();
        jLimgLupaProduto = new javax.swing.JLabel();
        pesquisaProdutos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTproduto = new javax.swing.JTable();
        jBnovoProduto = new javax.swing.JButton();
        CadastroDeProdutos = new javax.swing.JPanel();
        jLabelCadastroDeItens = new javax.swing.JLabel();
        jid1 = new javax.swing.JLabel();
        jTid1 = new javax.swing.JTextField();
        jnome1 = new javax.swing.JLabel();
        jTnome1 = new javax.swing.JTextField();
        jtipo1 = new javax.swing.JLabel();
        jFcpfcnpj1 = new javax.swing.JFormattedTextField();
        jBsalvar1 = new javax.swing.JButton();
        jBexcluir1 = new javax.swing.JButton();
        jBcancelar1 = new javax.swing.JButton();
        Pedidos = new javax.swing.JPanel();
        CadastroDePedidos = new javax.swing.JPanel();
        jLabelCadastroDePedidos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Abas.setBackground(new java.awt.Color(255, 255, 255));
        Abas.setForeground(new java.awt.Color(0, 0, 0));

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

        jBnovoCliente.setText("NOVO");
        jBnovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoClienteActionPerformed(evt);
            }
        });

        jLimgLupaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Tira fundo.png"))); // NOI18N

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes);
        Clientes.setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLimgLupaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBnovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLimgLupaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pesquisaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBnovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        Abas.addTab("Clientes", Clientes);

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

        jFcpfcnpjCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFcpfcnpjClienteActionPerformed(evt);
            }
        });

        jendereco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jendereco.setText("Endereço:");

        jtipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtipo.setText("Tipo:");

        jBgravarCliente.setText("Gravar");
        jBgravarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgravarClienteActionPerformed(evt);
            }
        });

        jBexcluirCliente.setText("Excluir");
        jBexcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirClienteActionPerformed(evt);
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

        jBcancelarCliente.setText("Cancelar");
        jBcancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroDeClientesLayout = new javax.swing.GroupLayout(CadastroDeClientes);
        CadastroDeClientes.setLayout(CadastroDeClientesLayout);
        CadastroDeClientesLayout.setHorizontalGroup(
            CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CadastroDeClientesLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jBgravarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBexcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBcancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(CadastroDeClientesLayout.createSequentialGroup()
                .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcpfcnpj)
                    .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroDeClientesLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jnome))
                            .addComponent(jid, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jtipo, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jendereco))
                .addGap(18, 18, 18)
                .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroDeClientesLayout.createSequentialGroup()
                        .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFcpfcnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(505, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroDeClientesLayout.createSequentialGroup()
                        .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFenderecoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFnomeCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroDeClientesLayout.createSequentialGroup()
                                .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(147, 147, 147))))
        );
        CadastroDeClientesLayout.setVerticalGroup(
            CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroDeClientesLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFnomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnome))
                .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroDeClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroDeClientesLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jtipo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFcpfcnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcpfcnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFenderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jendereco))
                .addGap(38, 38, 38)
                .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBexcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBgravarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        Abas.addTab("Cadastro de Clientes", CadastroDeClientes);

        jLimgLupaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Tira fundo.png"))); // NOI18N

        jTproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Descrição", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTprodutoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTproduto);

        jBnovoProduto.setText("NOVO");
        jBnovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProdutosLayout = new javax.swing.GroupLayout(Produtos);
        Produtos.setLayout(ProdutosLayout);
        ProdutosLayout.setHorizontalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBnovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ProdutosLayout.createSequentialGroup()
                        .addComponent(jLimgLupaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        ProdutosLayout.setVerticalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLimgLupaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBnovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        Abas.addTab("Produtos", Produtos);

        jLabelCadastroDeItens.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCadastroDeItens.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCadastroDeItens.setForeground(new java.awt.Color(0, 102, 204));
        jLabelCadastroDeItens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastroDeItens.setText("Cadastro de Produtos");
        jLabelCadastroDeItens.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jid1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jid1.setText("ID:");

        jTid1.setEditable(false);
        jTid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTid1ActionPerformed(evt);
            }
        });

        jnome1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jnome1.setText("Descrição:");

        jtipo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtipo1.setText("Preço:");

        jFcpfcnpj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFcpfcnpj1ActionPerformed(evt);
            }
        });

        jBsalvar1.setText("Gravar");
        jBsalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvar1ActionPerformed(evt);
            }
        });

        jBexcluir1.setText("Excluir");
        jBexcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluir1ActionPerformed(evt);
            }
        });

        jBcancelar1.setText("Cancelar");
        jBcancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroDeProdutosLayout = new javax.swing.GroupLayout(CadastroDeProdutos);
        CadastroDeProdutos.setLayout(CadastroDeProdutosLayout);
        CadastroDeProdutosLayout.setHorizontalGroup(
            CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCadastroDeItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroDeProdutosLayout.createSequentialGroup()
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroDeProdutosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jtipo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CadastroDeProdutosLayout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jid1)
                            .addComponent(jnome1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroDeProdutosLayout.createSequentialGroup()
                        .addComponent(jBsalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBexcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBcancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTid1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTnome1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFcpfcnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157))
        );
        CadastroDeProdutosLayout.setVerticalGroup(
            CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroDeProdutosLayout.createSequentialGroup()
                .addComponent(jLabelCadastroDeItens, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jid1)
                    .addComponent(jTid1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnome1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnome1))
                .addGap(18, 18, 18)
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFcpfcnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtipo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBexcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        Abas.addTab("Cadastro de Produtos", CadastroDeProdutos);

        javax.swing.GroupLayout PedidosLayout = new javax.swing.GroupLayout(Pedidos);
        Pedidos.setLayout(PedidosLayout);
        PedidosLayout.setHorizontalGroup(
            PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        PedidosLayout.setVerticalGroup(
            PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        Abas.addTab("Pedidos", Pedidos);

        jLabelCadastroDePedidos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCadastroDePedidos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCadastroDePedidos.setForeground(new java.awt.Color(0, 102, 204));
        jLabelCadastroDePedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastroDePedidos.setText("Cadastro de Pedidos");
        jLabelCadastroDePedidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout CadastroDePedidosLayout = new javax.swing.GroupLayout(CadastroDePedidos);
        CadastroDePedidos.setLayout(CadastroDePedidosLayout);
        CadastroDePedidosLayout.setHorizontalGroup(
            CadastroDePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCadastroDePedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        CadastroDePedidosLayout.setVerticalGroup(
            CadastroDePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroDePedidosLayout.createSequentialGroup()
                .addComponent(jLabelCadastroDePedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 386, Short.MAX_VALUE))
        );

        Abas.addTab("Cadastro de Pedidos", CadastroDePedidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Abas, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Abas)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBcancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarClienteActionPerformed
        jTid.setText("");
        jTFnomeCliente.setText("");
        campoCPF.setSelected(false);
        campoCNPJ.setSelected(false);
        jcpfcnpj.setText("CPF/CNPJ:");
        jFcpfcnpjCliente.setText("");
        jTFenderecoCliente.setText("");
        Abas.setSelectedIndex(0);
    }//GEN-LAST:event_jBcancelarClienteActionPerformed

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

    private void jBexcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirClienteActionPerformed
        Cliente c = new Cliente();
        int opcao = jTcliente.getSelectedRow();
        if (opcao >= 0) {
            c.setId(Integer.parseInt(jTcliente.getValueAt(opcao, 0).toString()));
            c.setNome(jTcliente.getValueAt(opcao, 1).toString());
            c.setCpfcnpj(jTcliente.getValueAt(opcao, 2).toString());
            c.setEndereco(jTcliente.getValueAt(opcao, 3).toString());
            ClienteDAO cdao = new ClienteDAO();
            cdao.excluir(c);
            preencherTabelaCliente();
            Abas.setSelectedIndex(0);
            jTid.setText("");
            jTFnomeCliente.setText("");
            jFcpfcnpjCliente.setText("");
            jTFenderecoCliente.setText("");
        }
    }//GEN-LAST:event_jBexcluirClienteActionPerformed

    private void jBgravarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravarClienteActionPerformed
        Cliente c = new Cliente();
        ClienteDAO cdao = new ClienteDAO();
        if (!"".equals(jTid.getText())) {
            c.setId(Integer.parseInt(jTid.getText()));
        }
        c.setNome(jTFnomeCliente.getText());
        c.setCpfcnpj(jFcpfcnpjCliente.getText());
        c.setEndereco(jTFenderecoCliente.getText());
        if (jFcpfcnpjCliente.getText().length() <= 11) {
            if (ValidaCPF.isCPF(jFcpfcnpjCliente.getText()) == true) {
                cdao.saveOrUpdate(c);
                preencherTabelaCliente();
                Abas.setSelectedIndex(0);
                jTid.setText("");
                jTFnomeCliente.setText("");
                campoCPF.setSelected(false);
                campoCNPJ.setSelected(false);
                jcpfcnpj.setText("CPF/CNPJ:");
                jFcpfcnpjCliente.setText("");
                jTFenderecoCliente.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "CPF inválido!");
            }
        }

        if (jFcpfcnpjCliente.getText().length() >= 12) {
            if (ValidaCNPJ.isCNPJ(jFcpfcnpjCliente.getText()) == true) {
                cdao.saveOrUpdate(c);
                preencherTabelaCliente();
                Abas.setSelectedIndex(0);
                jTid.setText("");
                jTFnomeCliente.setText("");
                campoCPF.setSelected(false);
                campoCNPJ.setSelected(false);
                jcpfcnpj.setText("CPF/CNPJ:");
                jFcpfcnpjCliente.setText("");
                jTFenderecoCliente.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "CNPJ inválido!");
            }
        }
    }//GEN-LAST:event_jBgravarClienteActionPerformed

    private void jFcpfcnpjClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFcpfcnpjClienteActionPerformed

    }//GEN-LAST:event_jFcpfcnpjClienteActionPerformed

    private void jTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidActionPerformed

    }//GEN-LAST:event_jTidActionPerformed

    private void jBnovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoClienteActionPerformed
        Abas.setSelectedIndex(1);
        jBexcluirCliente.setVisible(false);
    }//GEN-LAST:event_jBnovoClienteActionPerformed

    private void jTclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTclienteMouseClicked
        if (evt.getClickCount() == 2) {
            jBexcluirCliente.setVisible(true);
            int opcao = jTcliente.getSelectedRow();
            if (opcao >= 0) {
                jTid.setText(jTcliente.getValueAt(opcao, 0).toString());
                jTFnomeCliente.setText(jTcliente.getValueAt(opcao, 1).toString());
                if (jTcliente.getValueAt(opcao, 2).toString().length() <= 14) {
                    jcpfcnpj.setText("CPF:");
                    campoCPF.setSelected(true);
                    jFcpfcnpjCliente.setText((jTcliente.getValueAt(opcao, 2).toString().substring(0, 3) + jTcliente.getValueAt(opcao, 2).toString().substring(4, 7) + jTcliente.getValueAt(opcao, 2).toString().substring(8, 11) + jTcliente.getValueAt(opcao, 2).toString().substring(12, 14)));
                }
                if (jTcliente.getValueAt(opcao, 2).toString().length() >= 15) {
                    jcpfcnpj.setText("CNPJ:");
                    campoCNPJ.setSelected(true);
                    jFcpfcnpjCliente.setText((jTcliente.getValueAt(opcao, 2).toString().substring(0, 2) + jTcliente.getValueAt(opcao, 2).toString().substring(3, 6) + jTcliente.getValueAt(opcao, 2).toString().substring(7, 10) + jTcliente.getValueAt(opcao, 2).toString().substring(11, 15) + jTcliente.getValueAt(opcao, 2).toString().substring(16, 18)));
                }
                jTFenderecoCliente.setText(jTcliente.getValueAt(opcao, 3).toString());
                Abas.setSelectedIndex(1);
            }
        }
    }//GEN-LAST:event_jTclienteMouseClicked

    private void jTprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTprodutoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTprodutoMouseClicked

    private void jBnovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnovoProdutoActionPerformed

    private void jTid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTid1ActionPerformed

    private void jFcpfcnpj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFcpfcnpj1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFcpfcnpj1ActionPerformed

    private void jBsalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalvar1ActionPerformed

    private void jBexcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBexcluir1ActionPerformed

    private void jBcancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBcancelar1ActionPerformed

    public void preencherTabelaCliente() {
        ClienteDAO cdao = new ClienteDAO();
        List<Cliente> lista = cdao.listarTodos();
        DefaultTableModel modeloTabela = (DefaultTableModel) jTcliente.getModel();
        modeloTabela.setRowCount(0);
        for (Cliente c : lista) {
            modeloTabela.addRow(new Object[]{c.getId(), c.getNome(), c.getCpfcnpj(), c.getEndereco()});
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Abas;
    private javax.swing.JPanel CadastroDeClientes;
    private javax.swing.JPanel CadastroDePedidos;
    private javax.swing.JPanel CadastroDeProdutos;
    private javax.swing.JPanel Clientes;
    private javax.swing.JPanel Pedidos;
    private javax.swing.JPanel Produtos;
    private javax.swing.JRadioButton campoCNPJ;
    private javax.swing.JRadioButton campoCPF;
    private javax.swing.JButton jBcancelar1;
    private javax.swing.JButton jBcancelarCliente;
    private javax.swing.JButton jBexcluir1;
    private javax.swing.JButton jBexcluirCliente;
    private javax.swing.JButton jBgravarCliente;
    private javax.swing.JButton jBnovoCliente;
    private javax.swing.JButton jBnovoProduto;
    private javax.swing.JButton jBsalvar1;
    private javax.swing.JFormattedTextField jFcpfcnpj1;
    private javax.swing.JFormattedTextField jFcpfcnpjCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCadastroDeItens;
    private javax.swing.JLabel jLabelCadastroDePedidos;
    private javax.swing.JLabel jLimgLupaCliente;
    private javax.swing.JLabel jLimgLupaProduto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFenderecoCliente;
    private javax.swing.JTextField jTFnomeCliente;
    private javax.swing.JTable jTcliente;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTid1;
    private javax.swing.JTextField jTnome1;
    private javax.swing.JTable jTproduto;
    private javax.swing.JLabel jcpfcnpj;
    private javax.swing.JLabel jendereco;
    private javax.swing.JLabel jid;
    private javax.swing.JLabel jid1;
    private javax.swing.JLabel jnome;
    private javax.swing.JLabel jnome1;
    private javax.swing.JLabel jtipo;
    private javax.swing.JLabel jtipo1;
    private javax.swing.JTextField pesquisaClientes;
    private javax.swing.JTextField pesquisaProdutos;
    // End of variables declaration//GEN-END:variables
}