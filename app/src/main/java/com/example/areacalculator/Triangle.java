package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangle extends AppCompatActivity {

    EditText edgeX;
    EditText edgeY;
    TextView displayArea;
    Button calcbtn;
    Button backbtn;
    TextView measure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        edgeX = (EditText) findViewById(R.id.trbase);
        edgeY = (EditText) findViewById(R.id.trheight);
        displayArea = (TextView) findViewById(R.id.displaytri);
        calcbtn = (Button) findViewById(R.id.triclick);
        backbtn = (Button) findViewById(R.id.back2);
        measure = (TextView) findViewById(R.id.measure2);

        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getedgex = edgeX.getText().toString();
                String getedgey = edgeY.getText().toString();

                float convertX = Float.parseFloat(getedgex);
                float convertY = Float.parseFloat(getedgey);

                float area = (convertX * convertY) / 2;
                displayArea.setText(String.valueOf(area));
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              startActivity(new Intent(getApplicationContext(),Home.class));

            }
        });

        measure.setText("Cm");

    }
}