package com.foodadviseapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class IngredientsAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final ArrayList<String> ingredients;

    public IngredientsAdapter(Context context, ArrayList<String> ingredients) {
        super(context, R.layout.ingredient_list_item, ingredients);  // Set layout for each item
        this.context = context;
        this.ingredients = ingredients;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.ingredient_list_item, parent, false);

        TextView ingredientTextView = (TextView) view.findViewById(R.id.ingredient_text);  // Assuming a TextView with id ingredient_text
        ingredientTextView.setText(ingredients.get(position));

        return view;
    }
}
