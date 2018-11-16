package com.example.aspire.baseexampleandroid;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView no,txt;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        no=(TextView)itemView.findViewById(R.id.no);
        txt=(TextView)itemView.findViewById(R.id.txt);

    }
}
