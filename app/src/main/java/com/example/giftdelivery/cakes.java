package com.example.giftdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cakes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakes);

        Button choco = findViewById(R.id.But_choco);
        Button van = findViewById(R.id.But_van);
        Button milk = findViewById(R.id.But_mil);
        Button lemon = findViewById(R.id.But_lem);
        Button caramel = findViewById(R.id.But_crml);
        Button resp = findViewById(R.id.But_rasp);
        Button cherry = findViewById(R.id.But_cherry);
        Button stru = findViewById(R.id.But_stru);

        choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        van.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        lemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        caramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        stru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        resp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        cherry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });
    }
}