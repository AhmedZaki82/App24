package com.example.android.app24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtArrayValues = (TextView) findViewById(R.id.txtArrayValues);
        TextView txtAverageValue = (TextView) findViewById(R.id.txtAverageValue);

        String oldTxtArrayValues;


        int[] intArray = {2,4,54,6,7,43,23,75,7,8,4,22,89};

        for (int index = 0; index < intArray.length; index++) {

            oldTxtArrayValues = txtArrayValues.getText().toString();

            txtArrayValues.setText(oldTxtArrayValues +intArray[index] + "         ");

            txtAverageValue.setText(average(intArray) + "");


        }
    }

    public double average(int... scores) {

        double total = 0;

        for (int amount : scores) {

            total += amount;
        }
        return total / scores.length;
    }
}
