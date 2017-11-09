package temporaryGUI;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import edu.ilstu.*;

public class MainFrame extends JPanel implements ActionListener
{
	protected JButton recipeButton;
	protected JButton pantryButton;
	protected RecipeBook book;
	static JFrame frame1, frame2;
	protected ArrayList<Ingredient> ingredientList;
	
	public MainFrame()
	{
		recipeButton = new JButton("Recipes");
        recipeButton.setActionCommand("recipes");
        recipeButton.setPreferredSize(new Dimension(200, 200));
        
        pantryButton = new JButton("Pantry");
        pantryButton.setActionCommand("pantry");
        pantryButton.setPreferredSize(new Dimension(200, 200));
        
        recipeButton.addActionListener(this);
        pantryButton.addActionListener(this);
        
        add(recipeButton);
        add(pantryButton);
	}
	
	private static void createAndShowGUI() {
        //Create and set up the window.
        frame1 = new JFrame("Food Finder");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(500, 500);
        
        MainFrame contentPane = new MainFrame();
        contentPane.setOpaque(true);
        frame1.setContentPane(contentPane);

        //Display the window.
        frame1.pack();
        frame1.setVisible(true);
    }
	
	public void actionPerformed(ActionEvent ae)
	{
		if("recipes".equals(ae.getActionCommand()))
		{
			System.out.println("thing");
			RecipeWindow rw;
			
			if(book == null || book.isEmpty())
			{
				this.setVisible(false);
				rw = new RecipeWindow();
			}
			else
			{
				rw = new RecipeWindow(book);
			}
			
			book = rw.getRecipeBook();
		}
		
		else if("pantry".equals(ae.getActionCommand()))
		{
			System.out.println("thingies");
		}
	}
	
	public static void main(String args[])
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
}
