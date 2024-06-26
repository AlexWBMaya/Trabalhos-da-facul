/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;
import modelos.ContaPoupanca;
import javax.swing.JOptionPane;

/**
 *
 * @author ejmcc
 */
public class TelaPrincipal extends javax.swing.JFrame {
    //Atributo
    ContaPoupanca conta = null;
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTextArea1.setEnabled(false);
        jTextField_Valor.setEnabled(false);
        jButton_Depositar.setEnabled(false);
        jButton_EmitirSaldo.setEnabled(false);
        jButton_Sacar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_NomeCompleto = new javax.swing.JTextField();
        jTextField_Agencia = new javax.swing.JTextField();
        jTextField_NumeroDaConta = new javax.swing.JTextField();
        jTextField_Saldo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton_CriarConta = new javax.swing.JButton();
        jButton_EmitirSaldo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton_Sacar = new javax.swing.JButton();
        jButton_Depositar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Valor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANCO SEU DINHEIRO E MEU");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("BANCO SEU DINHEIRO E MEU");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("CONTA POUPANÇA");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("NOME COMPLETO");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("AGENCIA");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("NÚMERO DA CONTA");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("SALDO");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("APRESENTAÇÃO DOS DADOS");

        jTextField_NomeCompleto.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jTextField_NomeCompleto.setForeground(new java.awt.Color(0, 204, 204));

        jTextField_Agencia.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jTextField_Agencia.setForeground(new java.awt.Color(0, 204, 204));

        jTextField_NumeroDaConta.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jTextField_NumeroDaConta.setForeground(new java.awt.Color(0, 204, 204));

        jTextField_Saldo.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jTextField_Saldo.setForeground(new java.awt.Color(0, 204, 204));
        jTextField_Saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SaldoActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(0, 255, 102));
        jScrollPane1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(102, 102, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton_CriarConta.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButton_CriarConta.setForeground(new java.awt.Color(0, 153, 153));
        jButton_CriarConta.setText("CRIAR CONTA");
        jButton_CriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CriarContaActionPerformed(evt);
            }
        });

        jButton_EmitirSaldo.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButton_EmitirSaldo.setForeground(new java.awt.Color(0, 153, 153));
        jButton_EmitirSaldo.setText("EMITIR SALDO");
        jButton_EmitirSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EmitirSaldoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton_Sacar.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButton_Sacar.setForeground(new java.awt.Color(153, 0, 51));
        jButton_Sacar.setText("SACAR");
        jButton_Sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SacarActionPerformed(evt);
            }
        });

        jButton_Depositar.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButton_Depositar.setForeground(new java.awt.Color(204, 51, 0));
        jButton_Depositar.setText("DEPOSITAR");
        jButton_Depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DepositarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 51, 0));
        jLabel8.setText("VALOR");

        jTextField_Valor.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jTextField_Valor.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton_Sacar)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jTextField_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jButton_Depositar)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton_Sacar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Depositar))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(329, 329, 329))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(387, 387, 387))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_NumeroDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(122, 122, 122)
                                        .addComponent(jTextField_Agencia, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addComponent(jButton_CriarConta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(95, 95, 95)
                                .addComponent(jButton_EmitirSaldo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Agencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_CriarConta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_NumeroDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_EmitirSaldo)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CriarContaActionPerformed
        try {
            String nome = jTextField_NomeCompleto.getText();
            int agencia = Integer.parseInt(jTextField_Agencia.getText());
            int numero = Integer.parseInt(jTextField_NumeroDaConta.getText());
            float saldo = Float.parseFloat(jTextField_Saldo.getText());
            conta = new ContaPoupanca(nome, agencia, numero, saldo);
            //Desabilita os itens
            jTextField_NomeCompleto.setEnabled(false);
            jTextField_Agencia.setEnabled(false);
            jTextField_NumeroDaConta.setEnabled(false);
            jTextField_Saldo.setEnabled(false);
            jButton_CriarConta.setEnabled(false);
            //Abilitar os itens
            jButton_Depositar.setEnabled(true);
            jButton_Sacar.setEnabled(true);
            jButton_EmitirSaldo.setEnabled(true);
            jTextField_Valor.setEnabled(true);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton_CriarContaActionPerformed

    private void jButton_SacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SacarActionPerformed
        // TODO add your handling code here:
        try {
            float valor = Float.parseFloat(jTextField_Valor.getText());
            conta.sacar(valor);
            String saida = "R$ " + conta.getSaldo();
            jTextField_Saldo.setText(saida);
            jTextField_Valor.setText("");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

    }//GEN-LAST:event_jButton_SacarActionPerformed

    private void jButton_DepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DepositarActionPerformed
        try {
            float valor = Float.parseFloat(jTextField_Valor.getText());
            conta.depositar(valor);
            String saida = "R$ " + conta.getSaldo();
            jTextField_Saldo.setText(saida);
            jTextField_Valor.setText("");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton_DepositarActionPerformed

    private void jButton_EmitirSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EmitirSaldoActionPerformed
        try {
            jTextArea1.setText(conta.emitirSaldo());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }    }//GEN-LAST:event_jButton_EmitirSaldoActionPerformed

    private void jTextField_SaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SaldoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CriarConta;
    private javax.swing.JButton jButton_Depositar;
    private javax.swing.JButton jButton_EmitirSaldo;
    private javax.swing.JButton jButton_Sacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_Agencia;
    private javax.swing.JTextField jTextField_NomeCompleto;
    private javax.swing.JTextField jTextField_NumeroDaConta;
    private javax.swing.JTextField jTextField_Saldo;
    private javax.swing.JTextField jTextField_Valor;
    // End of variables declaration//GEN-END:variables
}
