package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity2_for_option1 extends AppCompatActivity {

    TextView givenText;
    Button doneButton;
    String intentVariableName = "given msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_for_option1);

        givenText = findViewById(R.id.givenText);
        doneButton = findViewById(R.id.doneButton);

        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity2_for_option1.this, activity3_for_option1.class);
                intent.putExtra(intentVariableName,givenText.getText().toString());
                startActivity(intent);
            }
        });


    }
}