package com.foodadviseapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodListAdapter extends ArrayAdapter<Food> {
    private final Context context;
    private final ArrayList<Food> data;
    public FoodListAdapter(Context context, ArrayList<Food> data) {
        super(context, R.layout.card_layout, data);
        this.context = context;
        this.data = data;
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the item_card layout
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.card_layout, parent, false);

        // Get the TextView and ImageView and basic items
        TextView textView = view.findViewById(R.id.map_item_title);
        ImageView imageView = view.findViewById(R.id.map_item_image);  // Get the ImageView by ID
        // Set the data for the current list item
        textView.setText(data.get(position).name);
        imageView.setImageResource(data.get(position).imageResourceId);  // Example using a drawable resource
//        imageView.setImageResource(R.drawable.elon_musk);  // Example using a drawable resource
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the car data for the clicked position
                String name = data.get(position).name;
                String cookingTime = String.valueOf(data.get(position).cookingTime);
                String instruction = String.valueOf(data.get(position).instructions);
                ArrayList<String> ingredients = data.get(position).ingredients;
                String imageResourceId = String.valueOf(data.get(position).imageResourceId);

                // Create an Intent to launch the DetailActivity
                Intent intent = new Intent(context, DetailActivity.class);

                // Optionally, send data (car detail) to the DetailActivity
                intent.putExtra("name",name);
                intent.putExtra("cookingTime",cookingTime);
                intent.putExtra("instruction",instruction);
                intent.putStringArrayListExtra("ingredients", ingredients);
                intent.putExtra("imageResourceId",imageResourceId);

                // Start the DetailActivity
                context.startActivity(intent);
            }
        });
        return view;
    }
}
