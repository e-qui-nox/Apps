package com.example.yamuna.awesomefruits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Fruit> fruitsList;
    private RecyclerView.Adapter fruitAdapter;

    @BindView(R.id.rv_fruits_list_view)
    RecyclerView fruitRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        fruitAdapter = new FruitAdapter(getFruitsList());
        fruitRecyclerView.setAdapter(fruitAdapter);

    }

    public ArrayList<Fruit> getFruitsList() {

        fruitsList = new ArrayList<>();
        fruitsList.add(new Fruit("Apple", R.drawable.apple));
        fruitsList.add(new Fruit("Avocado", R.drawable.avocado));
        fruitsList.add(new Fruit("Banana", R.drawable.banana));
        fruitsList.add(new Fruit("Blueberries", R.drawable.blueberries));
        fruitsList.add(new Fruit("Cherries", R.drawable.cherries));
        fruitsList.add(new Fruit("Corn", R.drawable.corn));
        fruitsList.add(new Fruit("Olives", R.drawable.olives));
        fruitsList.add(new Fruit("Orange", R.drawable.orange));
        fruitsList.add(new Fruit("Peach", R.drawable.peach));
        fruitsList.add(new Fruit("Pear", R.drawable.pear));
        fruitsList.add(new Fruit("Pomegranate", R.drawable.pomegranate));
        fruitsList.add(new Fruit("Raspberry", R.drawable.raspberry));
        fruitsList.add(new Fruit("Watermelon", R.drawable.watermelon));

        return fruitsList;
    }
}
