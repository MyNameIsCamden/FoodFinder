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
	
	public Recipe findRecipe (Recipe rec){
		Recipe tempRec = null;
		if (recipeList.contains(rec)) {
			   tempRec = recipeList.get(recipeList.indexOf(rec));
			}
		return tempRec;
	}

	public void sort()
	{
		//Sort with different parameters
	}

	public ArrayList<Recipe> findRecipesByUser (User tempUser)
	{
		ArrayList<Recipe> tempList = new ArrayList<Recipe>();
		for (int i = 0; i < recipeList.size(); i ++)
		{
	    	if(recipeList.get(i).getUser().contains(tempUser))
	    	{
	    		tempList.add(recipeList.get(i));
	    	}
		}
		if (tempList == null)
		{
			//Recipe noRecipe = new Recipe ()
		}
		return tempList;
	}
}
