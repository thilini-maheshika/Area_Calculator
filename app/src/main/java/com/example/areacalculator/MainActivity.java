package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText length;
    EditText width;
    Button clickbtn;
    TextView displayRect;
    TextView measure;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        length = (EditText) findViewById(R.id.edgex);
        width = (EditText) findViewById(R.id.width1Id);
        clickbtn = (Button) findViewById(R.id.rectclick);
        displayRect = (TextView) findViewById(R.id.display3);
        measure = (TextView) findViewById(R.id.measure3);
        btnback = (Button) findViewById(R.id.back2);

        clickbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getlength = length.getText().toString();
                String getwidth = width.getText().toString();

                float convertlength = Float.parseFloat(getlength);
                float convertwidth = Float.parseFloat(getwidth);

                float areaOfRect = (convertlength * convertwidth);
                displayRect.setText(String.valueOf(areaOfRect));
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(),Home.class));

            }
        });

        measure.setText("Cm");
    }
}