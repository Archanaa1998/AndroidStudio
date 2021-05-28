package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    Button add, sub, mul, div;
    TextView res;
    float num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.editTextTextPersonName);
        ed2=(EditText)findViewById(R.id.editTextTextPersonName2);
        add=(Button)findViewById(R.id.button);
        sub=(Button)findViewById(R.id.button2);
        mul=(Button)findViewById(R.id.button3);
        div=(Button)findViewById(R.id.button4);
        res=(TextView)findViewById(R.id.editTextTextPersonName3);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(ed1.getText().toString().trim());
                num2=Float.parseFloat(ed2.getText().toString().trim());
                result=num1+num2;
                res.setText(String.valueOf(result));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(ed1.getText().toString().trim());
                num2=Float.parseFloat(ed2.getText().toString().trim());
                result=num1-num2;
                res.setText(String.valueOf(result));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(ed1.getText().toString().trim());
                num2=Float.parseFloat(ed2.getText().toString().trim());
                result=num1*num2;
                res.setText(String.valueOf(result));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(ed1.getText().toString().trim());
                num2=Float.parseFloat(ed2.getText().toString().trim());
                result=num1/num2;
                res.setText(String.valueOf(result));
            }
        });
    }
}