package com.example.citizenelectronics.calcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaring
    EditText editTextFirst, editTextSecond;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Creating the memory and blank screen for your activity
        setContentView(R.layout.activity_main); // Draws the layout on the blank screen

        // Initialization
        editTextFirst = (EditText) findViewById(R.id.edit_text_first_number);
        editTextSecond = (EditText) findViewById(R.id.edit_Text_second_number);
        textViewResult = (TextView) findViewById(R.id.textView_Result);
    }

    public void onClickButton(View view) {

    }

    public void onClickSum(View view) {
        int x = Integer.parseInt(editTextFirst.getText().toString());
        int y = Integer.parseInt(editTextSecond.getText().toString());
        int result= x+y;
        textViewResult.setText(""+result);
    }

    public void onClickDisplay(View view) {
        //String enteredValue = editTextFirst.getText().toString();
        textViewResult.setText(editTextFirst.getText().toString());
    }
}
