package com.priyanshrastogi.mysnu_lnf;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemHolder>{

    private List<Item> itemList;
    Context context;

    public ItemAdapter(Context context, List<Item> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public ItemAdapter.ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View mView = layoutInflater.inflate(R.layout.feed_card,parent,false);
        return new ItemHolder(mView);
    }

    @Override
    public void onBindViewHolder(ItemAdapter.ItemHolder holder, int position) {
        Item item = itemList.get(position);
        holder.lost_title.setText(item.getItemTitle());
        holder.user_name.setText(item.getUserName());
        holder.lost_disc.setText(item.getItemDisc());
        holder.post_time.setText(item.getPostTime());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder{
        TextView lost_title, lost_disc, user_name, post_time;
        public ItemHolder(View itemView) {
            super(itemView);
            lost_title = (TextView)itemView.findViewById(R.id.lost_title);
            lost_disc = (TextView)itemView.findViewById(R.id.lost_disc);
            post_time = (TextView)itemView.findViewById(R.id.post_time);
            user_name = (TextView)itemView.findViewById(R.id.user_name);
        }
    }

}
