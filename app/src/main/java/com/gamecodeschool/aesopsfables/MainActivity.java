package com.gamecodeschool.aesopsfables;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    Button btnF1;
    Button btnF2;
    Button btnF3;
    Button btnF4;
    Button btnF5;
    Button btnF6;
    Button btnF7;
    Button btnF8;
    Button btnF9;
    Button btnF10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnF1 = findViewById(R.id.btnF1);
        btnF2 = findViewById(R.id.btnF2);
        btnF3 = findViewById(R.id.btnF3);
        btnF4 = findViewById(R.id.btnF4);
        btnF5 = findViewById(R.id.btnF5);
        btnF6 = findViewById(R.id.btnF6);
        btnF7 = findViewById(R.id.btnF7);
        btnF8 = findViewById(R.id.btnF8);
        btnF9 = findViewById(R.id.btnF9);
        btnF10 = findViewById(R.id.btnF10);



        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), TheMischievous.class));

            }
        });

        btnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), AndroclesFables.class));

            }
        });

        btnF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), TheAssBrainsFable.class));

            }
        });

        btnF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), TheBoysAndTheFrogs.class));

            }
        });

        btnF5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), TheLionAndTheBoar.class));

            }
        });

        btnF6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), TheLionInLoveFable.class));

            }
        });

        btnF7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), TheLionShareFable.class));

            }
        });

        btnF8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), TheOldHound.class));

            }
        });

        btnF9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), TheCatMaidenFable.class));

            }
        });

        btnF10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), TheCockAndTheJewel.class));

            }
        });

    }

}
















