package edu.ilstu;

import java.util.ArrayList;

public class RecipeBook
{
	private static RecipeBook obj;
	private ArrayList<Recipe> recipeList;

	private RecipeBook()
	{
		recipeList = new ArrayList<Recipe>();
		Recipe demoRecipe1 = new Recipe("Soft and Chewy Chocolate Chip Cookies");
		Ingredient tempIngredient1 = new Ingredient ("Flour", null, "cups", 2.25, 1.0);
		Ingredient tempIngredient2 = new Ingredient ("Butter", null, "cups", 1.0, 1.0);
		Ingredient tempIngredient3 = new Ingredient ("Brown sugar", null, "cups", 1.0, 1.0);
		Ingredient tempIngredient4 = new Ingredient ("Baking soda", null, "teaspoon", 0.5, 1.0);
		Ingredient tempIngredient5 = new Ingredient ("Vanilla extract", null, "teaspoon", 2.0, 1.0);
		Ingredient tempIngredient6 = new Ingredient ("Chocolate chips", null, "cups", 2.0, 1.0);
		Ingredient tempIngredient7 = new Ingredient ("Sugar", null, "cups", 0.5, 1.0);
		Ingredient tempIngredient8 = new Ingredient ("Salt", null, "teaspoon", 2.0, 1.0);
		Ingredient tempIngredient9 = new Ingredient ("Eggs", null, "", 2.0, 1.0);
		demoRecipe1.addIngredient(tempIngredient1);
		demoRecipe1.addIngredient(tempIngredient2);
		demoRecipe1.addIngredient(tempIngredient3);
		demoRecipe1.addIngredient(tempIngredient4);
		demoRecipe1.addIngredient(tempIngredient5);
		demoRecipe1.addIngredient(tempIngredient6);
		demoRecipe1.addIngredient(tempIngredient7);
		demoRecipe1.addIngredient(tempIngredient8);
		demoRecipe1.addIngredient(tempIngredient9);
		demoRecipe1.setInstructions("Preheat oven to 350 degrees. In a small bowl, whisk together the flour and baking soda;set aside. In the bowl of an electric mixer fitted with the paddle attachment, combine the butter with both sugars; beat on medium speed until light and fluffy. Reduce speed to low; add the salt, vanilla, and eggs. Beat until well mixed, about 1 minute. Add flour mixture; mix until just combined. Stir in the chocolate chips. \n" +
				"Drop heaping tablespoon-size balls of dough about 2 inches apart on baking sheets lined with parchment paper. \n" +
				"Bake until cookies are golden around the edges, but still soft in the center, 8 to 10 minutes. Remove from oven, and let cool on baking sheet 1 to 2 minutes. Transfer to a wire rack, and let cool completely.\n");
		demoRecipe1.setRating(5);
		ArrayList<Tags> tempListTags = new ArrayList <Tags>();
		Tags tempTags1 = new Tags("Food type","dessert");
		tempListTags.add(tempTags1);
		demoRecipe1.setTags(tempListTags);
		ArrayList<User> tempListUsers = new ArrayList <User>();
		User demoUser1 = new User("Smith", "Jim");
		User demoUser2 = new User("Smith", "John");
		User demoUser3 = new User("Smith", "Helen");
		tempListUsers.add(demoUser1);
		tempListUsers.add(demoUser2);
		tempListUsers.add(demoUser3);
		demoRecipe1.setUsers(tempListUsers);
		demoRecipe1.setStock(true);
		recipeList.add(demoRecipe1);
		
		Recipe demoRecipe2 = new Recipe("Perfect Macaroni and Cheese");
		Ingredient temp2Ingredient1 = new Ingredient ("Bread", null, "slices", 6, 1.0);
		Ingredient temp2Ingredient2 = new Ingredient ("Butter", null, "cups", 1.0, 1.0);
		Ingredient temp2Ingredient3 = new Ingredient ("Milk", null, "cups", 5.5, 1.0);
		Ingredient temp2Ingredient4 = new Ingredient ("Salt", null, "teaspoon", 2.0, 1.0);
		Ingredient temp2Ingredient5 = new Ingredient ("Nutmeg", null, "teaspoon", .25, 1.0);
		Ingredient temp2Ingredient6 = new Ingredient ("Pepper", null, "teaspoon", .25, 1.0);
		Ingredient temp2Ingredient7 = new Ingredient ("Cheddar cheese", null, "cups", 4.5, 1.0);
		Ingredient temp2Ingredient8 = new Ingredient ("Romano cheese", null, "cups", 1.25, 1.0);
		Ingredient temp2Ingredient9 = new Ingredient ("Macaroni", null, "cups", 0.5, 1.0);
		demoRecipe2.addIngredient(temp2Ingredient1);
		demoRecipe2.addIngredient(temp2Ingredient2);
		demoRecipe2.addIngredient(temp2Ingredient3);
		demoRecipe2.addIngredient(temp2Ingredient4);
		demoRecipe2.addIngredient(temp2Ingredient5);
		demoRecipe2.addIngredient(temp2Ingredient6);
		demoRecipe2.addIngredient(temp2Ingredient7);
		demoRecipe2.addIngredient(temp2Ingredient8);
		demoRecipe2.addIngredient(temp2Ingredient9);
		demoRecipe2.setInstructions("Heat the oven to 375 degrees. Butter a 3-quart casserole dish; set aside. Place bread pieces in a medium bowl. In a small saucepan over medium heat, melt 2 tablespoons butter. Pour butter into the bowl with bread, and toss. Set the breadcrumbs aside. In a medium saucepan set over medium heat, heat milk. Melt remaining 6 tablespoons butter in a high-sided skillet over medium heat. When butter bubbles, add flour. Cook, stirring, 1 minute. \n" +
				"Slowly pour hot milk into flour-butter mixture while whisking. Continue cooking, whisking constantly, until the mixture bubbles and becomes thick. \n" +
				"Remove the pan from the heat. Stir in salt, nutmeg, black pepper, cayenne pepper, 3 cups cheddar, and 1 cup pecorino Romano. Set cheese sauce aside.\n" +
				"Fill a large saucepan with water. Bring to a boil. Add macaroni; cook 2 to 3 fewer minutes than manufacturer's directions, until outside of pasta is cooked and inside is underdone. (Different brands of macaroni cook at different rates; be sure to read the instructions.) Transfer the macaroni to a colander, rinse under cold running water, and drain well. Stir macaroni into the reserved cheese sauce. \n" +
				"Pour the mixture into the prepared casserole dish. Sprinkle remaining 1 1/2 cups cheddar and 1/2 cup Gruyere or 1/4 cup pecorino Romano; scatter breadcrumbs over the top. Bake until browned on top, about 30 minutes. Transfer dish to a wire rack to cool for 5 minutes; serve.\n");
		demoRecipe2.setRating(4);
		ArrayList<Tags> temp2ListTags = new ArrayList <Tags>();
		Tags temp2Tags1 = new Tags("Meal type","lunch");
		Tags temp2Tags2 = new Tags("Meal type","supper");
		Tags temp2Tags3 = new Tags("Ethnicity","American");
		tempListTags.add(temp2Tags1);
		tempListTags.add(temp2Tags2);
		tempListTags.add(temp2Tags3);
		demoRecipe2.setTags(temp2ListTags);
		ArrayList<User> temp2ListUsers = new ArrayList <User>();
		User demo2User1 = new User("Smith", "Jim");
		User demo2User2 = new User("Smith", "Tony");
		User demo2User3 = new User("Smith", "Kim");
		temp2ListUsers.add(demo2User1);
		temp2ListUsers.add(demo2User2);
		temp2ListUsers.add(demo2User3);
		demoRecipe2.setUsers(temp2ListUsers);
		recipeList.add(demoRecipe2);
	
	Recipe demoRecipe3 = new Recipe("The Best Banana Bread");
	Ingredient temp3Ingredient1 = new Ingredient ("Butter", null, "cups", 0.5, 1.0);
	Ingredient temp3Ingredient2 = new Ingredient ("Eggs", null, "", 2.0, 1.0);
	Ingredient temp3Ingredient3 = new Ingredient ("Baking soda", null, "teaspoon", 1.0, 1.0);
	Ingredient temp3Ingredient4 = new Ingredient ("Mashed bananas", null, "cups", 1.0, 1.0);
	Ingredient temp3Ingredient5 = new Ingredient ("Vanilla extract", null, "teaspoon", 2.0, 1.0);
	Ingredient temp3Ingredient6 = new Ingredient ("Sugar", null, "cups", 1.0, 1.0);
	Ingredient temp3Ingredient7 = new Ingredient ("Flour", null, "cups", 1.5, 1.0);
	Ingredient temp3Ingredient8 = new Ingredient ("Salt", null, "teaspoon", 1.0, 1.0);
	Ingredient temp3Ingredient9 = new Ingredient ("Sour cream", null, "cups", 0.5, 1.0);
	Ingredient temp3Ingredient10 = new Ingredient ("Walnuts", null, "cups", 0.5, 1.0);
	demoRecipe3.addIngredient(temp3Ingredient1);
	demoRecipe3.addIngredient(temp3Ingredient2);
	demoRecipe3.addIngredient(temp3Ingredient3);
	demoRecipe3.addIngredient(temp3Ingredient4);
	demoRecipe3.addIngredient(temp3Ingredient5);
	demoRecipe3.addIngredient(temp3Ingredient6);
	demoRecipe3.addIngredient(temp3Ingredient7);
	demoRecipe3.addIngredient(temp3Ingredient8);
	demoRecipe3.addIngredient(temp3Ingredient9);
	demoRecipe3.addIngredient(temp3Ingredient10);
	demoRecipe3.setInstructions("Preheat oven to 350 degrees. Butter a 9-by-5-by-3-inch loaf pan; set aside. In an electric mixer fitted with the paddke attachment, cream butter abd sugar until light and fluffy. Add eggs and beat to incorporate. \n" +
			"In a medium bowl, whisk together flour, baking soda, and salt. Add to the butter mixture and mix until just combined. Add bananas, sour cream, and vanilla; mix to combine. Stir in nuts and pour into prepared pan.\n" +
			"Bake until a cake tester inserted into the center of the loaf comes out clean, about 1 hour and 10 minutes. Let rest in a pan for 10 minutes, then turn onto a rack to cool. \n");
	demoRecipe3.setRating(5);
	ArrayList<Tags> temp3ListTags = new ArrayList <Tags>();
	Tags temp3Tags1 = new Tags("Food type","bread");
	Tags temp3Tags2 = new Tags("Meal type","supper");
	Tags temp3Tags3 = new Tags("Ethnicity","American");
	temp3ListTags.add(temp3Tags1);
	temp3ListTags.add(temp3Tags2);
	temp3ListTags.add(temp3Tags3);
	demoRecipe3.setTags(temp3ListTags);
	ArrayList<User> temp3ListUsers = new ArrayList <User>();
	User demo3User1 = new User("Smith", "Jim");
	User demo3User2 = new User("Smith", "Tony");
	User demo3User3 = new User("Smith", "Kim");
	temp3ListUsers.add(demo3User1);
	temp3ListUsers.add(demo3User2);
	temp3ListUsers.add(demo3User3);
	demoRecipe3.setUsers(temp3ListUsers);
	recipeList.add(demoRecipe3);
	
	Recipe demoRecipe4 = new Recipe("Easy Basic Pancakes");
	Ingredient temp4Ingredient1 = new Ingredient ("Flour", null, "cups", 1.0, 1.0);
	Ingredient temp4Ingredient2 = new Ingredient ("Baking soda", null, "teaspoon", 2.0, 1.0);
	Ingredient temp4Ingredient3 = new Ingredient ("Milk", null, "cups", 1.0, 1.0);
	Ingredient temp4Ingredient4 = new Ingredient ("Eggs", null, "", 1.0, 1.0);
	Ingredient temp4Ingredient5 = new Ingredient ("Salt", null, "teaspoon", 0.5, 1.0);
	Ingredient temp4Ingredient6 = new Ingredient ("Butter", null, "cups", 0.25, 1.0);
	Ingredient temp4Ingredient7 = new Ingredient ("Vegetable oil", null, "tablespoon", 1.0, 1.0);
	demoRecipe4.addIngredient(temp4Ingredient1);
	demoRecipe4.addIngredient(temp4Ingredient2);
	demoRecipe4.addIngredient(temp4Ingredient3);
	demoRecipe4.addIngredient(temp4Ingredient4);
	demoRecipe4.addIngredient(temp4Ingredient5);
	demoRecipe4.addIngredient(temp4Ingredient6);
	demoRecipe4.addIngredient(temp4Ingredient7);
	demoRecipe4.setInstructions("Preheat oven to 200 degrees. In a small bowl, whisk together the flour, sugar, salt, and baking soda; set aside. \n" +
			"In a medium bowl, whisk together milk, butter (or oil), and egg. Add dry ingredients to milk mixture; whisk until just moistened (do not overmix, a few small lumps are fine). \n" +
			"Heat a large skillet over medium heat. Fold paper towel in half, and moisten with oil; carefully rub the skillet with the oiled paper towel. \n" +
			"For each pancake, spoon 2 to 3 tablespoons of batter onto the skillet, using the back of a spoon to spread the batter into a round shape.  \n" +
			"Cook until the surface of pancakes have some bubbles, and some have burst. Flip carefully with a thin spatula, and cook until brown on the underside, 1 to 2 minutes more. Serve warm with desired toppings \n");
	demoRecipe4.setRating(3);
	ArrayList<Tags> temp4ListTags = new ArrayList <Tags>();
	Tags temp4Tags1 = new Tags("Preparation","easy");
	Tags temp4Tags2 = new Tags("Preparation","under 30 minutes");
	temp4ListTags.add(temp4Tags1);
	temp4ListTags.add(temp4Tags2);
	demoRecipe4.setTags(temp4ListTags);
	ArrayList<User> temp4ListUsers = new ArrayList <User>();
	User demo4User1 = new User("Smith", "Jim");
	temp4ListUsers.add(demo4User1);
	demoRecipe4.setUsers(temp4ListUsers);
	recipeList.add(demoRecipe4);
	
	Recipe demoRecipe5 = new Recipe("Perfect Hardboiled Eggs");
	Ingredient temp5Ingredient1 = new Ingredient ("Eggs", null, "", 12.0, 1.0); 
	demoRecipe5.addIngredient(temp5Ingredient1);
	demoRecipe5.setInstructions("Place eggs into large saucepan, and cover with cold water until it is 1 inch above the eggs. Slowly bring them to a boil over medium heat; when the water has reached a boil, remove them from heat. Cover and let stand 12 minutes. \n" +
			"Transfer eggs to colander; place under cool running water to stop the cooking. Eggs can be peeled and served immediately. \n");
	demoRecipe5.setRating(2);
	ArrayList<Tags> temp5ListTags = new ArrayList <Tags>();
	Tags temp5Tags1 = new Tags("Preparation","easy");
	Tags temp5Tags2 = new Tags("Preparation","under 30 minutes");
	Tags temp5Tags3 = new Tags("Meal type", "Snack");
	temp5ListTags.add(temp5Tags1);
	temp5ListTags.add(temp5Tags2);
	temp5ListTags.add(temp5Tags3);
	demoRecipe5.setTags(temp5ListTags);
	demoRecipe5.setStock(true);
	recipeList.add(demoRecipe5);
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
		if (tempList.size() == 0)
		{
			Recipe noRecipe = new Recipe ("No results found");
			tempList.add(noRecipe);
		}
		return tempList;
	}
}


