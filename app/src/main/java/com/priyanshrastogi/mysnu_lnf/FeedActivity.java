package com.priyanshrastogi.mysnu_lnf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.mRecyclerView);
        ArrayList<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("Priyansh Rastogi","pr266@snu.edu.in","Lost Samsung Galaxy Note 3","Lost my white samsung galaxy note 3 near minimart yesterday around 3pm. Email me at my email if found.","Jan 27, 2017. 8:00PM"));
        itemList.add(new Item("Priyansh Rastogi","pr266@snu.edu.in","Lost Apple iphone 7","Lost my white samsung galaxy note 3 near minimart yesterday around 3pm. Email me at my email if found.","Jan 27, 2017. 8:00PM"));
        itemList.add(new Item("Palash Agarwal","pr266@snu.edu.in","Lost Wallet","Lost my black wallet near minimart yesterday around 3pm. Email me at my email if found.","Jan 27, 2017. 8:00PM"));
        itemList.add(new Item("Pulkit Luthra","pr266@snu.edu.in","Lost Samsung J7","Lost my white samsung galaxy note 3 near minimart yesterday around 3pm. Email me at my email if found.","Jan 27, 2017. 8:00PM"));
        itemList.add(new Item("Priyansh Rastogi","pr266@snu.edu.in","Lost Samsung Galaxy Note 3","Lost my white samsung galaxy note 3 near minimart yesterday around 3pm. Email me at my email if found.","Jan 27, 2017. 8:00PM"));
        itemList.add(new Item("Priyansh Rastogi","pr266@snu.edu.in","Lost Samsung Galaxy Note 3","Lost my white samsung galaxy note 3 near minimart yesterday around 3pm. Email me at my email if found.","Jan 27, 2017. 8:00PM"));
        itemList.add(new Item("Priyansh Rastogi","pr266@snu.edu.in","Lost Samsung Galaxy Note 3","Lost my white samsung galaxy note 3 near minimart yesterday around 3pm. Email me at my email if found.","Jan 27, 2017. 8:00PM"));
        itemList.add(new Item("Priyansh Rastogi","pr266@snu.edu.in","Lost Samsung Galaxy Note 3","Lost my white samsung galaxy note 3 near minimart yesterday around 3pm. Email me at my email if found.","Jan 27, 2017. 8:00PM"));
        itemList.add(new Item("Priyansh Rastogi","pr266@snu.edu.in","Lost Samsung Galaxy Note 3","Lost my white samsung galaxy note 3 near minimart yesterday around 3pm. Email me at my email if found.","Jan 27, 2017. 8:00PM"));
        itemList.add(new Item("Priyansh Rastogi","pr266@snu.edu.in","Lost Samsung Galaxy Note 3","Lost my white samsung galaxy note 3 near minimart yesterday around 3pm. Email me at my email if found.","Jan 27, 2017. 8:00PM"));

        ItemAdapter mAdapter = new ItemAdapter(this, itemList);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent details = new Intent();
            }
        });
    }

    public void toAddActivity(View v) {
        Intent addnew = new Intent(this,AddNewActivity.class);
        startActivity(addnew);
    }
}
