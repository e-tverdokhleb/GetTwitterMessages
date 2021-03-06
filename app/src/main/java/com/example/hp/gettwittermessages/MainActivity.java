package com.example.hp.gettwittermessages;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<TwitterMessage> twitterMessageList = new ArrayList<TwitterMessage>();
        generateRecords(twitterMessageList, 4);

        RecyclerView recycleView = (RecyclerView) findViewById(R.id.recyclerView1);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(twitterMessageList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();

        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(layoutManager);
        recycleView.setItemAnimator(itemAnimator);

//        swipeLayout = (SwipeRefreshLayout)findViewById(R.id.swipe_container);
//        swipeLayout.setOnRefreshListener((SwipeRefreshLayout.OnRefreshListener) this);
//        swipeLayout.setColorSchemeResources(android.R.color.holo_blue_bright,
//                android.R.color.holo_green_light,
//                android.R.color.holo_orange_light,
//                android.R.color.holo_red_light);
    }


    private void generateRecords(List<TwitterMessage> twitterMessageList, int count){

        for (int i = 0; i < count; i++){
            twitterMessageList.add(new TwitterMessage("Good News " + String.valueOf(i),
                    "hi  here this is good news from SpaceX",System.currentTimeMillis()));
        }
    }
}



