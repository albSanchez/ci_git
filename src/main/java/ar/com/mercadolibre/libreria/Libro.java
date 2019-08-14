package ar.com.mercadolibre.libreria;

import java.text.DateFormat;

public class Libro  {
    private String titulo;
    private String editorial;
    private DateFormat fechaAlquiler;

    public Libro (String titulo, String editoria ){
        this.editorial = editoria;
        this.titulo = titulo;
        this.fechaAlquiler = DateFormat.getDateInstance();
    }


    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }

}
