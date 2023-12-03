package com.example.giftdelivery;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class arraylist extends AppCompatActivity {

    private TextView textViewName;
    private TextView textViewEmail;
    private TextView textViewPass;
    private TextView textViewPhoneNumber;
    private TextView textViewAddress;
    private Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arraylist);

        textViewName = findViewById(R.id.textViewName);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewPass = findViewById(R.id.textViewPass);
        textViewPhoneNumber = findViewById(R.id.textViewPhoneNumber);
        textViewAddress = findViewById(R.id.textViewAddress);
        ok = findViewById(R.id.But_ok);

        Intent intent = getIntent();
        ArrayList<String> userData = intent.getStringArrayListExtra("userData");

        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String password = intent.getStringExtra("PASSWORD");
        String number = intent.getStringExtra("NUMBER");
        String address = intent.getStringExtra("ADDRESS");

        textViewName.setText("Name: " + name);
        textViewEmail.setText("Email: " + email);
        textViewPass.setText("PASSWORD: " + password);
        textViewPhoneNumber.setText("Number: " + number);
        textViewAddress.setText("ADDRESS: " + address);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showConfirmationDialog();
            }
        });
    }

    private void showConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Order Confirmation");
        builder.setMessage("Your order is completed");
        builder.setPositiveButton("Thank You", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Move to the next page (fainal.class)
                Intent intent = new Intent(getApplicationContext(), fainal.class);
                startActivity(intent);
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}