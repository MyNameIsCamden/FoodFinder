package edu.ilstu;

import java.util.ArrayList;

public class RecipeBook
{
	
	private ArrayList<Recipe> recipeList;
	
	public RecipeBook(Recipe r)
	{
		recipeList = new ArrayList<Recipe>();
		recipeList.add(r);
	}
	
	public RecipeBook(ArrayList<Recipe> recipeList)
	{
		this.recipeList = recipeList;
	}
	
	public RecipeBook()
	{
		recipeList = new ArrayList<Recipe>();
	}
	
	public void addRecipe(Recipe newRecipe)
	{
		recipeList.add(newRecipe);
	}
	
	public ArrayList<Recipe> getList()
	{
		return recipeList;
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

	public boolean isEmpty() {
		return recipeList.isEmpty();
	}
	
}
