package com.example.womensecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FireWeb extends AppCompatActivity {

  WebView firewebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_web);

         firewebView = findViewById(R.id.fireweb);
         firewebView.setWebViewClient(new WebViewClient());
         firewebView.loadUrl("https://www.nmcnagpur.gov.in/fire-brigade-station");

        WebSettings webSettings = firewebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (firewebView.canGoBack()) {
            firewebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
