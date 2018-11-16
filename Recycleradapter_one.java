package com.example.aspire.baseexampleandroid;

import android.content.Context;
import android.support.annotation.NonNull;

import java.util.List;

public class Recycleradapter_one extends BaseRecyclerViewAdapter<model_one,ViewHolder,R.layout> {
    public static int layout;
    public static List<model_one> data_one;
    Context gContext;
    public Recycleradapter_one(List<model_one> item, Context context, int layout_id) {
        super(item, context, layout_id);
        layout=layout_id;
        data_one=item;
        gContext=context;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        model_one m=data_one.get(position);
        holder.no.setText(m.getNo());
        holder.txt.setText(m.getTxt());
    }
}
