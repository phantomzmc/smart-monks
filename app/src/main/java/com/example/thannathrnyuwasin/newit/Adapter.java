package com.example.thannathrnyuwasin.newit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import static android.R.attr.name;

/**
 * Created by thannathrnyuwasin on 3/6/2017 AD.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Detail> detailList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public Adapter(List<Detail> detailList) {
        this.detailList = detailList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Detail detail = detailList.get(position);
        holder.title.setText(detail.getTitle());
        holder.genre.setText(detail.getGenre());
        holder.year.setText(detail.getYear());
    }

    @Override
    public int getItemCount() {
        return detailList.size();
    }


}
