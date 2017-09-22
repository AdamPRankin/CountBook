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
 * read tutorial https://stackoverflow.com/questions/37786796/how-to-display-an-arraylist-in-a-recyclerview
 */

public class CounterLayoutAdapter extends RecyclerView.Adapter<CounterLayoutAdapter.ViewHolder> {
    private ArrayList<Counter> counterList;

    public CounterLayoutAdapter(ArrayList<Counter> counterList) {
        this.counterList = counterList;
    }


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
            itemView.setOnClickListener(this);
            View.OnClickListener listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            };

            comment = itemView.findViewById(R.id.textComment);
            name = itemView.findViewById(R.id.textName);
            number = itemView.findViewById(R.id.editTextNum);
            /*
            up = (Button) itemView.findViewById(R.id.buttonUp);
            down = itemView.findViewById(R.id.buttonDown);
            reset = itemView.findViewById(R.id.buttonReset);
            edit = itemView.findViewById(R.id.buttonEdit);

            up.setOnClickListener(this);
            down.setOnClickListener(this);
            reset.setOnClickListener(this);
            edit.setOnClickListener(this);
            */

           // public void bindCounter(Counter counter){

            //number = counter.getCurrentValue();
           // }

        }

        @Override
        public void onClick(View view) {

            //// add switch for the different buttons here, and code for each
            if (view.getId() == edit.getId()) {

            }
            if (view.getId() == reset.getId()) {
                //Counter counter = counterList.get(position);
                //int newNumber = counter.getInitialValue();
                //counter.setCurrentValue(newNumber);

            }
            if (view.getId() == down.getId()) {
                //decrement number, change lasteditdate
            }
            if (view.getId() == up.getId()) {
                //incement number, change lasteditdate
            }

        }
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

        Button up = holder.itemView.findViewById(R.id.buttonUp);
        Button down = holder.itemView.findViewById(R.id.buttonDown);
        Button reset = holder.itemView.findViewById(R.id.buttonReset);
        Button edit = holder.itemView.findViewById(R.id.buttonEdit);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.decrementValue();
                notifyItemChanged(position);

            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.incrementValue();
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

            }
        });

        holder.name.setText(name);
        holder.comment.setText(comment);
        holder.number.setText(Integer.toString(number));

    }

    @Override
    public int getItemCount() {

        return counterList.size();
    }
}