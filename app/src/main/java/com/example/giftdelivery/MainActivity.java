package com.example.giftdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView riy = findViewById(R.id.Img_ryadh);
        ImageView khob = findViewById(R.id.Img_khobar);
        ImageView mak = findViewById(R.id.Img_makkah);
        ImageView jedd = findViewById(R.id.Img_jeddah);
        ImageView buri = findViewById(R.id.Img_buridah);
        ImageView abha = findViewById(R.id.Img_abha);

        riy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), one.class);
                startActivity(one);
            }
        });

        khob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), one.class);
                startActivity(one);
            }
        });

        mak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), one.class);
                startActivity(one);
            }
        });

        jedd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), one.class);
                startActivity(one);
            }
        });

        buri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), one.class);
                startActivity(one);
            }
        });

        abha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), one.class);
                startActivity(one);
            }
        });

    }
}