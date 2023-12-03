package com.example.giftdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class showdata extends AppCompatActivity {

    private EditText editTextName, editTextEmail, editTexPassword, editTextPhoneNumber, editTextAddress;
    private Button But_Submit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);


        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTexPassword = findViewById(R.id.editTexPassword);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        editTextAddress = findViewById(R.id.editTextAddress);
        But_Submit = findViewById(R.id.But_Submit);


        But_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent submit = new Intent(getApplicationContext(), arraylist.class );
                Toast.makeText(showdata.this, "check your info !", Toast.LENGTH_SHORT).show();
                startActivity(submit);
                

                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String password = editTexPassword.getText().toString();
                String phoneNumber = editTextPhoneNumber.getText().toString();
                String address = editTextAddress.getText().toString();


                Intent intent = new Intent(showdata.this, arraylist.class);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", email);
                intent.putExtra("PASSWORD", password);
                intent.putExtra("NUMBER", phoneNumber);
                intent.putExtra("ADDRESS", address);
                startActivity(intent);
            }
        });
            }
        }