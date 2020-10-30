package com.example.miwok_workshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final List<MiwokModel> phrase = new ArrayList<>();
        phrase.add(new MiwokModel("Where are you going?","minto wuksus"));
        phrase.add(new MiwokModel("What is your name?","tinnә oyaase'nә"));
        phrase.add(new MiwokModel("My name is...","oyaaset..."));
        phrase.add(new MiwokModel("How are you feeling?","michәksәs?"));
        phrase.add(new MiwokModel("I’m feeling good.","kuchi achit"));
        phrase.add(new MiwokModel("Are you coming?","әәnәs'aa?"));
        phrase.add(new MiwokModel("Yes, I’m coming.","hәә’ әәnәm"));
        phrase.add(new MiwokModel("I’m coming.","әәnәm"));
        phrase.add(new MiwokModel("Let’s go.","yoowutis"));
        phrase.add(new MiwokModel("Come here.","әnni'nem"));

        RecyclerView Pharases_recylerView = findViewById(R.id.recycleView3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);


        Pharases_recylerView.setLayoutManager(layoutManager);
        MiwokAdapter miwokAdapter=new MiwokAdapter(this,phrase, R.color.category_phrases);
        Pharases_recylerView.setAdapter(miwokAdapter);
    }
}