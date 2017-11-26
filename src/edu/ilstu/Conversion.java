package edu.ilstu;

public class Conversion {
	private double conversionRate;
	private String homeUnit;
	private String commercialUnit;
	private String ingredientName;  

	
	public Conversion(double conversionRate, String homeUnit, String commercialUnit, String ingredientName){
		this.conversionRate = conversionRate;
		this.commercialUnit = commercialUnit; 
		this.ingredientName = ingredientName;
		this.homeUnit =homeUnit;
	}
	
	public double convert(double input){
		return input * this.conversionRate;
	}
	
	public String returnIngredientName(){
		return ingredientName;
	}
	
	public String returnHomeUnit(){
		return homeUnit;
	}
	
	public String returnCommericalUnit(){
		return commercialUnit;
	}
	
	public void setCommericalUnit(String unitIn){
		this.commercialUnit = unitIn;
	}
	
	public void setHomeUnit(String unitIn){
		this.homeUnit = unitIn;
	}
}
