package com.example.giftdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jewelry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jewelry);

        Button neck1 = findViewById(R.id.But_neck1);
        Button neck2 = findViewById(R.id.But_neck2);
        Button crystal = findViewById(R.id.But_crs);
        Button gold = findViewById(R.id.But_gold);
        Button chanel = findViewById(R.id.But_cha);
        Button star = findViewById(R.id.But_star);
        Button ring = findViewById(R.id.But_ring);
        Button rings = findViewById(R.id.But_rings);

        neck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        neck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        crystal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        chanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        rings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });
    }
}