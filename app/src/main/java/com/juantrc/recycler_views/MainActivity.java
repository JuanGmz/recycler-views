package com.juantrc.recycler_views;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;

    int[] imagenes = {R.drawable.amg1, R.drawable.amg2, R.drawable.amg3, R.drawable.amg4, R.drawable.amg5, R.drawable.amg6, R.drawable.amg7, R.drawable.amg8, R.drawable.amg9};

    String[] nombres = {"Mercedes AMG 1", "Mercedes AMG GT", "Mercedes AMG GT R", "Mercedes AMG GT S", "Mercedes AMG GT S63", "Mercedes AMG ONE", "Mercedes AMG ONE S"};

    int[] precios = {100000, 200000, 300000, 400000, 500000, 600000, 700000};

    String[] descripciones = {"Descripcion 1", "Descripcion 2", "Descripcion 3", "Descripcion 4", "Descripcion 5", "Descripcion 6", "Descripcion 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cargar el layout de la actividad
        setContentView(R.layout.activity_main);

        // Inicializa el RecyclerView después de setContentView
        rv = findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        rv.setAdapter(new Adaptador());
    }

    private class Adaptador extends RecyclerView.Adapter<Adaptador.AdaptadorHolder> {
        @NonNull
        @Override
        public AdaptadorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new AdaptadorHolder(getLayoutInflater().inflate(R.layout.card, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull AdaptadorHolder holder, int position) {
            holder.imprimir(position);
        }

        @Override
        public int getItemCount() {
            return nombres.length;
        }

        class AdaptadorHolder extends RecyclerView.ViewHolder {
            ImageView imgAuto;
            TextView tvModelo, tvPrecio, tvDescripcion;

            public AdaptadorHolder(View itemView) {
                super(itemView);
                imgAuto = itemView.findViewById(R.id.imgAuto);
                tvModelo = itemView.findViewById(R.id.tvModelo);
                tvPrecio = itemView.findViewById(R.id.tvPrecio);
                tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            }

            public void imprimir(int position) {
                // Usar el método decodeSampledBitmapFromResource para cargar la imagen eficientemente
                Bitmap bitmap = ImageUtils.decodeSampledBitmapFromResource(getResources(), imagenes[position], 100, 100);
                imgAuto.setImageBitmap(bitmap);

                tvModelo.setText(nombres[position]);
                tvPrecio.setText("$" + precios[position]);
                tvDescripcion.setText(descripciones[position]);
            }
        }
    }
}
