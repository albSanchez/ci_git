package ar.com.mercadolibre.libreria;

public class LibroEstudio extends Libro implements Alquilable {

    String tema;

    public LibroEstudio(String titulo, String editoria) {
        super(titulo, editoria);
    }


    @Override
    public void alquilar() {

    }

    @Override
    public void devolver() {

    }
}
