package temporaryGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

import edu.ilstu.Ingredient;

public class IngredientAddDialog extends JDialog
{
	
	JTextField ingredientName;
	JTextField ingredientAmount;
	JTextField homeAmount;
	Ingredient ing;
	
	public IngredientAddDialog()
	{
		ingredientName = new JTextField(15);
		ingredientAmount = new JTextField(5);
		homeAmount = new JTextField(5);
  
		setLayout(new FlowLayout());
		
		add(new JLabel("Ingredient Name"));
		add(ingredientName);
		add(Box.createHorizontalStrut(15)); // a spacer
		
		add(new JLabel("Ingredient Amount"));
	  	add(ingredientAmount);
	  	add(Box.createHorizontalStrut(15)); // a spacer
	  	
	  	add(new JLabel("Unit of measurement"));
	  	add(homeAmount);
	  	
  		int result = JOptionPane.showConfirmDialog(null, this,
		  	"Please enter ingredient information", JOptionPane.OK_CANCEL_OPTION);
  		if (result == JOptionPane.OK_OPTION)
  		
  		{
	  	ing = new Ingredient(ingredientName.getText(), Double.parseDouble(ingredientAmount.getText()),
	  			homeAmount.getText());
  		}
	}
	
	public Ingredient addIngredient()
	{
  		return ing;
	}
	
	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Add a new Ingredient");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        IngredientAddDialog newContentPane = new IngredientAddDialog();
                frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
	
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
}