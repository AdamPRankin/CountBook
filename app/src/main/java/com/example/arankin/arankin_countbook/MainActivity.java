package com.example.arankin.arankin_countbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final int NEW_COUNTER_REQUEST = 1;

    ArrayList<Counter> counterList = new ArrayList<Counter>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button counterButton = (Button) findViewById(R.id.newCounterButton);
        counterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent counterPage = new Intent(MainActivity.this, AddCounterActivity.class);
                startActivityForResult(counterPage, NEW_COUNTER_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == NEW_COUNTER_REQUEST && resultCode == RESULT_OK){
            int number = data.getIntExtra("number",0);
            String name = data.getStringExtra("name");
            String comment = data.getStringExtra("comment");
            Counter newCounter = new Counter(number,name,comment);
            counterList.add(newCounter);

        }

    }
}