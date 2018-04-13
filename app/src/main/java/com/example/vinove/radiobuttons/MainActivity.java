package com.example.vinove.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatRadioButton;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppCompatRadioButton appCompatRadioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_id);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //when we select each of the RadioButtons, it's Id will be Stored in this "i" variable

                switch (checkedId) {

                    case R.id.radioButton_id_1:

                        Toast.makeText(getApplicationContext(), "RadioButton One", Toast.LENGTH_LONG).show();

                        break;

                    case R.id.radioButton_id_2:
                        Toast.makeText(getApplicationContext(), "RadioButton Two", Toast.LENGTH_LONG).show();
                        break;

                }


            }
        });
/*
        appCompatRadioButton = (AppCompatRadioButton) findViewById(R.id.radioButton_id_1);

        appCompatRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {

                    Toast.makeText(MainActivity.this, "RadioButton is Selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "RadioButton is not Selected", Toast.LENGTH_SHORT).show();

                }

            }
        });*/

    }
}
