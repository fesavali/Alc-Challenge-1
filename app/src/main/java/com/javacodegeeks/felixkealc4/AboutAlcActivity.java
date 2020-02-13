package com.javacodegeeks.felixkealc4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutAlcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_about_alc);
        WebView webView = new WebView(this);
        webView.loadUrl("https://andela.com/alc/");
        setContentView(webView);
    }

}
