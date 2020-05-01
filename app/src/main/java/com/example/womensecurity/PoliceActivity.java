package com.example.womensecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PoliceActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView polcall;
    ImageView polmsg;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);

        imageView = findViewById(R.id.polwebbtn);
        polcall = findViewById(R.id.polcall);
        polmsg = findViewById(R.id.polmsg);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PoliceActivity.this, PolWeb.class));
            }
        });

        polcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_DIAL));
            }
        });

    }
}
