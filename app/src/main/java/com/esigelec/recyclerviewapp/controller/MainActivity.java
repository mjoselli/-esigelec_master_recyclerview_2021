package com.esigelec.recyclerviewapp.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.esigelec.recyclerviewapp.R;

public class MainActivity extends AppCompatActivity {
    RecyclerView mainRecyclerView;
    ProductsAdapter productsAdapter = new ProductsAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainRecyclerView = findViewById(R.id.mainRecyclerView);
        mainRecyclerView.addItemDecoration(
                new DividerItemDecoration(MainActivity.this,
                        DividerItemDecoration.VERTICAL)
        );
        mainRecyclerView.setAdapter(productsAdapter);
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}