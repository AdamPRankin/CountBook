package com.example.arankin.arankin_countbook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.button;
import static com.example.arankin.arankin_countbook.R.id.buttonDown;

/**
 * Created by arankin on 9/18/17.
 * some code borrows from recyclerview tutorial http://www.vogella.com/tutorials/AndroidRecyclerView/article.html
 */

public class CounterLayoutAdapter extends RecyclerView.Adapter<CounterLayoutAdapter.ViewHolder> {
    private ArrayList<Counter> counterList;



    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView name;
        private TextView comment;
        private TextView number;
        private Button edit;
        private Button reset;
        private Button up;
        private Button down;


        public ViewHolder(View itemView) {
            super(itemView);

            //comment = itemView.findViewById(R.id.);
            // name = itemView.findViewById(R.id.);
            number = itemView.findViewById(R.id.editTextNum);
            up = itemView.findViewById(R.id.buttonUp);
            down = itemView.findViewById(R.id.buttonDown);
            reset = itemView.findViewById(R.id.buttonReset);
            edit = itemView.findViewById(R.id.buttonEdit);

           // public void bindCounter(Counter counter){

            //number = counter.getCurrentValue();
           // }


            ///set onclicklistender.this for each button



        }

        @Override
        public void onClick(View view) {

            //// add switch for the different buttons here, and code for each
            ///if (v.getId() == edit.getId()) then do stuff
            ///elif if (v.getId() == reset.getId()) etc

        }
    }

    public CounterLayoutAdapter(ArrayList<Counter> counters) {
        counterList = counters;
    }


    @Override
    public CounterLayoutAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout
        .row_layout, parent, false);
        return new ViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(CounterLayoutAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}