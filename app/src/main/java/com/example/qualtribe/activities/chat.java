package com.example.qualtribe.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.qualtribe.R;

public class chat extends AppCompatActivity implements View.OnClickListener {

    ImageView home, search, order, profile;
    CardView chat1, chat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        chat1 = findViewById(R.id.chat1);
        chat1.setOnClickListener(this);

        chat2 = findViewById(R.id.chat2);
        chat2.setOnClickListener(this);


        home = findViewById(R.id.home_ic);
        home.setOnClickListener(this);

        search = findViewById(R.id.search_ic);
        search.setOnClickListener(this);

        profile = findViewById(R.id.profile_ic);
        profile.setOnClickListener(this);

        order = findViewById(R.id.order_ic);
        order.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.home_ic:
                startActivity(new Intent(this, Homepage.class));
                break;

            case R.id.order_ic:
                startActivity(new Intent(this, Contract.class));
                break;

            case R.id.search_ic:
                startActivity(new Intent(this, loginSearch.class));
                break;

            case R.id.profile_ic:
                startActivity(new Intent(this, loginMenu.class));
                break;

            case R.id.chat1:
                startActivity(new Intent(this, inbox.class));
                break;

            case R.id.chat2:
                startActivity(new Intent(this, inbox.class));
                break;

        }
    }
}