package ar.com.mercadolibre.libreria;

import java.util.ArrayList;
import java.util.List;

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

    public Alquiler buscarAquiler(){
        try{
            // iterar con lammda
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Alquiler no existe");
        }
        return  null;
    }


    public void deleteInstance(){
        unique = null;
    }


}
