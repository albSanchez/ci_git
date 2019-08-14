package ar.com.mercadolibre.libreria;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;

import java.util.NoSuchElementException;

public class LibreriaTest {

    @Test
    public void crearLibreria(){
        Libreria libreria = Libreria.getInstance();
        Assertions.assertThat(libreria).isNotNull();
        libreria.deleteInstance();
    }

    @Test
    public void crearYañadirAlquiler(){
        Libreria libreria = Libreria.getInstance();
        Alquiler alquiler = new Alquiler("23-09-2019");
        Assertions.assertThat(alquiler).isNotNull();
        libreria.deleteInstance();
    }

    @Test
    public void agregarAlquilerAlibreria(){
        Libreria libreria = Libreria.getInstance();
        Alquiler alquiler = new Alquiler("23-09-2019");
        Assertions.assertThat(alquiler).isNotNull();
        libreria.añadirAlquiler(alquiler);
        Assertions.assertThat(alquiler.fechaDevolucion).isEqualTo("23-09-2019");
        libreria.deleteInstance();
    }

    @Test
    public  void alquiloLibro(){
        Libreria libreria = Libreria.getInstance();
        Libro libro = new Libro("harry potter","pepito");
        Alquiler alquiler = new Alquiler(libro,"23-09-2019");
        Assertions.assertThat(alquiler.libro.getTitulo()).isEqualTo("harry potter");
        libreria.añadirAlquiler(alquiler);
        Assertions.assertThat(alquiler.alquilado).isTrue();
        libreria.deleteInstance();
    }

    @Test
    public  void buscarLibrosAlquilados(){
        Libreria libreria = Libreria.getInstance();
        Libro libro1 = new Libro("harry potter","pepito");
        Libro libro2 = new Libro("harry potter2","pepito2");
        Alquiler alquiler = new Alquiler(libro1,"23-09-2019");
        Assertions.assertThat(alquiler.libro.getTitulo()).isEqualTo("harry potter");
        libreria.añadirAlquiler(alquiler);
        Assertions.assertThat(alquiler.alquilado).isTrue();
        System.out.println("buscar: "+ libreria.buscarAlquiler(libro1).libro.getTitulo() );
        Assertions.assertThat(libreria.buscarAlquiler(libro1)).isNotNull();

        boolean catcheo = false;
        try {
            libreria.buscarAlquiler(libro2);
            System.out.println("no existe" );
        } catch (NoSuchElementException e) {
            catcheo = true;
            System.out.println("entra en la exception" );
        }
        Assertions.assertThat(catcheo).isTrue();
        libreria.deleteInstance();
    }



}
