package com.all.social.meadi.allinonesocialmediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FacebookWebviewActivity extends AppCompatActivity {

    WebView fbWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_webview);

        fbWebView=findViewById(R.id.fb_web_view);

        WebSettings settings=fbWebView.getSettings();
        settings.setJavaScriptEnabled(true);

        fbWebView.setWebViewClient(new WebViewClient());

        fbWebView.loadUrl("https://www.facebook.com");
    }
}