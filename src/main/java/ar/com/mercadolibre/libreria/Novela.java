package ar.com.mercadolibre.libreria;

public class Novela extends Libro implements Alquilable {

    String autor;
    String edicion;

    public Novela(String titulo, String editoria) {
        super(titulo, editoria);
    }


    @Override
    public void alquilar() {

    }

    @Override
    public void devolver() {

    }
}
