package com.example.mysimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v) {
        EditText num1 = (EditText)findViewById(R.id.editTextNumber);
        EditText num2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText num3 = (EditText)findViewById(R.id.editTextNumber3);
        double n1 = Integer.parseInt(num1.getText().toString());
        double n2 = Integer.parseInt(num2.getText().toString());
        double result = n1 + n2;
        num3.setText("Added Value " + result);


    }

    public void Subtract(View v) {
        EditText num1 = (EditText) findViewById(R.id.editTextNumber);
        EditText num2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText num3 = (EditText) findViewById(R.id.editTextNumber3);
        double n1 = Integer.parseInt(num1.getText().toString());
        double n2 = Integer.parseInt(num2.getText().toString());
        double result = n1 - n2;
        num3.setText("Subtracted Value " + result);

    }

    public void Multiply(View v) {
        EditText num1 = (EditText) findViewById(R.id.editTextNumber);
        EditText num2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText num3 = (EditText) findViewById(R.id.editTextNumber3);
        double n1 = Integer.parseInt(num1.getText().toString());
        double n2 = Integer.parseInt(num2.getText().toString());
        double result = n1 * n2;
        num3.setText("Multiplied Value " + result);
    }

    public void Divide(View v) {
        EditText num1 = (EditText) findViewById(R.id.editTextNumber);
        EditText num2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText num3 = (EditText) findViewById(R.id.editTextNumber3);
        double n1 = Integer.parseInt(num1.getText().toString());
        double n2 = Integer.parseInt(num2.getText().toString());
        double result = n1 / n2;
        num3.setText("Divided Value  " + result);
    }
}

