package com.all.social.meadi.allinonesocialmediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout facebookLayout, instagramLayout, twitterLayout, linkedinLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebookLayout=findViewById(R.id.facebook_layout);
        instagramLayout=findViewById(R.id.instagram_layout);
        twitterLayout=findViewById(R.id.twitter_layout);
        linkedinLayout=findViewById(R.id.linkedin_layout);

        facebookLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fbintent=new Intent(MainActivity.this,FacebookWebviewActivity.class);
                startActivity(fbintent);
            }
        });

        instagramLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent instagramIntent=new Intent(MainActivity.this,InstagramActivity.class);
                startActivity(instagramIntent);
            }
        });

        twitterLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twitterIntent=new Intent(MainActivity.this,TwitterActivity.class);
                startActivity(twitterIntent);
            }
        });

        linkedinLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linedInIntent=new Intent(MainActivity.this,LinkedInActivity.class);
                startActivity(linedInIntent);

            }
        });

    }
}