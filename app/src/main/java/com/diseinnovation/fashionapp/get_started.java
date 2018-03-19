package com.diseinnovation.fashionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class get_started extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_started);
    }


    public void getstartedPage(View v){
        Intent i = new Intent(getBaseContext(), home_screen.class);
        startActivity(i);
    }
}
