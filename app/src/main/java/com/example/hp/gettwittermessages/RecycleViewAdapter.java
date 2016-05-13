package com.example.hp.gettwittermessages;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>{

    private List<TwitterMessage> twitterMessageList;

    public RecycleViewAdapter(List<TwitterMessage> twitterMessageList) { this.twitterMessageList = twitterMessageList; }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view,viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecycleViewAdapter.ViewHolder holder, int i) {
    }

    @Override
    public int getItemCount() {
        return twitterMessageList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}