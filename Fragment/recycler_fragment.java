package com.example.aspire.baseexampleandroid.Fragment;


import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aspire.baseexampleandroid.R;
import com.example.aspire.baseexampleandroid.Recycleradapter;
import com.example.aspire.baseexampleandroid.model;

import java.util.ArrayList;
import java.util.List;

public class recycler_fragment extends Fragment {
    List<model> personNames=new ArrayList<>();
    Recycleradapter customAdapter;
    RecyclerView recyclerView_one;
    public static int layout=R.layout.recycler_items;

    public recycler_fragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recycler_fragment,container,false);
    }

    @SuppressLint("NewApi")
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);

        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        customAdapter= new Recycleradapter(personNames,getContext(),layout);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
        prepareMovieData();

    }
    private void prepareMovieData() {
        model m=new model("1","Prime");
        personNames.add(m);
        m=new model("2","Aung");
        personNames.add(m);
        m=new model("3","Htet");
        personNames.add(m);
        m=new model("4","Kyaw");
        personNames.add(m);
        m=new model("5","Optimus");
        personNames.add(m);
        m=new model("6","Aung");
        personNames.add(m);
        m=new model("7","Htet");
        personNames.add(m);
        m=new model("8","Kyaw");
        personNames.add(m);
        m=new model("9","Optimus");
        personNames.add(m);
        m=new model("10","Aung");
        personNames.add(m);
        m=new model("11","Htet");
        personNames.add(m);
        m=new model("12","Kyaw");
        personNames.add(m);
        m=new model("13","Optimus");
        personNames.add(m);
        customAdapter.notifyDataSetChanged(); //this is not important
    }

}
