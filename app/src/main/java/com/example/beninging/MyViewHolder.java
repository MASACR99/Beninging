package com.example.beninging;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView wordItemView;
    MyRecyclerViewAdapter mAdapter;

    public MyViewHolder(@NonNull View itemView,MyRecyclerViewAdapter adapter) {
        super(itemView);
        wordItemView = (TextView) itemView.findViewById(R.id.label);
        this.mAdapter = adapter;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        wordItemView.setText("Clicked!"+wordItemView.getText());
    }
}
