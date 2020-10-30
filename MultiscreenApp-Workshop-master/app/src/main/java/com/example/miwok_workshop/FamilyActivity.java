package com.example.miwok_workshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<MiwokModel> family = new ArrayList<>();
        family.add(new MiwokModel("father","әpә",R.drawable.family_father));
        family.add(new MiwokModel("mother","әṭa",R.drawable.family_mother));
        family.add(new MiwokModel("son","angsi",R.drawable.family_son));
        family.add(new MiwokModel("daughter","tune",R.drawable.family_daughter));
        family.add(new MiwokModel("older brother","taachi",R.drawable.family_older_brother));
        family.add(new MiwokModel("younger brother","chalitti",R.drawable.family_younger_brother));
        family.add(new MiwokModel("older sister","teṭe",R.drawable.family_older_sister));
        family.add(new MiwokModel("younger sister","kolliti",R.drawable.family_younger_sister));
        family.add(new MiwokModel("grandmother","ama",R.drawable.family_grandmother));
        family.add(new MiwokModel("grandfather","paapa",R.drawable.family_grandfather));


        RecyclerView family_recylerView = findViewById(R.id.recycleView2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        family_recylerView.setLayoutManager(layoutManager);

        MiwokAdapter miwokAdapter=new MiwokAdapter(this,family, R.color.category_family);
        family_recylerView.setAdapter(miwokAdapter);



    }
}