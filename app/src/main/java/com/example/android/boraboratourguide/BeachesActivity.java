package com.example.android.boraboratourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeachesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.box, new AttractionsFragment())
                .commit();
    }

}
