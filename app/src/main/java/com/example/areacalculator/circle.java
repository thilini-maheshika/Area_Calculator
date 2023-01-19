package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class circle extends AppCompatActivity {

    EditText radius;
    Button clickbtn;
    TextView displayCir;
    TextView measure;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        radius = (EditText) findViewById(R.id.radiusId);
        clickbtn = (Button) findViewById(R.id.circleclick);
        displayCir = (TextView) findViewById(R.id.display1);
        measure = (TextView) findViewById(R.id.measureId);
        btnback = (Button) findViewById(R.id.backcir);

        clickbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getradius = radius.getText().toString();

                float convertradius = Float.parseFloat(getradius);

                float areaOfSqr = (float) (3.17 * convertradius * convertradius);
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