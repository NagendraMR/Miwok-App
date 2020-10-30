package com.example.miwok_workshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final List<MiwokModel> color=new ArrayList<>();
        color.add(new MiwokModel("red","weṭeṭṭi",R.drawable.color_red));
        color.add(new MiwokModel("green","chokokki",R.drawable.color_green));
        color.add(new MiwokModel("brown","ṭakaakki",R.drawable.color_brown));
        color.add(new MiwokModel("gray","ṭopoppi",R.drawable.color_gray));
        color.add(new MiwokModel("black","kululli",R.drawable.color_black));
        color.add(new MiwokModel("white","kelelli",R.drawable.color_white));
        color.add(new MiwokModel("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        color.add(new MiwokModel("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));


        RecyclerView color_recylerView = findViewById(R.id.recycleView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        color_recylerView.setLayoutManager(layoutManager);

        MiwokAdapter miwokAdapter=new MiwokAdapter(this,color, R.color.category_colors);
        colors_recyclerView.setAdapter(miwokAdapter);



    }
}