package com.diseinnovation.fashionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class detail_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_screen);
    }

    public void goToSuccessPage(View v){
        Intent i = new Intent(getBaseContext(), success_screen.class);
        startActivity(i);
    }
}
