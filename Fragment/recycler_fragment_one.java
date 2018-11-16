package com.example.aspire.baseexampleandroid.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.aspire.baseexampleandroid.R;
import com.example.aspire.baseexampleandroid.Recycleradapter;
import com.example.aspire.baseexampleandroid.model;

import java.util.ArrayList;
import java.util.List;


public class recycler_fragment_one extends Fragment{
    List<model> personNames=new ArrayList<>();
    Recycleradapter customAdapter;
    RecyclerView recyclerView_one;
    public static int layout=R.layout.recycler_items;
    public recycler_fragment_one(){
        //default
    }


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recycler_fragment_one, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_one);

        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        customAdapter= new Recycleradapter(personNames,getContext(),layout);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
        prepareMovieData();


    }
    private void prepareMovieData() {
        model m=new model("1","Mother");
        personNames.add(m);
        m=new model("2","Father");
        personNames.add(m);
        m=new model("3","Me");
        personNames.add(m);
        m=new model("4","Younger sister");
        personNames.add(m);
        m=new model("5","Youngest sister");
        personNames.add(m);
        m=new model("6","Grand fa");
        personNames.add(m);
        m=new model("7","Grand ma");
        personNames.add(m);
        m=new model("8","Aunt");
        personNames.add(m);
        m=new model("9","Grand Grand fa");
        personNames.add(m);
        m=new model("10","My Friends");
        personNames.add(m);
        m=new model("11","My Office");
        personNames.add(m);
        m=new model("12","Android");
        personNames.add(m);
        m=new model("13","Optimus");
        personNames.add(m);
        customAdapter.notifyDataSetChanged(); //this is not important
    }
}
