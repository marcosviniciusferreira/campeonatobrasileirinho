package br.com.campeonatobrasileiro.jogos.view;

import br.com.campeonatobrasileiro.jogos.model.Time;
import br.com.campeonatobrasileiro.jogos.model.Torneio;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ViewCampeonato extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public ViewCampeonato() {
        setExtendedState(NORMAL);
        initComponents();
        Color col = new Color(25, 28, 97);
        getContentPane().setBackground(col);
        
        DefaultTableModel model = (DefaultTableModel) tblCampeonato.getModel();

        // Inicializar listaEquipes se estiver nula
        if (Torneio.listaEquipes == null) {
            Torneio.listaEquipes = new ArrayList<>();
        }

        // Preencher a tabela apenas se lis+taEquipes não estiver vazia
        for (int time = 0; time < Torneio.listaEquipes.size(); time++) {
            model.addRow(new Object[]{
                Torneio.listaEquipes.get(time).getNome(),
                Torneio.listaEquipes.get(time).getPontos(),
                Torneio.listaEquipes.get(time).getJogos(),
                Torneio.listaEquipes.get(time).getVitorias(),
                Torneio.listaEquipes.get(time).getEmpates(),
                Torneio.listaEquipes.get(time).getDerrotas(),});
        }

        Negrito(tblCampeonato);
        OrdenaPorPontos(tblCampeonato);
    }

    public void Negrito(JTable table) {
        int columnIndex = 1; // Índice da coluna "Pontos" (baseado no modelo da tabela)
        table.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Aplica o estilo em negrito apenas para a coluna "Pontos"
                c.setFont(c.getFont().deriveFont(Font.BOLD));

                return c;
            }
        });
    }

    public void OrdenaPorPontos(JTable table) {
        // Ordenar listaEquipes pela coluna "pontos" em ordem decrescente
        Collections.sort(Torneio.listaEquipes, new Comparator<Time>() {
            @Override
            public int compare(Time t1, Time t2) {
                return Integer.compare(t2.getPontos(), t1.getPontos()); // Ordem decrescente
            }
        });

        // Obter o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Limpar a tabela antes de adicionar os dados ordenados
        model.setRowCount(0);

        // Preencher a tabela com os dados ordenados
        for (Time time : Torneio.listaEquipes) {
            model.addRow(new Object[]{
                time.getNome(),
                time.getPontos(),
                time.getJogos(),
                time.getVitorias(),
                time.getEmpates(),
                time.getDerrotas()
            });
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTelaCadastrar5 = new javax.swing.JButton();
        btnTelaCadastrar1 = new javax.swing.JButton();
        btnTelaCadastrar2 = new javax.swing.JButton();
        btnTelaCadastrar3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCampeonato = new javax.swing.JTable();
        btCriarNovoTorneio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(25, 30, 99));

        jPanel1.setBackground(new java.awt.Color(25, 30, 99));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(199, 254, 1));
        jLabel1.setText("CAMPEONATO");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/campeonatobrasileiro/jogos/images/Logo 60x70.png"))); // NOI18N

        btnTelaCadastrar5.setBackground(new java.awt.Color(25, 30, 99));
        btnTelaCadastrar5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTelaCadastrar5.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaCadastrar5.setText("Voltar");
        btnTelaCadastrar5.setPreferredSize(new java.awt.Dimension(122, 27));
        btnTelaCadastrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastrar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnTelaCadastrar5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnTelaCadastrar5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTelaCadastrar1.setBackground(new java.awt.Color(199, 254, 1));
        btnTelaCadastrar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTelaCadastrar1.setForeground(new java.awt.Color(25, 30, 99));
        btnTelaCadastrar1.setText("Cadastrar Times");
        btnTelaCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastrar1ActionPerformed(evt);
            }
        });

        btnTelaCadastrar2.setBackground(new java.awt.Color(199, 254, 1));
        btnTelaCadastrar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTelaCadastrar2.setForeground(new java.awt.Color(25, 30, 99));
        btnTelaCadastrar2.setText("Cadastrar Resultados");
        btnTelaCadastrar2.setPreferredSize(new java.awt.Dimension(122, 27));
        btnTelaCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastrar2ActionPerformed(evt);
            }
        });

        btnTelaCadastrar3.setBackground(new java.awt.Color(199, 254, 1));
        btnTelaCadastrar3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTelaCadastrar3.setForeground(new java.awt.Color(25, 30, 99));
        btnTelaCadastrar3.setText("Times");
        btnTelaCadastrar3.setMaximumSize(new java.awt.Dimension(122, 27));
        btnTelaCadastrar3.setPreferredSize(new java.awt.Dimension(122, 27));
        btnTelaCadastrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastrar3ActionPerformed(evt);
            }
        });

        tblCampeonato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Pontos", "Jogos", "Vitórias", "Empates", "Derrotas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCampeonato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCampeonatoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCampeonato);

        btCriarNovoTorneio.setBackground(new java.awt.Color(255, 255, 255));
        btCriarNovoTorneio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCriarNovoTorneio.setForeground(new java.awt.Color(25, 30, 99));
        btCriarNovoTorneio.setText("Novo Torneio");
        btCriarNovoTorneio.setPreferredSize(new java.awt.Dimension(122, 27));
        btCriarNovoTorneio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarNovoTorneioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTelaCadastrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(btnTelaCadastrar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTelaCadastrar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCriarNovoTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnTelaCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTelaCadastrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTelaCadastrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btCriarNovoTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTelaCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastrar1ActionPerformed
        CadastroTimes ct = new CadastroTimes();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTelaCadastrar1ActionPerformed

    private void btnTelaCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTelaCadastrar2ActionPerformed

    private void btnTelaCadastrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastrar3ActionPerformed
        StatusTime st = new StatusTime();
        st.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnTelaCadastrar3ActionPerformed

    private void tblCampeonatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCampeonatoMouseClicked

    }//GEN-LAST:event_tblCampeonatoMouseClicked

    private void btCriarNovoTorneioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarNovoTorneioActionPerformed
        NovoTorneio torneio1 = new NovoTorneio();
        torneio1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCriarNovoTorneioActionPerformed

    private void btnTelaCadastrar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastrar5ActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnTelaCadastrar5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCampeonato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriarNovoTorneio;
    private javax.swing.JButton btnTelaCadastrar1;
    private javax.swing.JButton btnTelaCadastrar2;
    private javax.swing.JButton btnTelaCadastrar3;
    private javax.swing.JButton btnTelaCadastrar5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCampeonato;
    // End of variables declaration//GEN-END:variables
}
