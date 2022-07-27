package com.example.recyclerviewtestapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {

    private int numbersItem;
    private static int viewHolderCount;
    private Context parent;

    public NumberAdapter(int numbersItem, Context parent) {
        this.numbersItem = numbersItem;
        viewHolderCount = 0;

        this.parent = parent;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        int numberListItemId = R.layout.number_list_item;
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(numberListItemId,parent,false);

        NumberViewHolder numberViewHolder = new NumberViewHolder(view);

        numberViewHolder.indexViewHolder.setText("ViewHolder index " + viewHolderCount);
        viewHolderCount++;

        return numberViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.bind(position);

    }

    @Override
    public int getItemCount() {
        return numbersItem;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder {

        private TextView itemNumberView;
        private TextView indexViewHolder;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);

            itemNumberView = itemView.findViewById(R.id.tv_number_item);
            indexViewHolder = itemView.findViewById(R.id.tv_view_holder_id);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int possitionIndex = getAbsoluteAdapterPosition();

                    Toast.makeText(parent, "Element " + possitionIndex + " was tap", Toast.LENGTH_SHORT).show();

                }
            });


        }

        public void bind(int listIndex) {

            itemNumberView.setText(String.valueOf(listIndex));

        }
    }

}
