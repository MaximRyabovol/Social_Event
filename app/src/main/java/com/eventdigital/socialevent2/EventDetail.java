package com.eventdigital.socialevent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EventDetail extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_detail);

        findViewById(R.id.show_event_map).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EventDetail.this, MapsActivity.class));
            }
        });
    }
}
