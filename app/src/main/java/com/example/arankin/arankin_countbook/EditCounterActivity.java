package com.example.arankin.arankin_countbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by arankin on 9/22/17.
 */

public class EditCounterActivity extends AppCompatActivity {

        private View.OnClickListener newCounterListener = new View.OnClickListener() {
            public void onClick(View v) {
                EditText txtname = (EditText)findViewById(R.id.editName);
                EditText txtcomment = (EditText)findViewById(R.id.editComment);
                EditText txtcurrentnum = (EditText)findViewById(R.id.editCurrentValue);
                EditText txtinitialnum = (EditText)findViewById(R.id.editInitialValue);
                String newName = txtname.getText().toString();
                String newComment = txtcomment.getText().toString();
                String newCurrentValueString = txtcurrentnum.getText().toString();
                String newInitialValueString = txtinitialnum.getText().toString();
                int newCurrentValue = Integer.parseInt(newCurrentValueString);
                int newInitialValue = Integer.parseInt(newInitialValueString);

                Intent returnIntent = getIntent();
                returnIntent.putExtra("name",newName);
                returnIntent.putExtra("comment",newComment);
                returnIntent.putExtra("current_number",newCurrentValue);
                returnIntent.putExtra("initial_number",newInitialValue);
                setResult(Activity.RESULT_OK,returnIntent);
                finish();

            }
        };


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_edit_counter);
            Button editCounterButton = (Button) findViewById(R.id.editCounterButton);
            editCounterButton.setOnClickListener(newCounterListener);

        }
    }
}
