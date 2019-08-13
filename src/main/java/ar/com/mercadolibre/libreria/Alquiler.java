package ar.com.mercadolibre.libreria;

import java.text.DateFormat;

public class Alquiler {

    Boolean libroAlquilado;
    DateFormat fechaAlquiler;
    DateFormat fechaDevoducion;

    public Alquiler(Boolean libroAlquilado, DateFormat fechaDevoducion){
        this.fechaAlquiler = DateFormat.getDateInstance();
        this.fechaDevoducion = fechaDevoducion;
        this.libroAlquilado = libroAlquilado;
    }

}
