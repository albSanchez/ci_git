package ar.com.mercadolibre.libreria;

import java.text.DateFormat;

public class Alquiler {

    Boolean alquilado;
    DateFormat fechaAlquiler;
    String fechaDevolucion;
    Libro libro;

    public Alquiler(Libro libro, String fechaDevolucion){
        this.fechaAlquiler = DateFormat.getDateInstance();
        this.fechaDevolucion = fechaDevolucion;
        this.alquilado = true;
        this.libro = libro;
    }

    public Alquiler( String fechaDevolucion) {
        this.fechaAlquiler = DateFormat.getDateInstance();
        this.fechaDevolucion = fechaDevolucion;
        this.alquilado = true;
    }

}
