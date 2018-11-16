package com.example.aspire.baseexampleandroid;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.aspire.baseexampleandroid.Fragment.recycler_fragment;
import com.example.aspire.baseexampleandroid.Fragment.recycler_fragment_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    Button reycler_fragment,reycler_fragment_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getFragmentManager();
        reycler_fragment=(Button)findViewById(R.id.btnFragment1);
        reycler_fragment_one=(Button)findViewById(R.id.btnFragment2);
        reycler_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(new recycler_fragment(),false);

            }
        });
        reycler_fragment_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(new recycler_fragment_one(),false);

            }
        });
    }
    public void changeFragment(Fragment target, Boolean addToBackStack) {
        FragmentTransaction ft = fragmentManager.beginTransaction();

        ft.replace(R.id.container, target);

        if (addToBackStack) {
            ft.addToBackStack(target.getTag());
        }
        ft.commit();
    }



    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        changeFragment(new recycler_fragment(),false);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
    }
}
