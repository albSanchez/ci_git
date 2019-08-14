package ar.com.mercadolibre.libreria;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Libreria {

    private static Libreria unique = new Libreria();

    private List<Alquiler> alquileres = new ArrayList<>();

    private Libreria(){ }

    public static Libreria getInstance(){
        if (unique == null ){
            unique = new Libreria();
        }
        return unique;
    }

    public void añadirAlquiler(Alquiler alquiler){
        alquileres.add(alquiler);
    }

    public Alquiler buscarAlquiler(Libro libro){
        Predicate<Alquiler> criterio = alquiler -> alquiler.libro.getTitulo().equals(libro.getTitulo());
        return alquileres.stream().filter(criterio).findFirst().get();
    }

    public List<Alquiler> listarAquileres(){
       return alquileres;
    }


    public void deleteInstance(){
        unique = null;
    }


}
