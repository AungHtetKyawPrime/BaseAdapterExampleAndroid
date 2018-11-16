package com.example.aspire.baseexampleandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

public class Recycleradapter extends BaseRecyclerViewAdapter<model,ViewHolder,R.layout>
        {
    public static int layout;
    public static List<model> data;
    Context gContext;

    public Recycleradapter(List<model> items, Context context, int layout_id) {
        super(items, context, layout_id);
        layout=layout_id;
        data=items;
        gContext=context;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        model m=data.get(position);
        holder.no.setText(m.getNo());
        holder.txt.setText(m.getTxt());
    }
}
