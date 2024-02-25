package com.application.the_quiz_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginIntro extends AppCompatActivity {

    Button btnStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_intro);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);


        btnStarted = findViewById(R.id.btnGetStarted);
        btnStarted.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(LoginIntro.this, LoginActivity.class);
                        startActivity(i);
                    }
                }
        );
    }
}