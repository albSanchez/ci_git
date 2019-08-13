package ar.com.mercadolibre.motor;

public  class Motor {

    Integer potencia;
    Double temperatura;

    public Motor(Integer potencia){
        this.temperatura = 30.0;
        this.potencia = potencia;
    }

    public void subirPotencia(Integer factor){
        potencia += factor;
        temperatura += potencia;
        System.out.println("Temperatura al subir potencia: "+temperatura);
        System.out.println("Potencia al subir potencia: "+potencia);
    }

    public void bajarPotencia(Integer factor){
        potencia = potencia - factor;
        temperatura = temperatura - potencia;
        System.out.println("Temperatura al bajar potencia: "+temperatura);
        System.out.println("Potencia al bajar potencia: "+potencia);
    }


}
