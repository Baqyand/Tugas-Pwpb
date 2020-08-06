package com.lineartorelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Relative extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        Button btnkembali = findViewById(R.id.btn_kembali);
        btnkembali.setOnClickListener(this);

        Button btnnext = findViewById(R.id.btn_next);
        btnnext.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_kembali:
                Intent move = new Intent(Relative.this, MainActivity.class);
                startActivity(move);
                break;
            case R.id.btn_next:
                String pn = "085708339519";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + pn));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}