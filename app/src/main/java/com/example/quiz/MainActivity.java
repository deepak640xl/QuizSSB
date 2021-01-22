package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinner = (Spinner) findViewById(R.id.set);
       // Spinner spinner2 = (Spinner) findViewById(R.id.set2);

      //  Button button = (Button) findViewById(R.id.btn);


        String[] time = {"5seconds", "15 seconds", "25 seconds", " 35 seconds"};

        String[] setno = {"Select Set", "set1", "set2", "set3", "set4","set5"};


        ArrayAdapter ad
                = new ArrayAdapter(
                this,
                android.R.layout.simple_expandable_list_item_1, setno
        );


       spinner.setAdapter(ad);
//
//        ArrayAdapter adapter
//                = new ArrayAdapter(
//                this,
//                android.R.layout.simple_expandable_list_item_1, time
//        );
//
//
//        //spinner2.setAdapter(adapter);



          spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
          {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String selectedClass = adapterView.getItemAtPosition(i).toString();

                switch (selectedClass) {
                    case "set1":


                        Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent1);
                        break;
                    case "set2":


                        Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);
                        startActivity(intent2);
                        break;

                    case "set3":

                        Intent intent3 = new Intent(MainActivity.this, MainActivity4.class);
                        startActivity(intent3);
                        break;
                    case "set4":

                        Intent intent4 = new Intent(MainActivity.this, MainActivity5.class);
                        startActivity(intent4);
                        break;

                    case "set5":

                        Intent intent5 = new Intent(MainActivity.this, MainActivity6.class);
                        startActivity(intent5);
                        break;


                }


            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {




            }
        });
    }}