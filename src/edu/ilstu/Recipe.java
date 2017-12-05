package edu.ilstu;

import java.util.*;

/**
 * This class holds all the information for a recipe.
 * It also has methods to display the information.
 * 
 * @author Heather Trausch
 *
 */
public class Recipe implements Comparable<Recipe>  {
	
	private String name;
	private String instructions;
	private int rating = 0;
	private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Tags> tags = new ArrayList<Tags>();
	private boolean alwaysStock;
	
 	public Recipe()
	{
		this.name = "";
	}
	
	public Recipe(String Name)
	{
		this.name = Name;
	}
	
	/**
	 * This method returns the instructions in String format.
	 * 
	 * @return the instructions
	 */
	public String displayInstructions(){
		return instructions;
	}
	
	/**
	 * This method returns the ratings in String format.
	 * 
	 * @return the ratings
	 */
	public String displayRating(){
		String rateString = "";
		for (int i=0;i<this.rating;i++)
		{
			rateString = rateString + " *";
		}
		
		rateString = rateString + "\n" + "\n";
		return rateString;
	}
	
	/**
	 * This method returns the ingredients in String format.
	 * 
	 * @return the ingredients
	 */
	public String displayIngredients(){
		String listOfIng = "";
		
		for(int i = 0; i < this.ingredients.size(); i++){
			Ingredient ing = this.ingredients.get(i);
			listOfIng = listOfIng + ing.getAmount() + " " + ing.getConversion().returnHomeUnit() + " " + ing.getName() + "\n";
		}	
		return listOfIng;
	}
	
	/**
	 * This method returns the users in String format.
	 * 
	 * @return the users
	 */
	public String displayUsers(){
		String listOfUsers = "";
		
		for(int i = 0; i < this.users.size(); i++){
			User user = this.users.get(i);
			listOfUsers = listOfUsers + user.getName() + "\n";
			// adapt to user info ^^
		}
		
		return listOfUsers;
	}
	
	/**
	 * This method returns the tags in String format.
	 * 
	 * @return the tags
	 */
	public String displayTags(){
		String listOfTags = "";
		
		for(int i = 0; i < this.tags.size(); i++){
			Tags tag = this.tags.get(i);
			listOfTags = listOfTags +tag.displayTag() + "\n";
		}
		
		return listOfTags;
	}
	
	// Getters and setters for all instance variables
	public void setInstructions(String instructions){
		this.instructions = instructions;
	}
	
	public void setStock(boolean stock){
		this.alwaysStock = stock;
	}
	
	public boolean checkStock(){
		return this.alwaysStock;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getInstructions(){
		return this.instructions;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setRating(int rating){
		this.rating = rating;
	}
	
	public int getRating(){
		return rating;
	}
	
	public void setIngredients(ArrayList<Ingredient> ingredients){
		this.ingredients = ingredients;
	}
	
	public void addIngredient(Ingredient newIngredient){
		this.ingredients.add(newIngredient);
	}
	
	public ArrayList<Ingredient> getIngredients(){
		return ingredients;
	}
	
	public void setUsers(ArrayList<User> users){
		this.users = users;
	}
	
	public ArrayList<User> getUser(){
		return users;
	}
	
	public void setTags(ArrayList<Tags> tags){
		this.tags = tags;
	}
	
	public List<Tags> getTags(){
		return tags;
	}
	
	public void makeRecipe()
	{
		Pantry myPantry = Pantry.getInstance();
		for(int i = 0; i < this.ingredients.size(); i++){
			Ingredient ing = this.ingredients.get(i);
			Ingredient ing2 = myPantry.findIngredient(ing);
			double amountDeduct = ing.getAmount();
			if (ing2 != null)
				ing2.decreaseAmount(amountDeduct);
		}	
	}
	@Override
	public boolean equals(Object rec){
		boolean result = false;
		
	    if (rec == null) result = false;
	    else 
	    	{ 
	    	Recipe tempRec = (Recipe)rec;
	    	if (tempRec.getName().equals(this.getName()))
	    		result = true;
	    	}
	    return result;
	}
	  @Override 
	  /* 
	   * When we only use Comparable, this is where we write sorting
	   * logic. This method is called when we implement the Comparable
	   * interface in our class and call Collections.sort()
	   */ 
	  public int compareTo(Recipe rec){ 
		int result = 0;
		if (this.rating < rec.rating)
			result = -1;
			else if (this.rating > rec.rating)	
				result = 1;
	    return result;   
	  }
	
}
