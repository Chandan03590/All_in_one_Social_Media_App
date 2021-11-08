package com.all.social.meadi.allinonesocialmediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LinkedInActivity extends AppCompatActivity {

    WebView linkedInWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linked_in);

        linkedInWebView=findViewById(R.id.linkedin_web_view);

        WebSettings settings=linkedInWebView.getSettings();
        settings.setJavaScriptEnabled(true);

        linkedInWebView.setWebViewClient(new WebViewClient());

        linkedInWebView.loadUrl("https://linkedin.com");
    }
}