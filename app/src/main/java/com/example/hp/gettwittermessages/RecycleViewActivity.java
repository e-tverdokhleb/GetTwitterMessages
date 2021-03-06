package com.example.hp.gettwittermessages;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.hp.gettwittermessages.RecyclerViewAdapter;
import java.util.List;
import com.example.hp.gettwittermessages.TwitterMessage;
import java.util.ArrayList;

public class RecycleViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<TwitterMessage> twitterMessageList = new ArrayList<TwitterMessage>();
        populateRecords(twitterMessageList);

        RecyclerView recycleView = (RecyclerView) findViewById(R.id.recyclerView1);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(twitterMessageList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.ItemAnimator itemAnimatior = new DefaultItemAnimator();

        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(layoutManager);
        recycleView.setItemAnimator(itemAnimatior);

    }

    private void populateRecords(List<TwitterMessage> twitterMessageList){
        for (int i=0; i<10; i++){
            TwitterMessage twitterMessage = new TwitterMessage("Good News " +
                    String.valueOf(i),"hi  here this is good news from SpaceX",System.currentTimeMillis());
        }
    }
}
