/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ilstu;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Katie
 */
public class SearchRWindow extends javax.swing.JFrame {
	private ArrayList<Recipe> tempRecipeList;
    /**
     * Creates new form SearchRWindow
     */
    public SearchRWindow() {
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

        jPanel1 = new javax.swing.JPanel();
        searchTypeCombo = new javax.swing.JComboBox<>();
        searchChoiceLabel = new javax.swing.JLabel();
        seachField = new javax.swing.JTextField();
        rankLabel = new javax.swing.JLabel();
        rankCheckbox = new javax.swing.JCheckBox();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Favorites for one person", "Ingredients currently in the pantry", "Recipe name", "Tag descriptions" }));

        searchChoiceLabel.setText("Search based on:");
        
        rankLabel.setText("Sort by ranking:");
        
        rankCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seachField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchChoiceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rankLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rankCheckbox)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchChoiceLabel)
                    .addComponent(searchTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel)
                    .addComponent(rankCheckbox))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(seachField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
        new FoodFinderRecipeWindow(null).setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_confirmButtonActionPerformed
    	RecipeBook myBook = RecipeBook.getInstance();
    	tempRecipeList = null;

    	String selectedSearch = (String) searchTypeCombo.getSelectedItem();
    	if (selectedSearch.equals("Favorites for one person"))
    	{
    		String searchText = seachField.getText();
    		if (searchText != null)
    		{
    			int indexOfSpace = 0;
    			indexOfSpace = searchText.indexOf(' ');
    			if(indexOfSpace > 0)
    			{
    				User tempUser = new User(searchText.substring(indexOfSpace + 1), searchText.substring(0,indexOfSpace));
    				tempRecipeList = myBook.findRecipesByUser(tempUser);
    			}
    		}
    	}
    	else if (selectedSearch.equals("Ingredients currently in the pantry"))
    	{
    		tempRecipeList = new ArrayList <Recipe>();
    		Pantry myPantry = Pantry.getInstance();
    		myBook = RecipeBook.getInstance();
    		for(int i = 0; i < myBook.listRecipes().size(); i++)
    		{
    			boolean add_recipe = true;
    			for(int j = 0; j < myBook.listRecipes().get(i).getIngredients().size(); j++)
    				if (! myPantry.listIngredients().contains(myBook.listRecipes().get(i).getIngredients().get(j)))
    					add_recipe = false;
    			if(add_recipe)
    				tempRecipeList.add(myBook.listRecipes().get(i));
    		}
    	}     
    	else if (selectedSearch.equals("Recipe name"))
    	{
    		tempRecipeList = new ArrayList <Recipe>();
    		String findMe = seachField.getText();
    		myBook = RecipeBook.getInstance();
    		for(int j = 0; j < myBook.listRecipes().size(); j++)
    		{
    			String searchMe =  myBook.listRecipes().get(j).getName();
    			int searchMeLength = searchMe.length();
    			int findMeLength = findMe.length();
    			boolean foundIt = false;
    			for (int i = 0; i <= (searchMeLength - findMeLength);i++) 
    			{
    				if (searchMe.regionMatches(i, findMe, 0, findMeLength)) 
    				{
    					foundIt = true;
    				}
    			}
    			if(foundIt)
    				tempRecipeList.add(myBook.listRecipes().get(j));
    		}

    	}   
    	else if (selectedSearch.equals( "Tag descriptions"))
    	{
    		tempRecipeList = new ArrayList <Recipe>();
    		String findMe = seachField.getText();
    		myBook = RecipeBook.getInstance();
    		for(int j = 0; j < myBook.listRecipes().size(); j++)
    		{
    			boolean foundIt = false;
    			for(int k = 0; k < myBook.listRecipes().get(j).getTags().size(); k++)
    			{
    				String searchMe =  myBook.listRecipes().get(j).getTags().get(k).getDesc();
    				int searchMeLength = searchMe.length();
    				int findMeLength = findMe.length();
    				for (int i = 0; i <= (searchMeLength - findMeLength); i++) 
    				{
    					if (searchMe.regionMatches(i, findMe, 0, findMeLength)) 
    					{
    						foundIt = true;
    					}
    				}
    				if((foundIt) && !(tempRecipeList.contains(myBook.listRecipes().get(j))))
    					tempRecipeList.add(myBook.listRecipes().get(j));
    			}
    		}
    	}
    	if (rankCheckbox.isSelected())
			Collections.sort(tempRecipeList);
    	this.dispose();
    	new FoodFinderRecipeWindow(tempRecipeList).setVisible(true);	
  
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void rankCheckboxActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	// TODO add your handling code here:
    } 

    /**
     * @param args the command line arguments
     */
    public static void mainTemp(String args[]) {
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
            java.util.logging.Logger.getLogger(SearchRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox rankCheckbox;
    private javax.swing.JLabel rankLabel;
    private javax.swing.JTextField seachField;
    private javax.swing.JLabel searchChoiceLabel;
    private javax.swing.JComboBox<String> searchTypeCombo;
    // End of variables declaration//GEN-END:variables
}
