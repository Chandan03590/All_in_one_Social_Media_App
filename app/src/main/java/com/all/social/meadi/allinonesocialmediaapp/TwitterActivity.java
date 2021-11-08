package com.all.social.meadi.allinonesocialmediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TwitterActivity extends AppCompatActivity {

    WebView twitterwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        twitterwebView=findViewById(R.id.twitter_web_view);

        WebSettings settings=twitterwebView.getSettings();
        settings.setJavaScriptEnabled(true);

        twitterwebView.setWebViewClient(new WebViewClient());

        twitterwebView.loadUrl("https://twitter.com");
    }
}