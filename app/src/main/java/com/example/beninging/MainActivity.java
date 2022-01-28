package com.example.beninging;

import android.os.Bundle;
import android.app.ListActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    MyRecyclerViewAdapter adapter;
    RecyclerView recyclerView;
    ArrayList<String> animalNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");
        animalNames.add("Turtle");
        animalNames.add("Dog");
        animalNames.add("Cat");
        animalNames.add("Humans");
        animalNames.add("Whale");
        animalNames.add("Dolphin");
        animalNames.add("Killer Whale");
        animalNames.add("Giraffe");
        animalNames.add("Lion");
        animalNames.add("Hyena");

        // set up the RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, animalNames);
        recyclerView.setAdapter(adapter);
    }

    public void addWord(View view){
        animalNames.add("Animal"+animalNames.size());
        recyclerView.getAdapter().notifyItemChanged(animalNames.size()-1);
        recyclerView.smoothScrollToPosition(animalNames.size()-1);
    }
}