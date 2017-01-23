package com.example.chintannaik.carrental;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.view.*;
import android.view.View.OnClickListener;
import java.text.DecimalFormat;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        setContentView(R.layout.activity_page2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

    final RadioButton sedan = (RadioButton)findViewById(R.id.rbtsedan);
    final RadioButton suv = (RadioButton)findViewById(R.id.rbtsuv);
    final RadioButton minivan = (RadioButton)findViewById(R.id.rbtminivan);
    final EditText input = (EditText) findViewById(R.id.inputNumber);
    final Button calculate = (Button) findViewById(R.id.btncalculate);
    final TextView result = (TextView) findViewById(R.id.textResult);

    final double sedanRate = 30;
    final double suvRate = 40;
    final double minivanRate = 45;

    calculate.setOnClickListener(new OnClickListener() {
        public void onClick (View v){
            int i = Integer.parseInt(input.getText().toString());
            DecimalFormat currency = new DecimalFormat("$###,###.##");
            if (i > 30) {
                Toast.makeText(Page2.this, "Number of days should not be more than 30", Toast.LENGTH_SHORT).show();
                return;
            }
            if (sedan.isChecked())
                result.setText("Estimated Price is " + currency.format(i * sedanRate));
            if (suv.isChecked())
            result.setText("Estimated Price is " + currency.format(i * suvRate));
            if (minivan.isChecked())
            result.setText("Estimated Price is " + currency.format(i * minivanRate));
        }
    });
  }
}

