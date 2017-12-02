* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ilstu;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;


/**
 *
 * @author Katie, Heather
 */
public class AddRWindow extends javax.swing.JFrame {

	private Recipe newRecipe;
	private String RecipeName = " ";
	private ArrayList<Tags> tempListTags = null;;
	private ArrayList<User> tempListUsers = null;
    /**
     * Creates new form AddRWindow
     */
    public AddRWindow(Recipe inRecipe) {
		newRecipe = inRecipe;
    	if (newRecipe == null)
    		newRecipe = new Recipe();


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
    	ArrayList <Ingredient> ingrList = newRecipe.getIngredients();
    	String [] ingrText= new String [ingrList.size()];
        for (int i = 0; i < ingrList.size(); i++)
        {
        	ingrText [i] = ingrList.get(i).getAmount() + " " + ingrList.get(i).getConversion().returnHomeUnit() 
        			+ " " +ingrList.get(i).getName();
         }
        RecipeName = newRecipe.getName();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        namePanel = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField(RecipeName);
        instrPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        instrTextArea = new javax.swing.JTextArea();
        ingrPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ingrDisplayList = new javax.swing.JList<>(ingrText);
        removeIngrButton = new javax.swing.JButton();
        favoritePanel = new javax.swing.JPanel();
        tagField = new javax.swing.JTextField();
        addIngrButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ratingSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        tagPanel1 = new javax.swing.JPanel();
        tagField1 = new javax.swing.JTextField();
	stockLabel = new javax.swing.JLabel();
        stockCheckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        namePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Recipe Name"));

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        instrPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Instructions for Recipe"));

        instrTextArea.setColumns(20);
        instrTextArea.setRows(5);
        jScrollPane1.setViewportView(instrTextArea);

        javax.swing.GroupLayout instrPanelLayout = new javax.swing.GroupLayout(instrPanel);
        instrPanel.setLayout(instrPanelLayout);
        instrPanelLayout.setHorizontalGroup(
            instrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );
        instrPanelLayout.setVerticalGroup(
            instrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        ingrPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Current Ingredients"));

        ingrDisplayList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(ingrDisplayList);

        javax.swing.GroupLayout ingrPanelLayout = new javax.swing.GroupLayout(ingrPanel);
        ingrPanel.setLayout(ingrPanelLayout);
        ingrPanelLayout.setHorizontalGroup(
            ingrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        ingrPanelLayout.setVerticalGroup(
            ingrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        removeIngrButton.setText("Remove selected Ingredient");
        removeIngrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
 //               removeIngrButtonActionPerformed(evt);
            }
        });

        favoritePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("(Optional) Enter people who like this recipe as comma separated list, first name and last name"));
        
        tagField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout favoritePanelLayout = new javax.swing.GroupLayout(favoritePanel);
        favoritePanel.setLayout(favoritePanelLayout);
        favoritePanelLayout.setHorizontalGroup(
            favoritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tagField)
        );
        
        
        favoritePanelLayout.setVerticalGroup(
                favoritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tagField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            addIngrButton1.setText("Add an Ingredient");
            addIngrButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addIngrButton1ActionPerformed(evt);
                }
            });

            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

            ratingSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

            jLabel1.setText("Rate this Recipe(1-5): ");

        tagField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ratingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(ratingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tagPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("(Optional) Enter any tags for your recipe as a comma list."));

        tagField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tagPanel1Layout = new javax.swing.GroupLayout(tagPanel1);
        tagPanel1.setLayout(tagPanel1Layout);
        tagPanel1Layout.setHorizontalGroup(
            tagPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tagField1)
        );
        tagPanel1Layout.setVerticalGroup(
            tagPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tagField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        
	        stockLabel.setText("Always have these ingredients in stock:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeIngrButton)
                            .addComponent(addIngrButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stockLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stockCheckbox)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(instrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favoritePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tagPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(instrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ingrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addIngrButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeIngrButton))
                    .addComponent(tagPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(favoritePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmButton)
                            .addComponent(cancelButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stockLabel)
                            .addComponent(stockCheckbox))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
        new FoodFinderRecipeWindow(null).setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {
        RecipeBook myBook = RecipeBook.getInstance();
        newRecipe.setName(nameField.getText()); 
        newRecipe.setInstructions(instrTextArea.getText());
        Integer rating = (Integer) ratingSpinner.getValue(); 
        if (rating > 0)
        	newRecipe.setRating(rating);
        myBook.addRecipe(newRecipe);
        
        this.dispose();
        new FoodFinderRecipeWindow(null).setVisible(true);
        
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void addTagButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
       tempListTags = new ArrayList <Tags>();
    	String tagText = tagField1.getText();
       int indexOfComma = 0;
       indexOfComma = tagText.indexOf(',');
       Tags tempTag = new Tags(tagText.substring(indexOfComma));
       if (indexOfComma > 0)
    	   tempTag.setType(tagText.substring(0,indexOfComma));
    	tempListTags.add(tempTag);   
    }
    
    private void addFavoriteButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        tempListUsers = new ArrayList <User>();
     	String tagText = tagField.getText();
        int indexOfComma = 0;
        indexOfComma = tagText.indexOf(','); 
        User tempUser;
        if (indexOfComma > 0)
        {
        	tempUser = new User(tagText.substring(indexOfComma),tagText.substring(0,indexOfComma));
        	tempListUsers.add(tempUser);  
        }

    }
    
    private void addIngrButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIngrButtonActionPerformed
        this.dispose();
        newRecipe.setName(nameField.getText()); 
    	new AddRIngredientWindow(newRecipe).setVisible(true);
    }//GEN-LAST:event_addIngrButtonActionPerformed

    private void tagFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagFieldActionPerformed
        this.dispose();
        String tagText = tagField.getText();
        int indexOfComma = tagText.indexOf(',');
        Tags tempTag = new Tags(tagText.substring(indexOfComma));
        if(indexOfComma > 0)
        	tempTag.setType(tagText.substring(0,indexOfComma));
        newRecipe.setName(nameField.getText()); 
        new AddRTagsWindow(newRecipe).setVisible(true);
    }//GEN-LAST:event_tagFieldActionPerformed
    
    private void tagField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagField1ActionPerformed
        String tagText = tagField.getText();
        int indexOfComma = tagText.indexOf(',');
        Tags tempTag = new Tags(tagText.substring(indexOfComma));
        if(indexOfComma > 0)
        	tempTag.setType(tagText.substring(0,indexOfComma));
        newRecipe.setName(nameField.getText());
    }//GEN-LAST:event_tagField1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRWindow(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addIngrButton1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel favoritePanel;
    private javax.swing.JList<String> ingrDisplayList;
    private javax.swing.JPanel ingrPanel;
    private javax.swing.JPanel instrPanel;
    private javax.swing.JTextArea instrTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel namePanel;
    private javax.swing.JSpinner ratingSpinner;
    private javax.swing.JButton removeIngrButton;
    private javax.swing.JCheckBox stockCheckbox;
    private javax.swing.JLabel stockLabel;
    private javax.swing.JTextField tagField;
    private javax.swing.JTextField tagField1;
    private javax.swing.JPanel tagPanel1;
    // End of variables declaration//GEN-END:variables
}
