package com.eventdigital.socialevent2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class EventRecyclerAdapter extends RecyclerView.Adapter<EventRecyclerAdapter.EventViewHolder> {
    private String[] data;

    public EventRecyclerAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new EventViewHolder(
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_event, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final EventViewHolder eventViewHolder, int i) {
        final String value = data[i];
        eventViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(eventViewHolder.itemView.getContext(), value, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class EventViewHolder extends RecyclerView.ViewHolder {
        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
