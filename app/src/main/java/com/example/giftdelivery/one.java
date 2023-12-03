package com.example.giftdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Button But_flo = findViewById(R.id.Tex_frose);
        Button But_cake = findViewById(R.id.Tex_cakes);
        Button But_jew = findViewById(R.id.Tex_jewelry);

        But_flo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent flower = new Intent(getApplicationContext(), Flowers.class);
                startActivity(flower);

                Toast.makeText(one.this, "Flowers !", Toast.LENGTH_SHORT).show();
            }
        });
        But_cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cake = new Intent(getApplicationContext(), cakes.class);
                startActivity(cake);
                Toast.makeText(one.this, "Cakes !", Toast.LENGTH_SHORT).show();
            }
        });

        But_jew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jew = new Intent(getApplicationContext(), jewelry.class);
                startActivity(jew);

                Toast.makeText(one.this, "Jewelry !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}