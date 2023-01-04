package com.example.peres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    Button buttonLogin = findViewById(R.id.buttonLogin);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }


    public void launchLoginActivity(View view) {
        Log.d("TESTE", "Interagindo com a Activity Login!");
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }

    public void launchRegisterActivity(View view) {
        Log.d("TESTE", "Interagindo com a Activity Register!");
        Intent register = new Intent(this, Register.class);
        startActivity(register);
    }

    public void launchHelpActivity(View view) {
        Log.d("TESTE", "Interagindo com a Activity Help!");
        Intent help = new Intent(this, Help.class);
        startActivity(help);
    }
}