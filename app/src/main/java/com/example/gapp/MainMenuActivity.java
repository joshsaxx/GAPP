package com.example.gapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void showSettings(View view) {
    }

    public void logOut(View view) {
    }

    public void showHistory(View view) {
        startActivity(new Intent(this,SecretPinActivity.class));
    }

    public void showStations(View view) {
        startActivity(new Intent(this,InputDenomActivity.class));
    }
}
