package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText length;
    Button clickbtn;
    TextView displayCir;
    TextView measure;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        length = (EditText) findViewById(R.id.sqrlength);
        clickbtn = (Button) findViewById(R.id.sqrButton);
        displayCir = (TextView) findViewById(R.id.display4);
        measure = (TextView) findViewById(R.id.measure4);
        btnback = (Button) findViewById(R.id.backsqr);

        clickbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getlength = length.getText().toString();

                float convertlength = Float.parseFloat(getlength);

                float areaOfSqr = (convertlength * 2);
                displayCir.setText(String.valueOf(areaOfSqr));
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