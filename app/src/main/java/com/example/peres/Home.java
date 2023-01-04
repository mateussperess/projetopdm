package com.example.peres;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    ArrayList<Propertie> propriedades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        gerarPropertie();

        RecyclerView rvProperties = findViewById(R.id.rvProperties);
        Adapter adapter = new Adapter(propriedades);
        RecyclerView.LayoutManager layout =
            new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvProperties.setLayoutManager(layout);
        rvProperties.setAdapter(adapter);

    }

    private void gerarPropertie() {
        propriedades = new ArrayList<Propertie>();
        createPropertie("Cabana da mata", 222, "uma cabana muito foda");
        createPropertie("Cabana do galo", 222, "uma cabana muito foda");
        createPropertie("Terreno", 2222, "um terreno muito foda");
        createPropertie("Apartamento", 2222, "um ap muito foda");
        createPropertie("Casa", 2222, "uma casa muito foda");
    }

    private void createPropertie(String title, float price, String description) {
        Propertie propertie = new Propertie(title, price, description);
        propriedades.add(propertie);
    }
}