package com.foodadviseapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class FoodListPage extends AppCompatActivity {
    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_list_layout);
        listView = findViewById(R.id.food_list);
        // Create an ArrayList to store Food objects
        ArrayList<Food> recipes = new ArrayList<>();

        // Sample 1: Pasta with Marinara Sauce
        ArrayList<String> pastaIngredients = new ArrayList<>();
        pastaIngredients.add("1 pound pasta");
        pastaIngredients.add( "1 jar marinara sauce");
        pastaIngredients.add("1/4 cup grated parmesan cheese");
        String pastaInstructions = "Cook pasta according to package directions. Drain and toss with marinara sauce. Top with parmesan cheese and serve.";
        recipes.add(new Food("Pasta with Marinara Sauce", pastaIngredients, pastaInstructions, 4, 20,R.drawable.pasta));

        // Sample 2: Chicken Stir-Fry
        ArrayList<String> stirFryIngredients =new ArrayList<>();
            stirFryIngredients.add("1 pound chicken breast, cut into strips");
            stirFryIngredients.add("1 cup broccoli florets");
            stirFryIngredients.add("1 cup chopped carrots");
            stirFryIngredients.add("1/2 cup soy sauce");
            stirFryIngredients.add("1 tablespoon honey");
            stirFryIngredients.add("1 tablespoon cornstarch");
            stirFryIngredients.add("Oil for cooking");
        String stirFryInstructions = "Marinate chicken in soy sauce, honey, and cornstarch for 30 minutes. Heat oil in a pan and stir-fry chicken until cooked through. Add broccoli and carrots, cook until tender-crisp. Serve with rice.";
        recipes.add(new Food("Chicken Stir-Fry", stirFryIngredients, stirFryInstructions, 3, 25,R.drawable.chicken));

        // Sample 3: Vegetarian Chili
        ArrayList<String> chiliIngredients = new ArrayList<>();
        chiliIngredients.add("1 can (15 oz) kidney beans, rinsed and drained");
        chiliIngredients.add("1 can (15 oz) black beans, rinsed and drained");
        chiliIngredients.add("1 can (14.5 oz) diced tomatoes");
        chiliIngredients.add("1 cup vegetable broth");
        chiliIngredients.add("1 onion, chopped");
        chiliIngredients.add("1 green bell pepper, chopped");
        chiliIngredients.add("1 chili powder");
        chiliIngredients.add("1 teaspoon cumin");
        chiliIngredients.add("Salt and pepper to taste");
        String chiliInstructions = "Combine all ingredients in a slow cooker. Cook on low for 6-8 hours or on high for 4-5 hours. Season with salt and pepper to taste.";
        recipes.add(new Food("Vegetarian Chili", chiliIngredients, chiliInstructions, 6, 8,R.drawable.vegetarian_chili));

        // Sample 4: Scrambled Eggs
        ArrayList<String> eggsIngredients = new ArrayList<>();
        eggsIngredients.add("2 eggs");
        eggsIngredients.add("1 tablespoon milk");
        eggsIngredients.add("Salt and pepper to taste");
        eggsIngredients.add("Butter for cooking");
        String eggsInstructions = "Whisk together eggs and milk. Season with salt and pepper. Melt butter in a pan over medium heat. Pour in egg mixture and cook, stirring constantly, until scrambled to desired doneness.";
        recipes.add(new Food("Scrambled Eggs", eggsIngredients, eggsInstructions, 1, 10,R.drawable.scrambled_eggs));

        // Sample 5:  Banana Bread
        ArrayList<String> breadIngredients = new ArrayList<>();
        breadIngredients.add("2 cups all-purpose flour");
        breadIngredients.add("1 teaspoon baking soda");
        breadIngredients.add("1/2 teaspoon salt");
        breadIngredients.add("1 cup (2 sticks) unsalted butter, softened");
        breadIngredients.add("1 1/2 cups granulated sugar");
        breadIngredients.add("3 large eggs");
        breadIngredients.add("3 ripe bananas, mashed");
        breadIngredients.add("1 teaspoon vanilla extract");
        String breadInstructions = "Preheat oven to 350°F (175°C). Grease a loaf pan. In a large bowl, whisk together flour, baking soda, and salt. In a separate bowl, cream together butter and sugar until light and fluffy. Beat in eggs one at a time, then stir in mashed bananas and vanilla extract. Gradually add the dry ingredients to the wet ingredients, mixing until just combined. Pour batter into prepared loaf pan. Bake for 50-60 minutes, or until a toothpick inserted into the center comes out clean. Cool in pan for 10 minutes, then transfer to a wire rack to cool completely.";
        recipes.add(new Food("Banana Bread", breadIngredients, breadInstructions, 10, 70,R.drawable.banana_bread));

        // Create a custom adapter for the ListView
        FoodListAdapter adapter = new FoodListAdapter(this, recipes);
        listView.setAdapter(adapter);
    }
}
