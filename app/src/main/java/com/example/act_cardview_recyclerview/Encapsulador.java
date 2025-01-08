package com.example.act_cardview_recyclerview;

public class Encapsulador {
    private String textoTitulo;
    private String descripcion;
    private int imagen;
    public Encapsulador(String textoTitulo, String descripcion, int imagen) {
        this.textoTitulo = textoTitulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
    public String getTextoTitulo() {
        return textoTitulo;
    }
    public String getDescripcion() {
        return descripcion;
        }
    public int getImagen() {
        return imagen;
    }
    public void setTextoTitulo(String textoTitulo) {
        this.textoTitulo = textoTitulo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        }
    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

}
