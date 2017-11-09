package edu.ilstu;

	/**
	 * @author John Boomgarden
	 *
	 */
	public class Ingredient 
	{
		private String ingredientName;
		private double amount;
		private String homeUnit;
	 	private Conversion conversionRatio;
	 	
	 	public Ingredient()
		{
			this.ingredientName = "";
			this.amount = 0;
			this.conversionRatio = new Conversion(1, null, null, null);
		}
	 	
	 	public Ingredient(String ingredientName, double amount, String homeUnit)
	 	{
	 		this.ingredientName = ingredientName;
	 		this.amount = amount;
	 		this.homeUnit = homeUnit;
	 	}
	 	
	 	public Ingredient(String ingredientName,
				String commercialUnit, String homeUnit, double commercialAmount, double conversionRate)
		{
			this.ingredientName = ingredientName;
			this.conversionRatio = new Conversion(conversionRate, homeUnit, commercialUnit, ingredientName);
			this.amount = this.conversionRatio.convert(commercialAmount);
		}
		
		public void increaseAmount(double addedAmount)
		{
			amount += addedAmount;
		}
		public void decreaseAmount(double addedAmount)
		{
			amount -= addedAmount;
		}	
		
		public double getAmount()
		{
			return amount;
		}
		
		public String getHomeUnit()
		{
			return homeUnit;
		}
		
		public String getName()
		{
			return ingredientName;
		}
		
		public void setAmount(double amountIn)
		{
			amount = amountIn;
		}
		
		public void setName(String nameIn)
		{
			ingredientName = nameIn;
		}

		public boolean equals(Ingredient ing) {
			boolean result = false;
		    if (ing == null) result = false;
		    else 
		    	if (ing.getName().equals(getName()))
		    		result = true;
		    return result;
		}
		
		public String toString()
		{
			return ingredientName + ", " + amount;
		}
}