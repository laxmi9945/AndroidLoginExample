package com.example.bridgeit.cardviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //CardView cardView= (CardView) findViewById(R.id.mycardView);
        recyclerView= (RecyclerView) findViewById(R.id.myrecyclerView);
        //RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView.LayoutManager layoutManager2=new GridLayoutManager(this,2);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,3);
        //RecyclerView.LayoutManager layoutManager3=new StaggeredGridLayoutManager(2,1);
       /* List<String> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add("WelCome "+i);
        }*/

        recyclerView.setLayoutManager(layoutManager2);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(this);
        recyclerView.setAdapter(recyclerAdapter);

    }
}
