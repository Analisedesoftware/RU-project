/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Interface.Principal.mainInstance;

/**
 *
 * @author Damaris tomas mateus
 */
public class PassarACarteirinhaCreditos extends javax.swing.JPanel {

    /**
     * Creates new form PassarACarteirinhaCreditos
     */
    public PassarACarteirinhaCreditos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jDialog1.setLocation(new java.awt.Point(500, 250));
        jDialog1.setSize(new java.awt.Dimension(360, 180));
        jDialog1.getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel8.setText("Digite sua senha:");
        jDialog1.getContentPane().add(jLabel8);
        jLabel8.setBounds(84, 11, 156, 25);

        jPasswordField1.setText("123");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(106, 54, 130, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Untitled-2 - Copia.png"))); // NOI18N
        jDialog1.getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 370, 140);

        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ou digite o codigo da carteirinha:");
        add(jLabel3);
        jLabel3.setBounds(200, 430, 300, 25);

        jTextField1.setText("10159842");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(500, 430, 145, 25);
        add(jLabel1);
        jLabel1.setBounds(309, 144, 0, 0);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Passe a Carteirinha no leitor");
        add(jLabel2);
        jLabel2.setBounds(260, 70, 250, 26);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(0, 0, 100, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagen-animada-Codigo-de-Barras-08.gif"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(280, 190, 201, 124);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo Geral.jpg"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(753, 552));
        add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        jDialog1.setVisible(false);
        mainInstance.mostrarCarta("card7");
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainInstance.mostrarCarta("card2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        mainInstance.carteirinhatmp = Integer.parseInt(jTextField1.getText());
        System.out.println("carteirinha escolhida: " + mainInstance.carteirinhatmp);
        //jDialog1.setVisible(true);
        mainInstance.mostrarCarta("card7");
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
