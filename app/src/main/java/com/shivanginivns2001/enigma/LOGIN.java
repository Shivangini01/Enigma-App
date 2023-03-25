package com.shivanginivns2001.enigma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LOGIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

               MaterialButton loginbtn=(MaterialButton) findViewById(R.id.loginbtn);
               loginbtn.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                           Toast.makeText(LOGIN.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                       } else
                           Toast.makeText(LOGIN.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                   }});

               loginbtn.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {

                           Intent intent=new Intent( LOGIN.this,MainActivity.class);
                           startActivity(intent);
                       }



               });

    }}
