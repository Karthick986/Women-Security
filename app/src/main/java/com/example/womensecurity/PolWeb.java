package com.example.womensecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PolWeb extends AppCompatActivity {

    WebView polWebView;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pol_web);

        polWebView = findViewById(R.id.polweb);

        polWebView.setWebViewClient(new WebViewClient());
        //progressDialog.dismiss();
        polWebView.loadUrl("http://nagpurpolice.gov.in/");
        //progressDialog.dismiss();

        WebSettings webSettings = polWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (polWebView.canGoBack()) {
            polWebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
