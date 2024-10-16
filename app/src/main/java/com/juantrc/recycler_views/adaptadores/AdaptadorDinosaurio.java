package com.juantrc.recycler_views.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.juantrc.recycler_views.R;
import com.juantrc.recycler_views.modelos.DetalleDino;
import com.juantrc.recycler_views.modelos.Dinosaurio;

import java.util.List;

public class AdaptadorDinosaurio extends RecyclerView.Adapter<AdaptadorDinosaurio.ViewHolderDino> {

    private List<Dinosaurio> ListaDinosaurio;

    public AdaptadorDinosaurio(List<Dinosaurio> listaDinosaurio) {
        ListaDinosaurio = listaDinosaurio;
    }

    @NonNull
    @Override
    public AdaptadorDinosaurio.ViewHolderDino onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Proceso de convertir xml a vista se llama inflar
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_dino, parent, false);
        return new ViewHolderDino(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorDinosaurio.ViewHolderDino holder, int position) {
        holder.setData(ListaDinosaurio.get(position));
    }

    @Override
    public int getItemCount() {
        return ListaDinosaurio.size();
    }

    public class ViewHolderDino extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvNombre, tvTipo, tvDescripcion;
        ImageView imgDino;

        ConstraintLayout cl;

        Dinosaurio dino;

        public ViewHolderDino(@NonNull View itemView) {
            super(itemView);

            // Referenciar a los elementos de la vista
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvTipo = itemView.findViewById(R.id.tvTipo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            imgDino = itemView.findViewById(R.id.imgDino);
            cl = itemView.findViewById(R.id.main);
            cl.setOnClickListener(this);
        }

        public void setData(Dinosaurio dinosaurio) {
            dino = dinosaurio;
            tvNombre.setText(dino.getNombre());
            tvTipo.setText(dino.getTipo());
            tvDescripcion.setText(dino.getDescripcion());
            imgDino.setImageResource(dino.getImagen());
            cl.setBackgroundColor(dino.getColor());
        }

        @Override
        public void onClick(View v) {
            // como pasar valores de una actividad a otra

            // Crear el intent con la clase de destino
            Intent intent = new Intent(v.getContext(), DetalleDino.class);
            // Agregar el objeto Dinosaurio al intent, para poder recuperarlo en la otra actividad, se usa putExtra y el nombre del objeto y el objeto
            intent.putExtra("dino", dino);
            // Iniciar la actividad
            v.getContext().startActivity(intent);
        }
    }
}