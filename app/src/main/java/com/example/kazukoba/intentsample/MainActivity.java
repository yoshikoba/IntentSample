package com.example.kazukoba.intentsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.buttonStart);
        startButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);

    }
}
