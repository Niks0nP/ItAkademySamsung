package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void OnButtonClick(View v){
        EditText element1 = (EditText)findViewById(R.id.editTextNumber);
        EditText element2 = (EditText)findViewById(R.id.editTextNumber2);
        TextView result = (TextView)findViewById(R.id.text);

        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int resSum = num1 + num2;
        result.setText(Integer.toString(resSum));
    }
    public void OnButtonClick2(View v){
        EditText element1 = (EditText)findViewById(R.id.editTextNumber);
        EditText element2 = (EditText)findViewById(R.id.editTextNumber2);
        TextView result = (TextView)findViewById(R.id.text);

        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int resSum = num1 - num2;
        result.setText(Integer.toString(resSum));
    }
    public void OnButtonClick3(View v){
        EditText element1 = (EditText)findViewById(R.id.editTextNumber);
        EditText element2 = (EditText)findViewById(R.id.editTextNumber2);
        TextView result = (TextView)findViewById(R.id.text);

        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int resSum = num1 * num2;
        result.setText(Integer.toString(resSum));
    }
    public void OnButtonClick4(View v){
        EditText element1 = (EditText)findViewById(R.id.editTextNumber);
        EditText element2 = (EditText)findViewById(R.id.editTextNumber2);
        TextView result = (TextView)findViewById(R.id.text);

        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int resSum = num1 / num2;
        result.setText(Integer.toString(resSum));
    }
}