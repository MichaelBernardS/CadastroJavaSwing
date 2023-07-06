package formularios;

import controle.Cliente;
import controle.Item;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.ClienteDAO;
import model.dao.ItemDAO;
import sonumeros.SoNumeros;
import validacaocpfcnpj.ValidaCNPJ;
import validacaocpfcnpj.ValidaCPF;

public class FormCliente extends javax.swing.JFrame {

    public FormCliente() {
        initComponents();
        jFcpfcnpjCliente.setDocument(new SoNumeros());
        preencherTabelaCliente();
        preencherTabelaItem();
        jBexcluirCliente.setVisible(false);
        jBexcluirProduto.setVisible(false);
        jBexcluirPedido.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Abas = new javax.swing.JTabbedPane();
        Clientes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pesquisaClientes = new javax.swing.JTextField();
        jScrollPaneClientes = new javax.swing.JScrollPane();
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
        jScrollPaneProdutos = new javax.swing.JScrollPane();
        jTproduto = new javax.swing.JTable();
        jBnovoProduto = new javax.swing.JButton();
        CadastroDeProdutos = new javax.swing.JPanel();
        jLabelCadastroDeItens = new javax.swing.JLabel();
        jidproduto = new javax.swing.JLabel();
        jTidProduto = new javax.swing.JTextField();
        jdescricaoproduto = new javax.swing.JLabel();
        jTdescricaoProduto = new javax.swing.JTextField();
        jBgravarProduto = new javax.swing.JButton();
        jBexcluirProduto = new javax.swing.JButton();
        jBcancelarProduto = new javax.swing.JButton();
        jprecoproduto = new javax.swing.JLabel();
        jTprecoProduto = new javax.swing.JTextField();
        Pedidos = new javax.swing.JPanel();
        pesquisaPedidos = new javax.swing.JTextField();
        jLimgLupaPedido = new javax.swing.JLabel();
        jScrollPanePedidos = new javax.swing.JScrollPane();
        jTproduto1 = new javax.swing.JTable();
        jBnovoPedido = new javax.swing.JButton();
        CadastroDePedidos = new javax.swing.JPanel();
        jLabelCadastroDePedidos = new javax.swing.JLabel();
        jidpedido = new javax.swing.JLabel();
        jTidPedido = new javax.swing.JTextField();
        jdatapedido = new javax.swing.JLabel();
        jTdataPedido = new javax.swing.JTextField();
        jclientepedido = new javax.swing.JLabel();
        jTclientePedido = new javax.swing.JTextField();
        jBgravarPedido = new javax.swing.JButton();
        jBexcluirPedido = new javax.swing.JButton();
        jBcancelarPedido = new javax.swing.JButton();

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
        jScrollPaneClientes.setViewportView(jTcliente);

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
                            .addComponent(jScrollPaneClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jBnovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
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
                .addGroup(CadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroDeClientesLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jBgravarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBexcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBcancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFcpfcnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFnomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFenderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(206, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jScrollPaneProdutos.setViewportView(jTproduto);

        jBnovoProduto.setText("NOVO");
        jBnovoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBnovoProdutoMouseClicked(evt);
            }
        });
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
                    .addComponent(jScrollPaneProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ProdutosLayout.createSequentialGroup()
                        .addComponent(jLimgLupaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        ProdutosLayout.setVerticalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLimgLupaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jBnovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        Abas.addTab("Produtos", Produtos);

        jLabelCadastroDeItens.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCadastroDeItens.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCadastroDeItens.setForeground(new java.awt.Color(0, 102, 204));
        jLabelCadastroDeItens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastroDeItens.setText("Cadastro de Produtos");
        jLabelCadastroDeItens.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jidproduto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jidproduto.setText("ID:");

        jTidProduto.setEditable(false);
        jTidProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidProdutoActionPerformed(evt);
            }
        });

        jdescricaoproduto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jdescricaoproduto.setText("Descrição:");

        jBgravarProduto.setText("Gravar");
        jBgravarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgravarProdutoActionPerformed(evt);
            }
        });

        jBexcluirProduto.setText("Excluir");
        jBexcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirProdutoActionPerformed(evt);
            }
        });

        jBcancelarProduto.setText("Cancelar");
        jBcancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarProdutoActionPerformed(evt);
            }
        });

        jprecoproduto.setText("Preço:");

        javax.swing.GroupLayout CadastroDeProdutosLayout = new javax.swing.GroupLayout(CadastroDeProdutos);
        CadastroDeProdutos.setLayout(CadastroDeProdutosLayout);
        CadastroDeProdutosLayout.setHorizontalGroup(
            CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCadastroDeItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroDeProdutosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jidproduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdescricaoproduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jprecoproduto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTidProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTdescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CadastroDeProdutosLayout.createSequentialGroup()
                        .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTprecoProduto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBgravarProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jBexcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBcancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(303, 303, 303))
        );
        CadastroDeProdutosLayout.setVerticalGroup(
            CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroDeProdutosLayout.createSequentialGroup()
                .addComponent(jLabelCadastroDeItens, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jidproduto)
                    .addComponent(jTidProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdescricaoproduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTprecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jprecoproduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(CadastroDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBgravarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBexcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );

        Abas.addTab("Cadastro de Produtos", CadastroDeProdutos);

        jLimgLupaPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Tira fundo.png"))); // NOI18N

        jTproduto1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Data", "Cliente (Id)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTproduto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTproduto1MouseClicked(evt);
            }
        });
        jScrollPanePedidos.setViewportView(jTproduto1);

        jBnovoPedido.setText("NOVO");
        jBnovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PedidosLayout = new javax.swing.GroupLayout(Pedidos);
        Pedidos.setLayout(PedidosLayout);
        PedidosLayout.setHorizontalGroup(
            PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PedidosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanePedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PedidosLayout.createSequentialGroup()
                        .addComponent(jLimgLupaPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisaPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBnovoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        PedidosLayout.setVerticalGroup(
            PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PedidosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLimgLupaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisaPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPanePedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jBnovoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        Abas.addTab("Pedidos", Pedidos);

        jLabelCadastroDePedidos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCadastroDePedidos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCadastroDePedidos.setForeground(new java.awt.Color(0, 102, 204));
        jLabelCadastroDePedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastroDePedidos.setText("Cadastro de Pedidos");
        jLabelCadastroDePedidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jidpedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jidpedido.setText("ID:");

        jTidPedido.setEditable(false);
        jTidPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidPedidoActionPerformed(evt);
            }
        });

        jdatapedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jdatapedido.setText("Data:");

        jclientepedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jclientepedido.setText("Cliente:");

        jBgravarPedido.setText("Gravar");
        jBgravarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgravarPedidoActionPerformed(evt);
            }
        });

        jBexcluirPedido.setText("Excluir");
        jBexcluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirPedidoActionPerformed(evt);
            }
        });

        jBcancelarPedido.setText("Cancelar");
        jBcancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroDePedidosLayout = new javax.swing.GroupLayout(CadastroDePedidos);
        CadastroDePedidos.setLayout(CadastroDePedidosLayout);
        CadastroDePedidosLayout.setHorizontalGroup(
            CadastroDePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCadastroDePedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
            .addGroup(CadastroDePedidosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(CadastroDePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jclientepedido)
                    .addComponent(jdatapedido)
                    .addComponent(jidpedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CadastroDePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroDePedidosLayout.createSequentialGroup()
                        .addComponent(jBgravarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBexcluirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBcancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroDePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTidPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTdataPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jTclientePedido)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CadastroDePedidosLayout.setVerticalGroup(
            CadastroDePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroDePedidosLayout.createSequentialGroup()
                .addComponent(jLabelCadastroDePedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(CadastroDePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTidPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jidpedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroDePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdatapedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroDePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTclientePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jclientepedido))
                .addGap(94, 94, 94)
                .addGroup(CadastroDePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBgravarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBexcluirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 154, Short.MAX_VALUE))
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
        jBexcluirCliente.setVisible(false);
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
        if (jTFnomeCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Necessário informar nome");
        } else {
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
        jTid.setText("");
        jTFnomeCliente.setText("");
        campoCPF.setSelected(false);
        campoCNPJ.setSelected(false);
        jcpfcnpj.setText("CPF/CNPJ:");
        jFcpfcnpjCliente.setText("");
        jTFenderecoCliente.setText("");
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
        if (evt.getClickCount() == 2) {
            jBexcluirProduto.setVisible(true);
            int opcao = jTproduto.getSelectedRow();
            if (opcao >= 0) {
                jTidProduto.setText(jTproduto.getValueAt(opcao, 0).toString());
                jTdescricaoProduto.setText(jTproduto.getValueAt(opcao, 1).toString());
                jTprecoProduto.setText(jTproduto.getValueAt(opcao, 2).toString());
                Abas.setSelectedIndex(3);
            }
        }
    }//GEN-LAST:event_jTprodutoMouseClicked

    private void jBnovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoProdutoActionPerformed
             Abas.setSelectedIndex(3);
             jTidProduto.setText("");
        jTdescricaoProduto.setText("");
        jTprecoProduto.setText("");
        jBexcluirProduto.setVisible(false);
    }//GEN-LAST:event_jBnovoProdutoActionPerformed

    private void jBnovoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBnovoProdutoMouseClicked
   
    }//GEN-LAST:event_jBnovoProdutoMouseClicked

    private void jBcancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarProdutoActionPerformed
        jTidProduto.setText("");
        jTdescricaoProduto.setText("");
        jTprecoProduto.setText("");
        jBexcluirProduto.setVisible(false);
        Abas.setSelectedIndex(2);
    }//GEN-LAST:event_jBcancelarProdutoActionPerformed

    private void jBexcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirProdutoActionPerformed
        Item i = new Item();
        int opcao = jTproduto.getSelectedRow();
        if (opcao >= 0) {
            i.setId(Integer.parseInt(jTproduto.getValueAt(opcao, 0).toString()));
            i.setDescricao(jTproduto.getValueAt(opcao, 1).toString());
            i.setPreco(Double.parseDouble(jTproduto.getValueAt(opcao, 2).toString()));
            ItemDAO idao = new ItemDAO();
            idao.excluir(i);
            preencherTabelaItem();
            Abas.setSelectedIndex(2);
            jTidProduto.setText("");
            jTdescricaoProduto.setText("");
            jTprecoProduto.setText("");
        }
    }//GEN-LAST:event_jBexcluirProdutoActionPerformed

    private void jBgravarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravarProdutoActionPerformed
        Item i = new Item();
        ItemDAO idao = new ItemDAO();
        if (!"".equals(jTidProduto.getText())) {
            i.setId(Integer.parseInt(jTidProduto.getText()));
        }
        i.setDescricao(jTdescricaoProduto.getText());
        jTprecoProduto.setText("0.00");
        i.setPreco(Double.parseDouble(jTprecoProduto.getText()));

        if (jTdescricaoProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Precisa colocar o item!");
                    jTprecoProduto.setText("");
        }
        
        else {
        idao.saveOrUpdate(i);
                preencherTabelaItem();
                Abas.setSelectedIndex(2);
                jTidProduto.setText("");
                jTdescricaoProduto.setText("");
                jTprecoProduto.setText("");
        }
        
    }//GEN-LAST:event_jBgravarProdutoActionPerformed

    private void jTidProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidProdutoActionPerformed

    private void jTidPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidPedidoActionPerformed

    private void jBgravarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBgravarPedidoActionPerformed

    private void jBexcluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBexcluirPedidoActionPerformed

    private void jBcancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarPedidoActionPerformed
        jTidPedido.setText("");
        jTdataPedido.setText("");
        jTclientePedido.setText("");
        jBexcluirPedido.setVisible(false);
        Abas.setSelectedIndex(4);
    }//GEN-LAST:event_jBcancelarPedidoActionPerformed

    private void jTproduto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTproduto1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTproduto1MouseClicked

    private void jBnovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoPedidoActionPerformed
        Abas.setSelectedIndex(5);
        jBexcluirPedido.setVisible(false);
    }//GEN-LAST:event_jBnovoPedidoActionPerformed

    public void preencherTabelaCliente() {
        ClienteDAO cdao = new ClienteDAO();
        List<Cliente> lista = cdao.listarTodos();
        DefaultTableModel modeloTabelaCliente = (DefaultTableModel) jTcliente.getModel();
        modeloTabelaCliente.setRowCount(0);
        for (Cliente c : lista) {
            modeloTabelaCliente.addRow(new Object[]{c.getId(), c.getNome(), c.getCpfcnpj(), c.getEndereco()});
        }
    }
    
    public void preencherTabelaItem() {
        ItemDAO idao = new ItemDAO();
        List<Item> lista = idao.listarTodos();
        DefaultTableModel modeloTabelaProduto = (DefaultTableModel) jTproduto.getModel();
        modeloTabelaProduto.setRowCount(0);
        for (Item i : lista) {
            modeloTabelaProduto.addRow(new Object[]{i.getId(), i.getDescricao(), i.getPreco()});
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
    private javax.swing.JButton jBcancelarCliente;
    private javax.swing.JButton jBcancelarPedido;
    private javax.swing.JButton jBcancelarProduto;
    private javax.swing.JButton jBexcluirCliente;
    private javax.swing.JButton jBexcluirPedido;
    private javax.swing.JButton jBexcluirProduto;
    private javax.swing.JButton jBgravarCliente;
    private javax.swing.JButton jBgravarPedido;
    private javax.swing.JButton jBgravarProduto;
    private javax.swing.JButton jBnovoCliente;
    private javax.swing.JButton jBnovoPedido;
    private javax.swing.JButton jBnovoProduto;
    private javax.swing.JFormattedTextField jFcpfcnpjCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCadastroDeItens;
    private javax.swing.JLabel jLabelCadastroDePedidos;
    private javax.swing.JLabel jLimgLupaCliente;
    private javax.swing.JLabel jLimgLupaPedido;
    private javax.swing.JLabel jLimgLupaProduto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPaneClientes;
    private javax.swing.JScrollPane jScrollPanePedidos;
    private javax.swing.JScrollPane jScrollPaneProdutos;
    private javax.swing.JTextField jTFenderecoCliente;
    private javax.swing.JTextField jTFnomeCliente;
    private javax.swing.JTable jTcliente;
    private javax.swing.JTextField jTclientePedido;
    private javax.swing.JTextField jTdataPedido;
    private javax.swing.JTextField jTdescricaoProduto;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTidPedido;
    private javax.swing.JTextField jTidProduto;
    private javax.swing.JTextField jTprecoProduto;
    private javax.swing.JTable jTproduto;
    private javax.swing.JTable jTproduto1;
    private javax.swing.JLabel jclientepedido;
    private javax.swing.JLabel jcpfcnpj;
    private javax.swing.JLabel jdatapedido;
    private javax.swing.JLabel jdescricaoproduto;
    private javax.swing.JLabel jendereco;
    private javax.swing.JLabel jid;
    private javax.swing.JLabel jidpedido;
    private javax.swing.JLabel jidproduto;
    private javax.swing.JLabel jnome;
    private javax.swing.JLabel jprecoproduto;
    private javax.swing.JLabel jtipo;
    private javax.swing.JTextField pesquisaClientes;
    private javax.swing.JTextField pesquisaPedidos;
    private javax.swing.JTextField pesquisaProdutos;
    // End of variables declaration//GEN-END:variables
}