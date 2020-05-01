package com.example.womensecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GiveAlertActivity extends AppCompatActivity {

    Button police, hosp, fire, helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_alert);

        police = findViewById(R.id.police);
        hosp = findViewById(R.id.hospital);
        fire = findViewById(R.id.fire);
        helper = findViewById(R.id.helpers);

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GiveAlertActivity.this, PoliceActivity.class));
                //Toast.makeText(GiveAlertActivity.this, "Method to call nearby police or message", Toast.LENGTH_SHORT).show();
            }
        });

        hosp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GiveAlertActivity.this, HospitalActivity.class));
               // Toast.makeText(GiveAlertActivity.this, "Method to call nearby hospital or message ", Toast.LENGTH_SHORT).show();
            }
        });

        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GiveAlertActivity.this, FireActivity.class));
                //Toast.makeText(GiveAlertActivity.this, "Method to call nearby fire brigade or message", Toast.LENGTH_SHORT).show();
            }
        });

        helper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GiveAlertActivity.this, HelpersActivity.class));
                //Toast.makeText(GiveAlertActivity.this, "Method to call nearby helpers or message", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
