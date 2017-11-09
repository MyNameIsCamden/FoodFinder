package temporaryGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

import edu.ilstu.Ingredient;

public class FakeRedundant extends JPanel
{
	
	JTextField ingredientName;
	JTextField ingredientAmount;
	//JTextField ingredientConversionRate;
	JTextField homeAmount;
	//JTextField commercialAmount;
	Ingredient ing;
	
	public FakeRedundant()
	{
		add(new JTextArea("It looks like you're attempting to add a recipe \nyou already have! Would you still like to?"));
  		add(new JButton("Add new recipe"));
  		add(new JButton("Replace old recipe"));
  		add(new JButton("Cancel"));
	}
	
	public Ingredient addIngredient()
	{
  		return ing;
	}
	
	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Redundant Recipe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        FakeRedundant newContentPane = new FakeRedundant();
        //newContentPane.setOpaque(true); //content panes must be opaque
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