package temporaryGUI;

import java.awt.Button;
import java.awt.Dimension;
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

import edu.ilstu.*;

public class RecipeWindow extends JPanel implements ActionListener
{
	JButton addRecipeButton;
	JButton goBackButton;
	ArrayList<Recipe> book;
	JList<Recipe> list;
	
	public RecipeWindow()
	{
		setLayout(new FlowLayout());
		
		book = new ArrayList<Recipe>();
		
		addRecipeButton = new JButton("Add a new Recipe");
		addRecipeButton.setActionCommand("add recipe");
		addRecipeButton.setPreferredSize(new Dimension(200,200));
		
		goBackButton = new JButton("Go Back");
		goBackButton.setActionCommand("quit");
		goBackButton.setPreferredSize(new Dimension(200,200));
		
		list = new JList<Recipe>();
		
		
		add(addRecipeButton);
		add(goBackButton);
		add(new JLabel("Recipe list"));
		add(list);
	}
	
	public RecipeWindow(RecipeBook book)
	{
		this.book = book.getList();
		setLayout(new FlowLayout());
		
		addRecipeButton = new JButton("Add a new Recipe");
		addRecipeButton.setActionCommand("add recipe");
		addRecipeButton.setPreferredSize(new Dimension(200,200));
		
		goBackButton = new JButton("Go Back");
		goBackButton.setActionCommand("quit");
		goBackButton.setPreferredSize(new Dimension(200,200));
		
		list = new JList<Recipe>((Recipe[]) book.getList().toArray());
		
		add(addRecipeButton);
		add(goBackButton);	
	}
	
	public static void main (String args[])
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
	
	private static void createAndShowGUI() {
		//Create and set up the window.
        JFrame frame = new JFrame("Recipe Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        RecipeWindow newContentPane = new RecipeWindow();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

	public RecipeBook getRecipeBook()
	{
		return new RecipeBook(book);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if("add recipe".equals(ae.getActionCommand()))
		{
			RecipeAddDialog rad = new RecipeAddDialog();
			book.add(rad.getRecipe());
			list = new JList<Recipe>((Recipe[]) book.toArray());
		}
		
		if("quit".equals(ae.getActionCommand()))
		{
			System.exit(0);
		}
	}
}