package com.example.teamprotal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import java.util.ArrayList;

import static androidx.recyclerview.widget.RecyclerView.HORIZONTAL;

public class FlashActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerViewStory,recyclerView;
    RecyclerView.Adapter adapterstory,adapter;
    ArrayList<Story> numbers;
    Button side;
    ArrayList<Imges> imgs;
    LinearLayoutManager gridLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        numbers=new ArrayList<>();
        numbers.add(new Story());
        numbers.add(new Story());
        numbers.add(new Story());
        numbers.add(new Story());
        numbers.add(new Story());
        numbers.add(new Story());
        numbers.add(new Story());numbers.add(new Story());
        numbers.add(new Story());
        numbers.add(new Story());
        numbers.add(new Story());

        side=findViewById(R.id.side_flash);
        side.setOnClickListener(v -> new CustomDialog(FlashActivity.this,R.id.flash).show());
        recyclerViewStory=findViewById(R.id.story_recy);
        recyclerViewStory.setHasFixedSize(true);
        adapterstory=new StoryAdapter(numbers);
        recyclerViewStory.setAdapter(adapterstory);
        gridLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, true);
        recyclerViewStory.setLayoutManager(gridLayoutManager);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2, LinearLayoutManager.HORIZONTAL,false);

        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                // 5 is the sum of items in one repeated section
                 if(position%3==0)
                 {
                     return 2;
                 }
                 else
                 {
                     return 1;
                 }

            }
        });

        GridLayoutManager layoutManager1 = new GridLayoutManager(this, 2, LinearLayoutManager.HORIZONTAL,false);

        layoutManager1.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                // 5 is the sum of items in one repeated section
                if(position%3==0)
                {
                    return 2;
                }
                else
                {
                    return 1;
                }

            }
        });

        GridLayoutManager layoutManager2= new GridLayoutManager(this, 2, LinearLayoutManager.HORIZONTAL,false);

        layoutManager2.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                // 5 is the sum of items in one repeated section
                if(position%3==0)
                {
                    return 2;
                }
                else
                {
                    return 1;
                }

            }
        });

        GridLayoutManager layoutManager3 = new GridLayoutManager(this, 2, LinearLayoutManager.HORIZONTAL,false);

        layoutManager3.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                // 5 is the sum of items in one repeated section
                if(position%3==0)
                {
                    return 2;
                }
                else
                {
                    return 1;
                }

            }
        });
        imgs=new ArrayList<>();
        {
            imgs.add(new Imges(R.drawable.img1, 500, 500));
            imgs.add(new Imges(R.drawable.img2, 250, 500));
            imgs.add(new Imges(R.drawable.img3, 250, 500));
            imgs.add(new Imges(R.drawable.img1, 500, 500));
            imgs.add(new Imges(R.drawable.img2, 250, 500));
            imgs.add(new Imges(R.drawable.img3, 250, 500));
            imgs.add(new Imges(R.drawable.img1, 500, 500));
            imgs.add(new Imges(R.drawable.img2, 250, 500));
            imgs.add(new Imges(R.drawable.img3, 250, 500));
            imgs.add(new Imges(R.drawable.img1, 500, 500));
            imgs.add(new Imges(R.drawable.img2, 250, 500));
            imgs.add(new Imges(R.drawable.img3, 250, 500));
        }

        recyclerView=findViewById(R.id.dancing_recy);
        recyclerView.setHasFixedSize(true);
        adapter=new ImgesAdapter(imgs);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        recyclerView=findViewById(R.id.singing_recy);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager1);
        recyclerView.setAdapter(adapter);

        recyclerView=findViewById(R.id.cooking_recy);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager2);
        recyclerView.setAdapter(adapter);

        recyclerView=findViewById(R.id.cooking1_recy);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager3);
        recyclerView.setAdapter(adapter);
    }
}