package com.diseinnovation.fashionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class success_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success_screen);
    }

    public void goToHomePage(View v){
        Intent i = new Intent(getBaseContext(), home_screen.class);
        startActivity(i);
    }
}
