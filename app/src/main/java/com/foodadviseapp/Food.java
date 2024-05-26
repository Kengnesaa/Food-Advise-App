package com.foodadviseapp;

import java.util.ArrayList;

public  class Food {
    String name;
    ArrayList<String> ingredients = new ArrayList<>();
    String instructions;
    int servings;
    int cookingTime;
    int imageResourceId;

    public Food(String name, ArrayList<String> ingredients, String instructions, int servings, int cookingTime ,int imageResourceId) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.servings = servings;
        this.cookingTime = cookingTime;
        this.imageResourceId = imageResourceId;
    }
}
