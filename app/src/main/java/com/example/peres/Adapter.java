package com.example.peres;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<Propertie> properties;

    public Adapter(ArrayList<Propertie> properties) {
        this.properties = properties;
    }



    public static class ViewHolder extends  RecyclerView.ViewHolder {
        final TextView title;
        final TextView price;
//        final ImageView image;
        final TextView description;
//        final TextView idCategory;
//        final TextView message;

        public ViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.txtTitle);
            price = (TextView) view.findViewById(R.id.floatPrice);
//            image = (ImageView) view.findViewById(R.id.imgPropertie);
            description = (TextView) view.findViewById(R.id.txtDescription);

//            Atributos do item que vai ser inserido
//            idCategory = (TextView) view.findViewById(R.id.);
//            message = (TextView) view.findViewById(R.id.);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.propertie, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Propertie propertie = properties.get(position);
        holder.title.setText(propertie.getTitle());
        holder.price.setText((int) propertie.getPrice());
//        holder.image.setImageResource(propertie.getImage());
        holder.description.setText(propertie.getDescription());
    }
    @Override
    public int getItemCount() {
        return properties.size();
    }
}