/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tela;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import classe.ClassePoupanca;

/**
 *
 * @author Alex
 */
public class TelaInternaPoupanca extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaInternaPoupanca
     */
    
    //atributo
    ClassePoupanca conta1 = null;
    
    public TelaInternaPoupanca() {
        initComponents();
        //Inicia o menu com a segunda parte desabilitada
        textFieldDeposito.setEnabled(false);
        botaoSacar.setEnabled(false);
        botaoDepositar.setEnabled(false);
        botaoEmitirSaldo.setEnabled(false);
        jTextArea1.setEnabled(false);
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
        textFieldNomeCompletoP = new javax.swing.JTextField();
        textFieldNumerodaContaP = new javax.swing.JTextField();
        textFieldAgenciaP = new javax.swing.JTextField();
        textFieldSaldo = new javax.swing.JTextField();
        botaoSacar = new javax.swing.JButton();
        botaoDepositar = new javax.swing.JButton();
        textFieldDeposito = new javax.swing.JTextField();
        botaoEmitirSaldo = new javax.swing.JButton();
        botaoCriarConta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Poupança");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Nome Completo");

        jLabel3.setText("Número da Conta");

        jLabel4.setText("Agência");

        jLabel5.setText("Saldo;");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textFieldNomeCompletoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeCompletoPActionPerformed(evt);
            }
        });

        textFieldSaldo.setText("0,0");
        textFieldSaldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textFieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSaldoActionPerformed(evt);
            }
        });

        botaoSacar.setText("Depositar");
        botaoSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSacarActionPerformed(evt);
            }
        });

        botaoDepositar.setText("Sacar");
        botaoDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDepositarActionPerformed(evt);
            }
        });

        botaoEmitirSaldo.setText("Emitir Saldo");
        botaoEmitirSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEmitirSaldoActionPerformed(evt);
            }
        });

        botaoCriarConta.setText("CriarConta");
        botaoCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarContaActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(textFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldDeposito, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoSacar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoDepositar))
                            .addComponent(textFieldNomeCompletoP)
                            .addComponent(textFieldNumerodaContaP)
                            .addComponent(textFieldAgenciaP)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(botaoCriarConta))
                            .addComponent(jScrollPane1))))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoEmitirSaldo)
                .addGap(272, 272, 272))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldNomeCompletoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldNumerodaContaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldAgenciaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCriarConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSacar)
                    .addComponent(botaoDepositar))
                .addGap(18, 18, 18)
                .addComponent(botaoEmitirSaldo)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNomeCompletoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeCompletoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeCompletoPActionPerformed

    private void textFieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSaldoActionPerformed

    private void botaoCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarContaActionPerformed
        // TODO add your handling code here:
        try {
        String nome = textFieldNomeCompletoP.getText();
        int numeroDaConta = Integer.parseInt(textFieldNumerodaContaP.getText());
        int agencia = Integer.parseInt(textFieldAgenciaP.getText());
        float saldo = Float.parseFloat(textFieldSaldo.getText());
        
        conta1 = new ClassePoupanca(nome, numeroDaConta, agencia, saldo);
        
        // Habilita a segunda parte do menu
        textFieldDeposito.setEnabled(true);
        botaoSacar.setEnabled(true);
        botaoDepositar.setEnabled(true);
        botaoEmitirSaldo.setEnabled(true);
        jTextArea1.setEnabled(true);
        
        // Desabilita a primeira parte do menu
        jLabel2.setEnabled(false);
        jLabel3.setEnabled(false);
        jLabel4.setEnabled(false);
        jLabel5.setEnabled(false);
        textFieldNumerodaContaP.setEnabled(false);
        textFieldNomeCompletoP.setEnabled(false);
        textFieldAgenciaP.setEnabled(false);
        textFieldSaldo.setEnabled(false);
        botaoCriarConta.setEnabled(false);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_botaoCriarContaActionPerformed

    private void botaoEmitirSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEmitirSaldoActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(conta1.emitirSaldo());
    }//GEN-LAST:event_botaoEmitirSaldoActionPerformed

    private void botaoSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSacarActionPerformed
        // TODO add your handling code here:
        try {
            float valor = Float.parseFloat(textFieldDeposito.getText());
            conta1.depositar(valor);
            String saida = "R$ " + conta1.getSaldo();
            textFieldSaldo.setText(saida);
            textFieldDeposito.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_botaoSacarActionPerformed

    private void botaoDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDepositarActionPerformed
        // TODO add your handling code here:
        try{
        float valor = Float.parseFloat(textFieldDeposito.getText());
        conta1.sacar(valor);
        String saida = "R$ " + conta1.getSaldo();
        textFieldSaldo.setText(saida);
        textFieldDeposito.setText("");
        
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_botaoDepositarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriarConta;
    private javax.swing.JButton botaoDepositar;
    private javax.swing.JButton botaoEmitirSaldo;
    private javax.swing.JButton botaoSacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField textFieldAgenciaP;
    private javax.swing.JTextField textFieldDeposito;
    private javax.swing.JTextField textFieldNomeCompletoP;
    private javax.swing.JTextField textFieldNumerodaContaP;
    private javax.swing.JTextField textFieldSaldo;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
