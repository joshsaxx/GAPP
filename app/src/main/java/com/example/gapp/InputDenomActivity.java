package com.example.gapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InputDenomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_denom);
    }

    public void showEnterAmountPage(View view) {
        startActivity(new Intent(this,EnterAmountActivity.class));
    }
}
