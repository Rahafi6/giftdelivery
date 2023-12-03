package com.example.giftdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class chosecard extends AppCompatActivity {

    private Button card1,card2,card3,card4,card5,card6,card8;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_chosecard);

            card1 = findViewById(R.id.Tex_card1);
            card2 = findViewById(R.id.Tex_card2);
            card3 = findViewById(R.id.Tex_card3);
            card4 = findViewById(R.id.Tex_card4);
            card5 = findViewById(R.id.Tex_card5);
            card6 = findViewById(R.id.Tex_card6);
            card8 = findViewById(R.id.Tex_card8);

            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent cards = new Intent(getApplicationContext(), showdata.class );
                    startActivity(cards);
                }
            });

            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent cards = new Intent(getApplicationContext(), showdata.class );
                    startActivity(cards);
                }
            });

            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent cards = new Intent(getApplicationContext(), showdata.class );
                    startActivity(cards);
                }
            });

            card4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent cards = new Intent(getApplicationContext(), showdata.class );
                    startActivity(cards);
                }
            });


            card5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent cards = new Intent(getApplicationContext(), showdata.class );
                    startActivity(cards);
                }
            });

            card6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent cards = new Intent(getApplicationContext(), showdata.class );
                    startActivity(cards);
                }
            });

            card8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent cards = new Intent(getApplicationContext(), showdata.class );
                    startActivity(cards);
                }
            });
        }
}

