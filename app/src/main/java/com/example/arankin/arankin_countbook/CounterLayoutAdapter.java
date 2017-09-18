package com.example.arankin.arankin_countbook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by arankin on 9/18/17.
 * some code borrows from recyclerview tutorial http://www.vogella.com/tutorials/AndroidRecyclerView/article.html
 */

public class CounterLayoutAdapter extends RecyclerView.Adapter<CounterLayoutAdapter.ViewHolder> {
    private ArrayList<Counter> counterList;

    public CounterLayoutAdapter(ArrayList<Counter> counters) {
        counterList = counters;
    }


    @Override
    public CounterLayoutAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CounterLayoutAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}