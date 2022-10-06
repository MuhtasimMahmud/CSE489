package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner mySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySpinner = findViewById(R.id.mySpinner);

        ArrayAdapter<CharSequence> myadapter = ArrayAdapter.createFromResource(this, R.array.options, android.R.layout.simple_spinner_item);
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myadapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                String selected_option = myadapter.getItem(position).toString();

                if(selected_option.equals("Choose an option.")){
                    // exist on main activity
                }

                if(selected_option.equals("Custom broadcast receiver.")){
//                    Toast.makeText(MainActivity.this, selected_option, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, activity2_for_option1.class);
                    startActivity(intent);
                }

                if(selected_option.equals("Wifi RTT state change receiver.")){
//                    Toast.makeText(MainActivity.this, selected_option, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, activity3_for_option2.class);
                    startActivity(intent);
                }

                if(selected_option.equals("System battery notification receiver.")){
//                    Toast.makeText(MainActivity.this, selected_option, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, activity2_for_option3.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // do nothing
            }
        });

    }
}