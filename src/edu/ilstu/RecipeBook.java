package edu.ilstu;

import java.util.ArrayList;

public class RecipeBook
{
	private static RecipeBook obj;
	private ArrayList<Recipe> recipeList;

	private RecipeBook()
	{
		recipeList = new ArrayList<Recipe>();
	}

	public static RecipeBook getInstance()
	{ if (obj == null)
		{obj = new RecipeBook();}
	return obj;
	}

	RecipeBook(Recipe r)
	{
		recipeList = RecipeBook.getInstance().listRecipes();
		recipeList.add(r);
	}

	public ArrayList<Recipe> listRecipes()
	{
		return this.recipeList;
	}

	public void addRecipe(Recipe newRecipe)
	{
		recipeList.add(newRecipe);
	}

	public void deleteRecipe(Recipe oldRecipe)
	{
		recipeList.remove(oldRecipe);
	}

	public void sort()
	{
		//Sort with different parameters
	}

	public boolean save()
	{
		return true;
		//Need database info first
	}

	public void load()
	{
		//Need database info first
	}

	public void displayAllRecipes()
	{
		//Need UI info
	}

}
