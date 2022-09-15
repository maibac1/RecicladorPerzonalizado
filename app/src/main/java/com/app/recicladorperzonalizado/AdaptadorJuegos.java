package com.app.recicladorperzonalizado;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorJuegos extends RecyclerView.Adapter<AdaptadorJuegos.ViewHolderJuegos> {


    ArrayList<JuegosVO> listaJuegos;

    public AdaptadorJuegos(ArrayList<JuegosVO> listaJuegos) {
        this.listaJuegos = listaJuegos;
    }

    @NonNull
    @Override
    public AdaptadorJuegos.ViewHolderJuegos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_personalizado,null,false);
        return new ViewHolderJuegos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorJuegos.ViewHolderJuegos holder, int position) {

        holder.itemNombre.setText(listaJuegos.get(position).getNombre());
        holder.itemInformacion.setText(listaJuegos.get(position).getInfo());
        holder.itemFoto.setImageResource(listaJuegos.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaJuegos.size();
    }

    public class ViewHolderJuegos extends RecyclerView.ViewHolder {

        //referenciar componentes gráficos
        TextView itemNombre,itemInformacion;
        ImageView itemFoto;
        public ViewHolderJuegos(@NonNull View itemView) {
            super(itemView);
            itemNombre= (TextView)  itemView.findViewById(R.id.nombreDeLista);
            itemInformacion = (TextView)  itemView.findViewById(R.id.descriptorDeLista);
            itemFoto = (ImageView) itemView.findViewById(R.id.imageViewDeLista);
        }
    }
}
