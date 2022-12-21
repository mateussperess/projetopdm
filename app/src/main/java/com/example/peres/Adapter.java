package com.example.peres;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
        final ImageView image;
        final TextView description;
        final TextView idCategory;
        final TextView message;

        public ViewHolder(View view) {
            super();
            this.title = title;
            this.price = price;
            this.image = image;
            this.description = description;
            this.idCategory = idCategory;
            this.message = message;
        }

//        public ViewHolder(String title, float price, String image, String description, float idCategory, String message) {
//            this.title = title;
//            this.price = price;
//            this.image = image;
//            this.description = description;
//            this.idCategory = idCategory;
//            this.message = message;
//        }
    }
//
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        final TextView txtNome;
//        final TextView txtFone;
//        final ImageView ivFoto;
//
//        public ViewHolder(View view) {
//            super(view);
//            txtNome = (TextView) view.findViewById(R.id.txtNome);
//            txtFone = (TextView) view.findViewById(R.id.txtFone);
//            ivFoto = (ImageView) view.findViewById(R.id.ivFoto);
//        }
//    }
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_contato, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Contato contato = contatos.get(position);
//        holder.txtNome.setText(contato.nome);
//        holder.txtFone.setText(contato.telefone);
//        holder.ivFoto.setImageResource(contato.foto);
//    }
//
//    @Override
//    public int getItemCount() {
//        return contatos.size();
//    }
}