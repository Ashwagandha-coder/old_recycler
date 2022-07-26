package com.example.recyclerviewtestapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
