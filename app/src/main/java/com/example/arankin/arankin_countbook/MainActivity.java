package com.example.arankin.arankin_countbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button counterButton = (Button) findViewById(R.id.newCounterButton);
        counterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent counterPage = new Intent(MainActivity.this, AddCounterActivity.class);
                startActivity(counterPage);
            }
        });
    }
}
