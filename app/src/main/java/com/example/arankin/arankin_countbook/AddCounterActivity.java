package com.example.arankin.arankin_countbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddCounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_counter);


        EditText txtname = (EditText)findViewById(R.id.addNameText);
        EditText txtcomment = (EditText)findViewById(R.id.addCommentText);
        EditText txtnumber = (EditText)findViewById(R.id.addNumbertext);

        Button counterButton = (Button) findViewById(R.id.newCounterButton);
        counterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtname = (EditText)findViewById(R.id.addNameText);
                EditText txtcomment = (EditText)findViewById(R.id.addCommentText);
                EditText txtnumber = (EditText)findViewById(R.id.addNumbertext);
                String name = txtname.getText().toString();
                String comment = txtcomment.getText().toString();
                String value = txtnumber.getText().toString();
                int number=Integer.parseInt(value);

                Counter counter = new Counter(number,name,comment);

            }
        });
    }
}
