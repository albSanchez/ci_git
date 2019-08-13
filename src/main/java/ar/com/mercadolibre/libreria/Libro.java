package ar.com.mercadolibre.libreria;

import java.text.DateFormat;

public class Libro {
    String titulo;
    String editorial;
    DateFormat fechaAlquiler;

    public Libro (String titulo, String editoria){
        this.editorial = editoria;
        this.titulo = titulo;
        this.fechaAlquiler = DateFormat.getDateInstance();
    }
}
