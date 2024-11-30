package br.com.campeonatobrasileiro.jogos.view;

import br.com.campeonatobrasileiro.jogos.model.Time;
import br.com.campeonatobrasileiro.jogos.model.Torneio;
import java.awt.Color;
import java.util.ArrayList;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setExtendedState(NORMAL);
        Color col = new Color(25, 28, 97);
        getContentPane().setBackground(col);

        Torneio torneio = new Torneio();

        if (Torneio.listaEquipes == null) {
            Torneio.listaEquipes = new ArrayList<>();
            Time time1 = new Time("aaa", "a", "SP", 2, 5, 2, 3, 2);
            Time time2 = new Time("bbb", "b", "SP", 3, 4, 3, 2, 3);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btCampeonato = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btCadastroTimes = new javax.swing.JButton();
        btCadastroJogos = new javax.swing.JButton();
        btStatusTmimes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(25, 30, 99));

        jPanel1.setBackground(new java.awt.Color(25, 30, 99));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(199, 254, 1));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSair.setBackground(new java.awt.Color(199, 254, 1));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(25, 30, 99));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btCampeonato.setBackground(new java.awt.Color(199, 254, 1));
        btCampeonato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCampeonato.setForeground(new java.awt.Color(25, 30, 99));
        btCampeonato.setText("Campeonato");
        btCampeonato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCampeonatoMouseClicked(evt);
            }
        });
        btCampeonato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCampeonatoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(25, 30, 99));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/campeonatobrasileiro/jogos/images/Logo 200x verde.png"))); // NOI18N

        btCadastroTimes.setBackground(new java.awt.Color(199, 254, 1));
        btCadastroTimes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastroTimes.setForeground(new java.awt.Color(25, 30, 99));
        btCadastroTimes.setText("Cadastrar Times");
        btCadastroTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroTimesActionPerformed(evt);
            }
        });

        btCadastroJogos.setBackground(new java.awt.Color(199, 254, 1));
        btCadastroJogos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastroJogos.setForeground(new java.awt.Color(25, 30, 99));
        btCadastroJogos.setText("Reportar Resultados");
        btCadastroJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroJogosActionPerformed(evt);
            }
        });

        btStatusTmimes.setBackground(new java.awt.Color(199, 254, 1));
        btStatusTmimes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btStatusTmimes.setForeground(new java.awt.Color(25, 30, 99));
        btStatusTmimes.setText("Times");
        btStatusTmimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStatusTmimesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btCampeonato, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastroTimes, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btStatusTmimes, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastroJogos, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCampeonato)
                    .addComponent(btStatusTmimes)
                    .addComponent(btCadastroJogos)
                    .addComponent(btCadastroTimes))
                .addGap(32, 32, 32)
                .addComponent(btnSair)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btCampeonatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCampeonatoActionPerformed
        this.setVisible(false);
        ViewCampeonato vc = new ViewCampeonato();
        vc.setVisible(true);
    }//GEN-LAST:event_btCampeonatoActionPerformed

    private void btCadastroTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroTimesActionPerformed
        this.setVisible(false);
        CadastroTimes ct = new CadastroTimes();
        ct.setVisible(true);
    }//GEN-LAST:event_btCadastroTimesActionPerformed

    private void btCadastroJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroJogosActionPerformed
        this.setVisible(false);
        ReportarResultados rr = new ReportarResultados();
        rr.setVisible(true);
    }//GEN-LAST:event_btCadastroJogosActionPerformed

    private void btStatusTmimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStatusTmimesActionPerformed
        this.setVisible(false);
        StatusTime st = new StatusTime();
        st.setVisible(true);
    }//GEN-LAST:event_btStatusTmimesActionPerformed

    private void btCampeonatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCampeonatoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btCampeonatoMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastroJogos;
    private javax.swing.JButton btCadastroTimes;
    private javax.swing.JButton btCampeonato;
    private javax.swing.JButton btStatusTmimes;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
