package com.example.bridgeit.cardviewtest;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bridgeit on 30/3/17.
 */

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
        Context context;
    public RecyclerAdapter(Context context) {
        this.context=context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        AppCompatImageView imageView;
        AppCompatTextView textView1,textView2;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView=(AppCompatImageView)itemView.findViewById(R.id.imageView);
            this.textView1=(AppCompatTextView)itemView.findViewById(R.id.titletextView1);
            this.textView2=(AppCompatTextView)itemView.findViewById(R.id.descptextView2);
        }
    }
}
