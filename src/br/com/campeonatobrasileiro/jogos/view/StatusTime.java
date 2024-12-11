package br.com.campeonatobrasileiro.jogos.view;

import br.com.campeonatobrasileiro.jogos.model.Time;
import br.com.campeonatobrasileiro.jogos.model.Torneio;
import static br.com.campeonatobrasileiro.jogos.model.Torneio.listaEquipes;
import java.awt.Color;
import java.util.Arrays;

public class StatusTime extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public StatusTime() {
        initComponents();
        setExtendedState(NORMAL);
        Color col = new Color(25, 28, 97);
        getContentPane().setBackground(col);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnTelaCadastrar5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbApresentacaoTime = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nomeTime = new javax.swing.JLabel();
        anoFundacao = new javax.swing.JLabel();
        cidadeNatal = new javax.swing.JLabel();
        qtdVitorias = new javax.swing.JLabel();
        qtdEmpates = new javax.swing.JLabel();
        qtdDerrotas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(25, 30, 99));

        jPanel2.setBackground(new java.awt.Color(25, 30, 99));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(25, 30, 99));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/campeonatobrasileiro/jogos/images/Logo 60x70.png"))); // NOI18N

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 254, 1));
        jLabel5.setText("Apresentação Times");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnTelaCadastrar5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(42, 42, 42))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(225, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(210, 210, 210)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnTelaCadastrar5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(199, 254, 1));
        jLabel2.setText("Escolha o time");

        javax.swing.DefaultComboBoxModel model = new javax.swing.DefaultComboBoxModel();

        model.addElement("Selecione");

        if (Torneio.listaEquipes != null) {
            for (Time time : Torneio.listaEquipes) {
                model.addElement(time); // Adiciona o objeto Time diretamente ao modelo
            }
        }
        cbApresentacaoTime.setModel(model);
        cbApresentacaoTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbApresentacaoTimeActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(199, 254, 1));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(199, 254, 1));
        jLabel3.setText("O grande:");

        jLabel6.setBackground(new java.awt.Color(199, 254, 1));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(199, 254, 1));
        jLabel6.setText("Vitórias:");

        jLabel7.setBackground(new java.awt.Color(199, 254, 1));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 254, 1));
        jLabel7.setText("Diretamente de:");

        jLabel8.setBackground(new java.awt.Color(199, 254, 1));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(199, 254, 1));
        jLabel8.setText("Desde de:");

        jLabel9.setBackground(new java.awt.Color(199, 254, 1));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(199, 254, 1));
        jLabel9.setText("Empates:");

        jLabel10.setBackground(new java.awt.Color(199, 254, 1));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(199, 254, 1));
        jLabel10.setText("Derrotas:");

        nomeTime.setBackground(new java.awt.Color(199, 254, 1));
        nomeTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomeTime.setForeground(new java.awt.Color(255, 255, 255));

        anoFundacao.setBackground(new java.awt.Color(199, 254, 1));
        anoFundacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        anoFundacao.setForeground(new java.awt.Color(255, 255, 255));

        cidadeNatal.setBackground(new java.awt.Color(199, 254, 1));
        cidadeNatal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cidadeNatal.setForeground(new java.awt.Color(255, 255, 255));

        qtdVitorias.setBackground(new java.awt.Color(199, 254, 1));
        qtdVitorias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qtdVitorias.setForeground(new java.awt.Color(255, 255, 255));

        qtdEmpates.setBackground(new java.awt.Color(199, 254, 1));
        qtdEmpates.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qtdEmpates.setForeground(new java.awt.Color(255, 255, 255));

        qtdDerrotas.setBackground(new java.awt.Color(199, 254, 1));
        qtdDerrotas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qtdDerrotas.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(cbApresentacaoTime, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtdVitorias)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtdEmpates)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtdDerrotas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeTime))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cidadeNatal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anoFundacao)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbApresentacaoTime, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeTime))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cidadeNatal))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(anoFundacao))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(qtdVitorias)
                    .addComponent(qtdEmpates)
                    .addComponent(qtdDerrotas))
                .addGap(58, 58, 58)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTelaCadastrar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastrar5ActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);

    }//GEN-LAST:event_btnTelaCadastrar5ActionPerformed

    private void cbApresentacaoTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbApresentacaoTimeActionPerformed
        Time selecionado = (Time) cbApresentacaoTime.getSelectedItem();
        nomeTime.setText(selecionado.getNome());
        anoFundacao.setText(Integer.toString(selecionado.getAno_fundacao()));
        cidadeNatal.setText(selecionado.getCidade());
        qtdDerrotas.setText(Integer.toString(selecionado.getDerrotas()));
        qtdEmpates.setText(Integer.toString(selecionado.getEmpates()));
        qtdVitorias.setText(Integer.toString(selecionado.getVitorias()));
        
    }//GEN-LAST:event_cbApresentacaoTimeActionPerformed

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
            java.util.logging.Logger.getLogger(StatusTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new StatusTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anoFundacao;
    private javax.swing.JButton btnTelaCadastrar5;
    private javax.swing.JComboBox<String> cbApresentacaoTime;
    private javax.swing.JLabel cidadeNatal;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nomeTime;
    private javax.swing.JLabel qtdDerrotas;
    private javax.swing.JLabel qtdEmpates;
    private javax.swing.JLabel qtdVitorias;
    // End of variables declaration//GEN-END:variables
}
