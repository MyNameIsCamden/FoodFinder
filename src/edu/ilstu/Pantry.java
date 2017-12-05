package edu.ilstu;
/*
 * Filename: Pantry.java
 *
 * Programmer: Camden Coe
 * ULID: 848056490
 *
 */

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Camden Coe
 *
 */
public class Pantry {
	
	private static Pantry obj;
	private ArrayList<Ingredient> ingredientList;
	
	private Pantry(){
		ingredientList = new ArrayList<Ingredient>();
		Ingredient ing1 = new Ingredient("Flour","pounds","cups",10.0,4.0);
		Ingredient ing2 = new Ingredient("Sugar","pounds","cups",10.0,2.0);
		Ingredient ing3 = new Ingredient("Brown sugar","pounds","cups",10.0,2.3);
		Ingredient ing4 = new Ingredient("Powdered sugar","pounds","cups",10.0,3.75);
		Ingredient ing5 = new Ingredient("Milk","gallons","cups",1.0,16.0);
		Ingredient ing6 = new Ingredient("Butter","sticks","cups",4.0,.5);
		Ingredient ing7 = new Ingredient("Baking soda","ounces","teaspoons",3,6.75);
		Ingredient ing8 = new Ingredient("Vanilla extract","ounces","teaspoons",1,6.75);
		Ingredient ing9 = new Ingredient("Chocolate chips","pounds","cups",1,3.0);
		ingredientList.add(ing1);
		ingredientList.add(ing2);
		ingredientList.add(ing3);
		ingredientList.add(ing4);
		ingredientList.add(ing5);
		ingredientList.add(ing6);
		ingredientList.add(ing7);
		ingredientList.add(ing8);
		ingredientList.add(ing9);
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
	}
	
	public Ingredient findIngredient (Ingredient ing){
		Ingredient tempIng = null;
		if (ingredientList.contains(ing)) {
			   tempIng = ingredientList.get(ingredientList.indexOf(ing));
			}
		return tempIng;
	}
	
	public Ingredient searchIngredient(Ingredient ing){
		return ingredientList.get(ingredientList.indexOf(ing));
	}
	
	public ArrayList<Ingredient> listIngredients(){
		return ingredientList;
	}
}
