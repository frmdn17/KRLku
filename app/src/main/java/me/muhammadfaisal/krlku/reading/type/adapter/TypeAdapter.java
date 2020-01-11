package me.muhammadfaisal.krlku.reading.type.adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import me.muhammadfaisal.krlku.R;
import me.muhammadfaisal.krlku.reading.type.DetailTypeActivity;
import me.muhammadfaisal.krlku.reading.type.model.Type;
import me.muhammadfaisal.krlku.travel.model.Travel;

public class TypeAdapter extends RecyclerView.Adapter<TypeAdapter.ViewHolder> {

    private ArrayList<Type> types;

    public TypeAdapter(ArrayList<Type> types) {
        this.types = types;
    }

    @NonNull
    @Override
    public TypeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_universal, parent, false);
        return new ViewHolder(v);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull final TypeAdapter.ViewHolder holder, final int position) {
        final Type type  = types.get(position);
        holder.title.setText(types.get(position).getTitle());
        holder.image.setImageResource(types.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetailTypeActivity.class);
                i.putExtra("title", type.getTitle());
                i.putExtra("madeBy", type.getMadeBy());
                i.putExtra("image", type.getImage());
                i.putExtra("flag", type.getFlag());
                i.putExtra("description", type.getDescription());
                view.getContext().startActivity(i);
            }
        });

        holder.backgroundCard.setBackgroundResource(R.drawable.read_bg_card);
        holder.title.setTextColor(holder.itemView.getResources().getColor(R.color.cardBackgroundGreen2));
    }

    @Override
    public int getItemCount() {
        return (types != null)? types.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView image, backgroundCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.image);
            backgroundCard = itemView.findViewById(R.id.imageBackground);
        }
    }
}
