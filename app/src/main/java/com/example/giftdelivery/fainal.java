package com.example.giftdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class fainal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fainal);

        ImageView done = findViewById(R.id.Img_done);

        Thread don = new Thread(() -> {

            try {
                Thread.sleep(2000);
                Intent last = new Intent(getApplicationContext(), opinions.class);
                startActivity(last);
                finish();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        don.start();
    }
}