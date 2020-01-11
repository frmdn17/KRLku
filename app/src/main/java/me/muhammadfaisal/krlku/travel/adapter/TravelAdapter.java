package me.muhammadfaisal.krlku.travel.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import me.muhammadfaisal.krlku.R;
import me.muhammadfaisal.krlku.travel.model.Travel;

public class TravelAdapter extends RecyclerView.Adapter<TravelAdapter.ViewHolder>{

    private ArrayList<Travel> travels;


    public TravelAdapter(ArrayList<Travel> travels) {
        this.travels = travels;
    }


    @NonNull
    @Override
    public TravelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_universal, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TravelAdapter.ViewHolder holder, int position) {
        holder.title.setText(travels.get(position).getTitle());
        holder.image.setImageResource(travels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return (travels != null)? travels.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title, overview,nearbyAt, price, other, otherPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
        }
    }
}