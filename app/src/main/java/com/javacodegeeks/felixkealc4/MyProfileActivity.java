package com.javacodegeeks.felixkealc4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_my_profile);
        ImageView imageView = findViewById(R.id.my_prof);
        TextView textView = findViewById(R.id.my_name);
        TextView textView1 = findViewById(R.id.track);
        TextView textView2 = findViewById(R.id.country);
        TextView textView3 = findViewById(R.id.mail);
        TextView textView4 = findViewById(R.id.number);
        TextView textView5 = findViewById(R.id.slack);
    }
}
