package com.angiecasillas.recycleviewejemplo;

/**
 * Created by Usuario on 17/09/2016.
 */
public class Contacto {

    private String nombre;
    private String rating;
    private int foto;
    private int fotoEstrella;


    public Contacto(String nombre, String rating, int foto, int fotoEstrella){

        this.nombre=nombre;
        this.rating=rating;
        this.foto=foto;
        this.fotoEstrella=fotoEstrella;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getFotoEstrella() {
        return fotoEstrella;
    }

    public void setFotoEstrella(int fotoEstrella) {
        this.fotoEstrella = fotoEstrella;
    }
}
