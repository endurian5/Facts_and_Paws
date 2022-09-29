package com.example.factsandpaws;

public class ItemList {
    private String Nombre;
    private String descripcion;
    private int imgResource;

    public ItemList(String nombre, String descripcion, int imgResource) {
        this.Nombre = nombre;
        this.descripcion = descripcion;
        this.imgResource = imgResource;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImgResource() {
        return imgResource;
    }
}
