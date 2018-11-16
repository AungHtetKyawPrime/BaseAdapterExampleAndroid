package com.example.aspire.baseexampleandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class BaseRecyclerViewAdapter <T, Z extends RecyclerView.ViewHolder,I>
        extends RecyclerView.Adapter<Z> {
    protected final Context mContext;
    public List<T> mItems;

    public static int J;
    public BaseRecyclerViewAdapter(List<T> items, Context context,int layout_id) {
        if (items == null) {
            items = new ArrayList<T>();
        }
        mItems = items;
        mContext = context;
        J=layout_id;
        }
        @NonNull
        @Override
    public Z onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
           View itemView = LayoutInflater.from(parent.getContext())
                .inflate(J, parent, false);
           return (Z) new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Z holder, int position) {

    }

    public int getItemCount() {
        return mItems.size();
    }
}
