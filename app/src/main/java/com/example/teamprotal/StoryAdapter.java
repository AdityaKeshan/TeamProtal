package com.example.teamprotal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {
    private ArrayList<Story> itemsData;

    public StoryAdapter(ArrayList<Story> itemsData) {
        this.itemsData = itemsData;
    }

    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_story, null);

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {


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
