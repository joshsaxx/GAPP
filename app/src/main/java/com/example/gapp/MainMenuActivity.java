package com.example.gapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
        AlertDialog.Builder a_builder = new AlertDialog.Builder(MainMenuActivity.this);
        a_builder.setMessage("Incorrect username or password!")
                .setCancelable(false)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showSP();
                    }
                });
        AlertDialog alert =a_builder.create();
        alert.setTitle("Error!!");
        alert.show();
        //startActivity(new Intent(this,SecretPinActivity.class));
    }

    public void showStations(View view) {
        startActivity(new Intent(this,InputDenomActivity.class));
    }

    public void showSP(){
        final View view = View.inflate(getBaseContext(),R.layout.activity_secret_pin,null);
        AlertDialog.Builder a_builder = new AlertDialog.Builder(MainMenuActivity.this);
        a_builder
                .setView(view)
                .setCancelable(false)

                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        //startActivity(new Intent(MainMenuActivity.this,MainMenu.class));

                    }
                })
                .setNegativeButton("Cancel", null);

        AlertDialog alert =a_builder.create();
        //alert.setTitle("Create Secret Pin");
        alert.show();
    }
}
