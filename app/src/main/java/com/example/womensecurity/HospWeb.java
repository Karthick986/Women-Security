package com.example.womensecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HospWeb extends AppCompatActivity {

    WebView hospWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosp_web);

        hospWebView = findViewById(R.id.hospWeb);
        hospWebView.setWebViewClient(new WebViewClient());
        hospWebView.loadUrl("https://www.mapsofindia.com/nagpur/health/hospitals.html");

        WebSettings webSettings = hospWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (hospWebView.canGoBack()) {
            hospWebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
