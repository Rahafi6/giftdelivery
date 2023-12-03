package com.example.giftdelivery;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Flowers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers);

        Button pink = findViewById(R.id.But_pink);
        Button blue = findViewById(R.id.But_blue);
        Button white = findViewById(R.id.But_white);
        Button red = findViewById(R.id.But_red);
        Button purple = findViewById(R.id.But_pur);
        Button orange = findViewById(R.id.But_org);
        Button yellow = findViewById(R.id.But_yellow);
        Button sky = findViewById(R.id.But_sky);

        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards= new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards= new Intent(getApplicationContext(), cards.class);
                startActivity(cards);

            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

        sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cards = new Intent(getApplicationContext(), cards.class);
                startActivity(cards);
            }
        });

    }
}
