package com.example.qualtribe.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.qualtribe.R;
import com.google.firebase.auth.FirebaseAuth;

public class Seller_Login extends AppCompatActivity implements View.OnClickListener{
    private Button LOGOUT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller__login);

        LOGOUT = findViewById(R.id.Logt);
        LOGOUT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FirebaseAuth.getInstance().signOut();
        Intent intent=new Intent(Seller_Login.this, buyer_login.class);
        Seller_Login.this.startActivity(intent);
        finish();

    }
}