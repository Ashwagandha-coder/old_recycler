package com.example.recyclerviewtestapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {

    private int viewHolderCount;
    private static int counter;

    public NumberAdapter(int count) {
        this.viewHolderCount = count;
        counter = 0;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        return null;

    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return viewHolderCount;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder {

        private TextView itemNumberView;
        private TextView indexViewHolder;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);

            itemNumberView = itemView.findViewById(R.id.tv_number_item);
            indexViewHolder = itemView.findViewById(R.id.tv_view_holder_id);

        }

        public void bind(int lastIndex) {

            itemNumberView.setText(String.valueOf(lastIndex));

        }
    }

}
