package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        listView= (ListView)findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("001, 2/2/19, Maths, Actvivty 5 page 10");
        arrayList.add("002, 2/2/19, Sinhala, Actvivty 4 page 14");
        arrayList.add("003, 3/2/19, Sinhala, Actvivty 5 page 14");
        arrayList.add("004, 3/2/19,English, Actvivty 1,2 page 6");
        arrayList.add("005, 3/2/19,Maths, Actvivty 6 page 12");
        arrayList.add("006, 4/2/19,English, Actvivty 3,4 page 9");
        arrayList.add("007, 4/2/19,Buddhism, Actvivty 1,2 page 4");
        arrayList.add("008, 4/2/19,Sinhala, Actvivty 2 page 16");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }


    }
