package com.example.qualtribe.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.qualtribe.R;

public class confirmPayment extends AppCompatActivity implements View.OnClickListener {

    ImageView home, message, search, order, profile;
    Button requirement;
    String PRICE, PKGDESC, EMAIL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_payment);
        Intent intent = getIntent();

        PRICE = intent.getStringExtra("PRICE");
        PKGDESC = intent.getStringExtra("PKGDESC");
        requirement = findViewById(R.id.required);
        requirement.setOnClickListener(this);

        home = findViewById(R.id.home_ic);
        home.setOnClickListener(this);

        message = findViewById(R.id.msg_ic);
        message.setOnClickListener(this);

        search = findViewById(R.id.search_ic);
        search.setOnClickListener(this);

        order = findViewById(R.id.order_ic);
        order.setOnClickListener(this);

        profile = findViewById(R.id.profile_ic);
        profile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.required:

                Intent i=new Intent(confirmPayment.this, PlaceOrder.class);
                i.putExtra("PRICE",PRICE);
                i.putExtra("PKGDESC",PKGDESC);
                startActivity(i);
                break;

            case R.id.home_ic:
                startActivity(new Intent(this, Homepage.class));
                break;

            case R.id.msg_ic:
                startActivity(new Intent(this, chat.class));
                break;

            case R.id.search_ic:
                startActivity(new Intent(this, loginSearch.class));
                break;

            case R.id.order_ic:
                startActivity(new Intent(this, Contract.class));
                break;

            case R.id.profile_ic:
                startActivity(new Intent(this, loginMenu.class));
                break;

        }

    }
}