package com.example.meesh.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   /*     RadioGroup radiogrp = (RadioGroup)findViewById(R.id.radiobutton);
        radiogrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i){
                    case R.id.radiobtn1:
                        Toast.makeText(MainActivity.this,"you select Male",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.radiobtn2:
                        Toast.makeText(MainActivity.this,"you select Female",Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });*/
//
          /*CheckBox chckbox1 =(CheckBox)findViewById(R.id.checkBox1);
       CheckBox chckbox2 =(CheckBox)findViewById(R.id.checkBox2);
       chckbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Java",Toast.LENGTH_LONG).show();
            }
            });

            chckbox2.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               Toast.makeText(MainActivity.this,"Xml",Toast.LENGTH_LONG).show();

           }
        });*/

       /* ToggleButton toggle= (ToggleButton)findViewById(R.id.toggleButton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this,"On",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Off",Toast.LENGTH_LONG).show();
                }
            }
        });*/
//
//        Switch swit = (Switch)findViewById(R.id.switch1);
//        swit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
//                if(isChecked){
//                    Toast.makeText(MainActivity.this,"On",Toast.LENGTH_LONG).show();
//                }
//                else{
//                    Toast.makeText(MainActivity.this,"Off",Toast.LENGTH_LONG).show();
//
//                }
//            }
//        });
//
       final Spinner sp = (Spinner)findViewById(R.id.spinner);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,sp.getSelectedItem().toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        /*Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Message sent", Toast.LENGTH_SHORT).show();
            }
        });*/
    }

}
