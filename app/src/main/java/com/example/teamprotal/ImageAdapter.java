package com.example.teamprotal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {
    private ArrayList<Imge> itemsData;

    public ImageAdapter(ArrayList<Imge> itemsData) {
        this.itemsData = itemsData;
    }

    @Override
    public ImageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                                    int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

      ;
        viewHolder.imgViewIcon.setImageResource(itemsData.get(position).getImg());
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgViewIcon;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);

            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.image);
        }
    }


    @Override
    public int getItemCount() {
        return itemsData.size();
    }
}
