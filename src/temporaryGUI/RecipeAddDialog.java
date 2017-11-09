package temporaryGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import edu.ilstu.*;

public class RecipeAddDialog extends JPanel implements ActionListener
{
	Recipe recipe;
	JTextField name;
	JTextArea instructions;
	JButton addIngredient;
	JList<Ingredient> list;
	
	ArrayList<Ingredient> ingredientList;
	
	
	public RecipeAddDialog()
	{
		setLayout(new FlowLayout());
		
		name = new JTextField(20);
		name.setText("Recipe Name");
		
		//ingredientList.add(new Ingredient("Egg", 1, "N/A"));
		
		instructions = new JTextArea(40,20);
		instructions.setWrapStyleWord(true);
		instructions.setLineWrap(true);
		instructions.setText("Your recipe instructions");

		addIngredient = new JButton("Add Ingredient");
		addIngredient.setActionCommand("ingredient");
		
		list = new JList<Ingredient>();
		
		add(name);
		add(instructions);
		add(new JLabel("Ingredient List"));
		add(list);
		add(addIngredient);
		
		
		int result = JOptionPane.showConfirmDialog(null,this, 
			  	"Please enter ingredient information", JOptionPane.OK_CANCEL_OPTION);
	  		if (result == JOptionPane.OK_OPTION)
	  		{
	  			recipe = new Recipe(name.getText());
	  			recipe.setIngredients(ingredientList);
	  			recipe.setInstructions(instructions.getText());
	  		}
	  	System.exit(0);
	}
	
	
	
	public Recipe getRecipe()
	{
		return recipe;
	}
	
	public static void main(String args[])
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
	
	private static void createAndShowGUI() {
		//Create and set up the window.
        JFrame frame = new JFrame("Add a new Recipe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        RecipeAddDialog newContentPane = new RecipeAddDialog();
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
	
	public void actionPerformed(ActionEvent ae)
	{
		if("ingredient".equals(ae.getActionCommand()))
		{
			IngredientAddDialog iad = new IngredientAddDialog();
			ingredientList.add(iad.addIngredient());
			list = new JList<Ingredient>((Ingredient[]) ingredientList.toArray());
		}
	}
}
