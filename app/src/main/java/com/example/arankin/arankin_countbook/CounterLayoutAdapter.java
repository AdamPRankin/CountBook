package com.example.arankin.arankin_countbook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.joda.time.LocalDate;

import java.util.ArrayList;

import static android.R.attr.data;
import static android.app.Activity.RESULT_OK;
//import static com.example.arankin.arankin_countbook.CounterLayoutAdapter.ViewHolder.EDIT_COUNTER_REQUEST;


/**
 * Created by arankin on 9/18/17.
 * read tutorial https://stackoverflow.com/questions/37786796/how-to-display-an-arraylist-in-a-recyclerview
 */

public class CounterLayoutAdapter extends RecyclerView.Adapter<CounterLayoutAdapter.ViewHolder> {
    private ArrayList<Counter> counterList;
    public static final int EDIT_COUNTER_REQUEST = 2;
    //private final Context context;

    public CounterLayoutAdapter(ArrayList<Counter> counterList) {
        this.counterList = counterList;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView name;
        private TextView comment;
        private TextView number;
        //private TextView date;



        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            comment = itemView.findViewById(R.id.textComment);
            name = itemView.findViewById(R.id.textName);
            number = itemView.findViewById(R.id.editTextNum);
            //date = itemView.findViewById(R.id.textDate);

        }

        @Override
        public void onClick(View view) {}
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout
        .row_layout, parent, false);
        return new ViewHolder(inflatedView);
    }




    @Override
    public void onBindViewHolder(CounterLayoutAdapter.ViewHolder holder, final int position) {
        final Counter counter = counterList.get(position);

        String comment = counter.getComment();
        String name = counter.getCounterName();
        int number = counter.getCurrentValue();
        //LocalDate modifyDate = counter.getLastModifyDate();

        Button up = holder.itemView.findViewById(R.id.buttonUp);
        Button down = holder.itemView.findViewById(R.id.buttonDown);
        Button reset = holder.itemView.findViewById(R.id.buttonReset);
        Button edit = holder.itemView.findViewById(R.id.buttonEdit);
        Button delete = holder.itemView.findViewById(R.id.buttonDelete);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.incrementValue();
                notifyItemChanged(position);

            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.decrementValue();
                notifyItemChanged(position);

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.resetCurrentValue();
                notifyItemChanged(position);

            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent editCounterPage = new Intent(context, EditCounterActivity.class);
                //context.startActivityForResult(editCounterPage, EDIT_COUNTER_REQUEST);



            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterList.remove(position);
                notifyDataSetChanged();

            }
        });

        holder.name.setText(name);
        holder.comment.setText(comment);
        holder.number.setText(Integer.toString(number));
        //holder.date.setText(modifyDate.toString());



    }

    @Override
    public int getItemCount() {

        return counterList.size();
    }
/*
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == EDIT_COUNTER_REQUEST && resultCode == RESULT_OK){
            int currentNumber = data.getIntExtra("current_number",0);
            int initialNumber = data.getIntExtra("initial_number",0);
            String name = data.getStringExtra("name");
            String comment = data.getStringExtra("comment");
            this.counter.setInitialValue(initialNumber);

        }

    }
    */



}