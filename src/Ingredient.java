package edu.ilstu;

	/**
	 * @author John Boomgarden
	 *
	 */
	public class Ingredient 
	{
		private String ingredientName;
		private double amount;
	 	private Conversion conversionRatio;
	 	
	 	public Ingredient()
		{
			this.ingredientName = "";
			this.amount = 0;
			this.conversionRatio = new Conversion(1, null, null, null);
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
			this.amount += addedAmount;
		}
		public void decreaseAmount(double addedAmount)
		{
			this.amount -= addedAmount;
		}	
		
		public double getAmount()
		{
			return this.amount;
		}
		
		public String getName()	
		{
			return this.ingredientName;
		}
		
		public void setAmount(double amountIn)
		{
			this.amount = amountIn;
		}
		
		public void setName(String nameIn)
		{
			this.ingredientName = nameIn;
		}

		public boolean equals(Ingredient ing) {
			boolean result = false;
		    if (ing == null) result = false;
		    else 
		    	if (ing.getName() == this.getName())
		    	result = true;
		    return result;
		}	
}