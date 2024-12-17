package com.example.auth_with_firebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button login_btn,signup_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        login_btn=findViewById(R.id.btn1);
        signup_btn=findViewById(R.id.btn2);

        //OnClick Method

        //Login Button Click

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click To Login Button ", Toast.LENGTH_SHORT).show();
                Intent button1intent = new Intent(MainActivity.this, Login_Page.class);
                startActivity(button1intent);
            }
        });

        // Signup Button
        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click on Signup button ", Toast.LENGTH_SHORT).show();
                Intent button2intent=new Intent(MainActivity.this, Signup_Page.class);
                startActivity(button2intent);
            }
        });
    }
}