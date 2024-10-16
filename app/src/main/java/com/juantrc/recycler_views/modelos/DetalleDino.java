package com.juantrc.recycler_views.modelos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.juantrc.recycler_views.R;

public class DetalleDino extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_dinosaurio);

        // Referenciar los elementos de la interfaz con el código
        TextView nombre = findViewById(R.id.tvNombre);
        TextView descripcion = findViewById(R.id.tvDescripcion);
        TextView tipo = findViewById(R.id.tvTipo);
        ImageView imagen = findViewById(R.id.imgDino);
        ConstraintLayout cl = findViewById(R.id.detalle);

        // Obtener los datos del intent
        Intent intent = getIntent();

        // Obtener el objeto Dinosaurio de la intent con la clave "dino"
        Dinosaurio dino = (Dinosaurio) intent.getSerializableExtra("dino");

        if (dino != null) {
            // Mostrar los datos en la interfaz
            nombre.setText(dino.getNombre());
            tipo.setText(dino.getTipo());
            descripcion.setText(dino.getDescripcion());
            imagen.setImageResource(dino.getImagen());
            cl.setBackgroundColor(dino.getColor());
        }
    }
}
