package com.example.giftdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class First extends AppCompatActivity {

    Button Toast1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        ImageView first = findViewById(R.id.Img_logo);
        Thread thread= new Thread(){
            public void run(){
                try {
                    sleep(4000);
                    Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        thread.start();
        Toast.makeText(First.this, "Welcom !", Toast.LENGTH_SHORT).show();
    }
}