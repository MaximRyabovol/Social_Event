package com.eventdigital.socialevent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        RecyclerView recyclerView = findViewById(R.id.events_recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] data = new String[3];
        data[0] = "Hello";
        data[1] = "World";
        data[2] = "Holla";
        recyclerView.setAdapter(new EventRecyclerAdapter(data));
        findViewById(R.id.bt_move_map).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EventsActivity.this, MapsActivity.class));
            }
        });
    }
}
