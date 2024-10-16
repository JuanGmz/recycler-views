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

        listaDinosaurios.add(new Dinosaurio("Triceratops", "Herbívoro", "Dinosaurio muy grande", Color.parseColor("#ba63df"), R.drawable.triceratops));
        listaDinosaurios.add(new Dinosaurio("T-Rex", "Carnívoro", "Dinosaurio muy grande", Color.parseColor("#FF5733"), R.drawable.trex));
        listaDinosaurios.add(new Dinosaurio("Velociraptor", "Carnívoro", "Es muy veloz", Color.parseColor("#9eeff4"), R.drawable.velociraptor));
        listaDinosaurios.add(new Dinosaurio("Stegosaurus", "Herbívoro", "Tiene picos en el cuerpo", Color.parseColor("#f49ecd"), R.drawable.stegosaurus));
        listaDinosaurios.add(new Dinosaurio("Diplodocus", "Herbívoro", "Es extremadamente grande", Color.parseColor("#c4f49e"), R.drawable.diplodocus));
        listaDinosaurios.add(new Dinosaurio("Mosasaurus", "Herbívoro", "Dinosaurio acuático", Color.parseColor("#9ec1f4"), R.drawable.mosasaurus));
        listaDinosaurios.add(new Dinosaurio("Ankylosaurus", "Herbívoro", "Tiene muchos picos", Color.parseColor("#f49ee7"), R.drawable.ankylosaurus));

        AdaptadorDinosaurio adaptador = new AdaptadorDinosaurio(listaDinosaurios);

        rv.setAdapter(adaptador);

        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        rv.setHasFixedSize(true);
    }
}