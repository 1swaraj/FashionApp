package com.diseinnovation.fashionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
    }

    public void goToDetailPage(View v){
        Intent i = new Intent(getBaseContext(), detail_screen.class);
        startActivity(i);
    }
}

