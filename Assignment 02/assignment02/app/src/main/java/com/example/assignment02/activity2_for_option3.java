package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity2_for_option3 extends AppCompatActivity {

    TextView givenBatteryPercentage;
    Button doneButton;
    public String intentVariableName = "given Text";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_for_option3);


        givenBatteryPercentage = findViewById(R.id.givenBatteryPercentage);
        doneButton = findViewById(R.id.doneButton);

        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String batteryPercentage = givenBatteryPercentage.getText().toString();

                Intent intent = new Intent(activity2_for_option3.this, activity3_for_option3.class);
                intent.putExtra(intentVariableName,batteryPercentage);
                startActivity(intent);
            }
        });


    }
}