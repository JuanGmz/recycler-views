package com.juantrc.recycler_views;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juantrc.recycler_views.adaptadores.AdaptadorDinosaurio;
import com.juantrc.recycler_views.modelos.Dinosaurio;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.rv);

        List<Dinosaurio> listaDinosaurios = new ArrayList<>();

        new Color

        listaDinosaurios.add(new Dinosaurio("Triceratops", "Herbívoro", "Dinosaurio muy grande", "Verde", R.drawable.triceratops));
        listaDinosaurios.add(new Dinosaurio("Triceratops", "Herbívoro", "Dinosaurio muy grande", "Verde", R.drawable.triceratops));
        listaDinosaurios.add(new Dinosaurio("Triceratops", "Herbívoro", "Dinosaurio muy grande", "Verde", R.drawable.triceratops));
        listaDinosaurios.add(new Dinosaurio("Triceratops", "Herbívoro", "Dinosaurio muy grande", "Verde", R.drawable.triceratops));
        listaDinosaurios.add(new Dinosaurio("Triceratops", "Herbívoro", "Dinosaurio muy grande", "Verde", R.drawable.triceratops));
        listaDinosaurios.add(new Dinosaurio("Triceratops", "Herbívoro", "Dinosaurio muy grande", "Verde", R.drawable.triceratops));
        listaDinosaurios.add(new Dinosaurio("Triceratops", "Herbívoro", "Dinosaurio muy grande", "Verde", R.drawable.triceratops));

        AdaptadorDinosaurio adaptador = new AdaptadorDinosaurio(listaDinosaurios);

        rv.setAdapter(adaptador);

        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        rv.setHasFixedSize(true);
    }
}