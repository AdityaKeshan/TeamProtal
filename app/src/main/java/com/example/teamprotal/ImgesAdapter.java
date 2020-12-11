package com.example.teamprotal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ImgesAdapter extends RecyclerView.Adapter<ImgesAdapter.ViewHolder> {
    private ArrayList<Imges> itemsData;

    public ImgesAdapter(ArrayList<Imges> itemsData) {
        this.itemsData = itemsData;
    }

    @Override
    public ImgesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                    int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.images_item, null);

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {


        viewHolder.imgViewIcon.setImageResource(itemsData.get(position).getImage());
        int height=itemsData.get(position).getHeight();
        int width=itemsData.get(position).getWidth();
        viewHolder.imgViewIcon.requestLayout();
        viewHolder.imgViewIcon.getLayoutParams().height=height;
        viewHolder.imgViewIcon.getLayoutParams().width=width;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgViewIcon;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);

            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.image1);
        }
    }


    @Override
    public int getItemCount() {
        return itemsData.size();
    }
}
