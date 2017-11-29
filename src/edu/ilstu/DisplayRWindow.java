/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ilstu;

/**
 *
 * @author Katie
 */

import javax.swing.JOptionPane;

public class DisplayRWindow extends javax.swing.JFrame {
private Recipe tempRecipe = null;
private String recName = "";
    /**
     * Creates new form DisplayRWindow
     */
    public DisplayRWindow(Recipe inRecipe) {
    	this.tempRecipe = inRecipe;
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
    	if (tempRecipe != null)
    		recName = tempRecipe.getName();
        closeButton = new javax.swing.JButton();
        ingrPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ingrTextPane = new javax.swing.JTextPane();
        instrPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        instrTextPane = new javax.swing.JTextPane();
        recMadeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(recName);
        closeButton.setText("Close");
        if(tempRecipe != null)
        {
          instrTextPane.setText(tempRecipe.displayInstructions());
          instrTextPane.setText(tempRecipe.displayInstructions());
        }
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        ingrPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingredients"));

        jScrollPane3.setHorizontalScrollBar(null);

        ingrTextPane.setOpaque(false);
        jScrollPane3.setViewportView(ingrTextPane);

        javax.swing.GroupLayout ingrPanelLayout = new javax.swing.GroupLayout(ingrPanel);
        ingrPanel.setLayout(ingrPanelLayout);
        ingrPanelLayout.setHorizontalGroup(
            ingrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        ingrPanelLayout.setVerticalGroup(
            ingrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingrPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        instrPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Instructions"));

        instrTextPane.setOpaque(false);
        jScrollPane5.setViewportView(instrTextPane);

        javax.swing.GroupLayout instrPanelLayout = new javax.swing.GroupLayout(instrPanel);
        instrPanel.setLayout(instrPanelLayout);
        instrPanelLayout.setHorizontalGroup(
            instrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        instrPanelLayout.setVerticalGroup(
            instrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        recMadeButton.setText("I made this recipe.");
        recMadeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recMadeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(recMadeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeButton))
                    .addComponent(ingrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ingrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(recMadeButton))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
        new FoodFinderRecipeWindow().setVisible(true);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void recMadeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recMadeButtonActionPerformed
        
        //code for removeing ingrs from pantry
    	tempRecipe.makeRecipe();
        JOptionPane.showMessageDialog(null, "Ingredients from pantry removed for recipe. " + "Check your pantry for the updated amounts" ,"Recipe Made", JOptionPane.INFORMATION_MESSAGE);
        
        this.dispose(); 
        new FoodFinderRecipeWindow().setVisible(true);
    }//GEN-LAST:event_recMadeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayRWindow(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel ingrPanel;
    private javax.swing.JTextPane ingrTextPane;
    private javax.swing.JPanel instrPanel;
    private javax.swing.JTextPane instrTextPane;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton recMadeButton;
    // End of variables declaration//GEN-END:variables
}
