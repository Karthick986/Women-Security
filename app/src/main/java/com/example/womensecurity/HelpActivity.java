package com.example.womensecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HelpActivity extends AppCompatActivity {

    WebView helpWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        helpWebView = findViewById(R.id.helpWeb);

        helpWebView.setWebViewClient(new WebViewClient());
        //progressDialog.dismiss();
        helpWebView.loadUrl("https://www.onefamily.com/talking-finance/wellbeing/six-ways-to-help-your-community/");
        //progressDialog.dismiss();

        WebSettings webSettings = helpWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (helpWebView.canGoBack()) {
            helpWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
