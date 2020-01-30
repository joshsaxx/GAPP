package com.example.gapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.github.glomadrian.codeinputlib.CodeInput;

import java.util.Arrays;

public class SecretPinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_pin);

     /*   CodeInput cInput = (CodeInput) findViewById(R.id.codeInput);
        cInput.setCodeReadyListener(new CodeInput.codeReadyListener() {
            @Override
            public void onCodeReady(Character[] code) {
                // Code has been entered ....
                Toast.makeText(SecretPinActivity.this,"code entered is : "+ Arrays.toString(code),Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
