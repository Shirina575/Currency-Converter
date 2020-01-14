package com.example.viserion.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Spinner convertFrom, convertTo;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.Input);
        convertFrom = (Spinner) findViewById(R.id.ConvertFrom);
        convertTo = (Spinner) findViewById(R.id.ConvertTo);
        output = (TextView) findViewById(R.id.Output);
        convertFrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

            }
        });


    }
}
