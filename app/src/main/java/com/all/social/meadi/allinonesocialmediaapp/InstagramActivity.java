package com.all.social.meadi.allinonesocialmediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InstagramActivity extends AppCompatActivity {

    WebView instagramWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        instagramWebView=findViewById(R.id.instagram_web_view);

        WebSettings settings=instagramWebView.getSettings();
        settings.setJavaScriptEnabled(true);

        instagramWebView.setWebViewClient(new WebViewClient());

        instagramWebView.loadUrl("https://instagram.com");


    }
}