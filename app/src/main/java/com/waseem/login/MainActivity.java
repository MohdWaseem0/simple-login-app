package com.waseem.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText logintext,passwordtext;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logintext = (EditText) findViewById(R.id.login);
        passwordtext = (EditText) findViewById(R.id.password);
        btnlogin = (Button) findViewById(R.id.buttonLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = logintext.getText().toString();
                String password = passwordtext.getText().toString();
                if (username.equals("user") && (password.equals("123456"))) {
                    Toast.makeText(MainActivity.this, "welcome", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getApplicationContext(),NewActivity.class);
                    startActivity(intent);

                }else
                {
                    Toast.makeText(MainActivity.this, "Invalid details", Toast.LENGTH_SHORT).show();
            }
        };
    });
}}