package com.angiecasillas.recycleviewejemplo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Usuario on 18/09/2016.
 */
public class Popular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
