package com.juantrc.recycler_views.modelos;

import java.io.Serializable;

// Clase Dinosaurio que implementa Serializable para poder pasar objetos entre actividades
public class Dinosaurio implements Serializable {
    public String nombre;
    public String tipo;
    public String descripcion;
    public int color;
    public int imagen;

    public Dinosaurio(String nombre, String tipo, String descripcion, int color, int imagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.color = color;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}