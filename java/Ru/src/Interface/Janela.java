/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import BandodeDados.*;
import ru.*;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Tomás Abril
 */

public class Janela extends javax.swing.JFrame {

    public CardLayout card;
    public static Janela instance;
    
    /** Creates new form Janela */
    public Janela() {
        preInitComponents();
        initComponents();
        posInitComponents();
                
        card = (CardLayout)(panelMaster.getLayout());
        card.show(panelMaster, "card1");

    }
    
    private void preInitComponents() {
        panel1 = new Interface.Principal(this);
        panel2 = new Interface.TelaAtendente(this);
        panel3 = new Interface.TelaCliente();
        panel4 = new Interface.PassarACarteirinha();
        panel5 = new Interface.CadastroAtendente();
        panel6 = new Interface.CadastroClientePeloAtendente(this);
        panel7 = new Interface.InserirCreditosAtendente();
        panel8 = new Interface.PassarACarteirinhaCreditos();
        panel9 = new Interface.Compra();
        panel10 = new Interface.PassarACarteirinhaCompra();
        panel11 = new Interface.PassarACarteirinhaCadastro();
        panel12 = new Interface.CadastroClientePeloCliente();
        panel13 = new Interface.PassarCarteirinhaCreditosCliente();
        panel14 = new Interface.InserirCreditosCliente();
    }
    
    private void posInitComponents() {
        //panelMaster.setLayout(new java.awt.CardLayout());
        panelMaster.add(panel1, "card1");
        panelMaster.add(panel2, "card2");
        panelMaster.add(panel3, "card3");
        panelMaster.add(panel4, "card4");
        panelMaster.add(panel5, "card5");
        panelMaster.add(panel6, "card6");
        panelMaster.add(panel7, "card7");
        panelMaster.add(panel8, "card8");
        panelMaster.add(panel9, "card9");
        panelMaster.add(panel10, "card10");
        panelMaster.add(panel11, "card11");
        panelMaster.add(panel12, "card12");
        panelMaster.add(panel13, "card13");
        panelMaster.add(panel14, "card14");
        
        pack();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMaster = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante Universitario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(700, 500));

        panelMaster.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            //por padrao ele usava tema nimbus
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            // usar tema do sistema
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                instance = new Janela();
                instance.setVisible(true);
            }
        });
    }
    
    
    public void mostrarCarta(String carta) {
        try {
            card.show(panelMaster, carta);
        } catch (Exception e) {
            System.out.println("erro muda carta" + e.toString());
        }

    }
    public void testeTexto(String text){
        System.out.println(text);
    }
    
    public static Janela getInstance() {
        return instance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMaster;
    // End of variables declaration//GEN-END:variables

    private Interface.Principal panel1;
    private Interface.TelaAtendente panel2;
    private Interface.TelaCliente panel3;
    private Interface.PassarACarteirinha panel4;
    private Interface.CadastroAtendente panel5;
    private Interface.CadastroClientePeloAtendente panel6;
    private Interface.InserirCreditosAtendente panel7;
    private Interface.PassarACarteirinhaCreditos panel8;
    private Interface.Compra panel9;
    private Interface.PassarACarteirinhaCompra panel10;
    private Interface.PassarACarteirinhaCadastro panel11;
    private Interface.CadastroClientePeloCliente panel12;
    private Interface.PassarCarteirinhaCreditosCliente panel13;
    private Interface.InserirCreditosCliente panel14;
}
