package com.example.act_cardview_recyclerview;

public class Encapsulador {
    private int imagen;
    private String descripcion;
    private String textoTitulo;
    public Encapsulador(int imagen, String textoTitulo, String descripcion) {
        this.imagen = imagen;
        this.textoTitulo = textoTitulo;
        this.descripcion = descripcion;
    }
    public int getImagen() {
        return imagen;
    }
    public String getDescripcion() {
        return descripcion;
        }
    public String getTextoTitulo() {
        return textoTitulo;
    }
    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setTextoTitulo(String textoTitulo) {
        this.textoTitulo = textoTitulo;
    }


}
