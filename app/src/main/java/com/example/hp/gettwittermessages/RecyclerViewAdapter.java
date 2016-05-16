package com.example.hp.gettwittermessages;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<TwitterMessage> twitterMessageList;

    public RecyclerViewAdapter(List<TwitterMessage> twitterMessageList) { this.twitterMessageList = twitterMessageList; }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder viewHolder, int i) {
        TwitterMessage twitterMessage = twitterMessageList.get(i);

        viewHolder.title.setText(twitterMessage.getMessageTitle());
        viewHolder.description.setText(twitterMessage.getMessageDescription());

    }

    @Override
    public int getItemCount() {
        return twitterMessageList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView description;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            description  = (TextView) itemView.findViewById(R.id.desc);
        }
    }
}