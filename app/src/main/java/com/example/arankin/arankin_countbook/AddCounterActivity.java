package com.example.arankin.arankin_countbook;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.data;

public class AddCounterActivity extends AppCompatActivity {

    private View.OnClickListener newCounterListener = new View.OnClickListener() {
        public void onClick(View v) {

            EditText txtname = (EditText)findViewById(R.id.addNameText);
            EditText txtcomment = (EditText)findViewById(R.id.addCommentText);
            EditText txtnumber = (EditText)findViewById(R.id.addNumbertext);
            String name = txtname.getText().toString();
            String comment = txtcomment.getText().toString();
            String value = txtnumber.getText().toString();

            if (name.trim().length() == 0) {
                Toast.makeText(AddCounterActivity.this, "Please Enter a Name", Toast.LENGTH_SHORT).show();
            }

            else if (value.trim().length() == 0) {
                Toast.makeText(AddCounterActivity.this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
            }

            else {
                int number=Integer.parseInt(value);
                Intent returnIntent = getIntent();
                returnIntent.putExtra("name", name);
                returnIntent.putExtra("comment", comment);
                returnIntent.putExtra("number", number);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }

        }
    };

    private View.OnClickListener cancelListener = new View.OnClickListener() {
        public void onClick(View v) {
            Intent cancelIntent = new Intent();
            setResult(RESULT_CANCELED, cancelIntent);
            finish();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_counter);
        Button counterButton = (Button) findViewById(R.id.newCounterButton);
        Button cancelButton = (Button) findViewById(R.id.buttonCancelAdd);
        cancelButton.setOnClickListener(cancelListener);
        counterButton.setOnClickListener(newCounterListener);

    }
}
