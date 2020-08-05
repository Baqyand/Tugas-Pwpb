package com.lineartorelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnrelative = findViewById(R.id.btnrelative);
        btnrelative.setOnClickListener(this);

        Button btnreal = findViewById(R.id.btnreal);
        btnreal.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnrelative:
                Intent move = new Intent(MainActivity.this, Relative.class);
                startActivity(move);
                break;
            case R.id.btnreal:
                Intent intent = new Intent(MainActivity.this, Linear.class);
                startActivity(intent);
                break;
        }
    }
}