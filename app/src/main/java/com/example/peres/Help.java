package com.example.peres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Help extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        getSupportActionBar().hide();
    }

    public void launchMainActivity(View view) {
        Log.d("TESTE", "Voltando para a tela inicial!");
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}