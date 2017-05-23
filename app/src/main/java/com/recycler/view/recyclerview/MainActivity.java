package com.recycler.view.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Skills> skillsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Final aFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv1);
        aFinal = new Final(skillsList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(aFinal);

        prepareSkillsList();
    }

    private void prepareSkillsList() {

        Skills skills = new Skills(R.drawable.c,"C");
        skillsList.add(skills);
        skills = new Skills(R.drawable.cpp,"C++");
        skillsList.add(skills);
        skills = new Skills(R.drawable.java,"JAVA");
        skillsList.add(skills);
        skills = new Skills(R.drawable.html,"HTML");
        skillsList.add(skills);
        skills = new Skills(R.drawable.css,"CSS");
        skillsList.add(skills);
        skills = new Skills(R.drawable.mysql,"MYSQL");
        skillsList.add(skills);
        skills = new Skills(R.drawable.android,"ANDROID STUDIO");
        skillsList.add(skills);

        aFinal.notifyDataSetChanged();




    }
}
