package com.example.duy.coffeeshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Data> drinkList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        mAdapter = new Adapter(drinkList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareDrinkData();
    }

    private void prepareDrinkData() {
        Data data = new Data("Americano 5$", "");
        drinkList.add(data);

        data = new Data("Latte 6$", "");
        drinkList.add(data);

        data = new Data("Mocha 6$", "");
        drinkList.add(data);

        data = new Data("Cappuccino 5$", "");
        drinkList.add(data);

        data = new Data("Espresso 5$", "");
        drinkList.add(data);

        mAdapter.notifyDataSetChanged();
    }
}
