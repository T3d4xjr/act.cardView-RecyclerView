package com.example.act_cardview_recyclerview;


import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.miholder> {
    private List<Encapsulador> lista;
    public Adaptador(List<Encapsulador> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public miholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = View.inflate(parent.getContext(), R.layout.carta, null);
        return new miholder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull miholder holder, int position) {
        holder.titulo.setText(lista.get(position).getTextoTitulo());
        holder.descripcion.setText(lista.get(position).getDescripcion());
        holder.imagen.setImageResource(lista.get(position).getImagen());

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class miholder extends RecyclerView.ViewHolder{
        TextView titulo;
        TextView descripcion;
        ImageView imagen;
        public miholder(View itemView){
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            descripcion = itemView.findViewById(R.id.texto);
            imagen = itemView.findViewById(R.id.imagen);
        }

    }


}
