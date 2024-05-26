package com.foodadviseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
 
    private ImageView candImageView,backButton;
    private TextView foodName,foodCookingTime,foodInstruction,foodTitle;
    private ListView foodIngredientList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_detail);

        // Get references to UI elements
        this.candImageView = findViewById(R.id.food_image_view);
        this.foodName = findViewById(R.id.food_name_text_view);
        this.foodCookingTime = findViewById(R.id.food_cooking_time);
        this.foodInstruction = findViewById(R.id.food_instruction);
        this.foodIngredientList = findViewById(R.id.food_ingredient);
        this.foodTitle = findViewById(R.id.food_title);
        this.backButton = findViewById(R.id.detail_back);
        Intent intent = getIntent();
        String can_NameTitle = null;
        // Get data from the Intent (optional)
        if (intent != null && intent.hasExtra("name")) {
            String name = intent.getStringExtra("name");
            String cookingTime = intent.getStringExtra("cookingTime");
            String instruction = intent.getStringExtra("instruction");
            String image = intent.getStringExtra("imageResourceId");
            int imageResourceId = Integer.parseInt(image);
            ArrayList<String> receivedIngredients = intent.getStringArrayListExtra("ingredients");

            // Update UI elements with car data (replace with your logic
            foodName.setText(name);
            foodTitle.setText(name);
            foodCookingTime.setText(cookingTime);
            foodInstruction.setText(instruction);
            IngredientsAdapter adapter = new IngredientsAdapter(this, receivedIngredients);
            foodIngredientList.setAdapter(adapter);
            candImageView.setImageResource(imageResourceId);
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, FoodListPage.class);
                startActivity(intent);
            }
        });
    }
}


