package com.example.planetesolaire;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.planetesolaire.adapter.PlaneteAdapter;
import com.example.planetesolaire.controller.PlaneteController;
import com.example.planetesolaire.modele.Planete;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewPlanetes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        PlaneteAdapter adapter = new PlaneteAdapter(this);
        recyclerView.setAdapter(adapter);
    }
}