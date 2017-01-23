package com.example.chintannaik.carrental;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.*;   import android.view.*;
import android.view.View.OnClickListener;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final Spinner cars = (Spinner) findViewById(R.id.spinner2);
        final Button next = (Button)findViewById(R.id.btnnext);

        Button b = (Button) findViewById(R.id.btnnext);
        b.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Page2.class));
            }
        });
    }
}
