package com.example.qualtribe.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import androidx.annotation.NonNull;

import android.content.Intent;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qualtribe.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class buyer_login extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;
    TextView addEmail, addPassword, addSignUp;
    Button addLogin;
    ProgressBar prBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_login);

        mAuth = FirebaseAuth.getInstance();

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
// User is signed in
            startActivity(new Intent(buyer_login.this, Homepage.class));
            finish();
        }

        addEmail = findViewById(R.id.lEmail);
        addPassword = findViewById(R.id.lPassword);


        addSignUp = findViewById(R.id.lSignup);
        addSignUp.setOnClickListener(this);

        addLogin = findViewById(R.id.lLogin);
        addLogin.setOnClickListener(this);

        prBar = findViewById(R.id.lPr_Bar);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lLogin:
                loginPage();
                break;

            case R.id.lSignup:
                startActivity(new Intent(this, buyer_signup.class));
                finish();
        }

    }

    private void loginPage() {

        String email = addEmail.getText().toString().trim();
        String password = addPassword.getText().toString().trim();

        if(email.isEmpty()){
            addEmail.setError("Email Address is Required!");
            addEmail.requestFocus();
            return;
        }

        if(password.isEmpty()){
            addPassword.setError("Password is Required!");
            addPassword.requestFocus();
            return;
        }


        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            addEmail.setError("Please provide valid email!");
            addEmail.requestFocus();
            return;
        }



        if(password.length() < 6){
            addPassword.setError("Password length must be greater than 6");
            addPassword.requestFocus();
            return;
        }
        prBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

                    //redirect to the buyer home
                    Log.i("WISHA123", "onComplete: I am in LOgin ");
                   Toast.makeText(buyer_login.this, "You are already logged in",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(buyer_login.this, Homepage.class));
                    finish();

                }
                else{
                    Toast.makeText(buyer_login.this, "Failed to login. Please check your credentials", Toast.LENGTH_LONG).show();
                }


            }
        });

    }
}