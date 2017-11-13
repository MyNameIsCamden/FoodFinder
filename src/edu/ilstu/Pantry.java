package edu.ilstu;
/*
 * Filename: Pantry.java
 *
 * Programmer: Camden Coe
 * ULID: 848056490
 *
 */

import java.util.ArrayList;

/**
 * @author Camden Coe
 *
 */
public class Pantry {
	
	private static Pantry obj;
	private ArrayList<Ingredient> ingredientList;
	
	private Pantry(){
		ingredientList = new ArrayList<Ingredient>();
	}
	
	public static Pantry getInstance()
	{ if (obj == null)
		{obj = new Pantry();}
	return obj;
	}
	
	public void addIngredient(Ingredient ing){
		ingredientList.add(ing);
	}
	
	public void addIngredient() {
		Ingredient newIngredient = new Ingredient();
		ingredientList.add(newIngredient);
	}

	public void deleteIngredient(Ingredient ing){
		ingredientList.remove(ing);
		System.out.println(ing.getName() + " has been deleted.");
	}
	
	public Ingredient searchIngredient(Ingredient ing){
		return ingredientList.get(ingredientList.indexOf(ing));
	}
	
	public ArrayList<Ingredient> listIngredients(){
		return ingredientList;
	}
}
