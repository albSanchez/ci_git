package ar.com.mercadolibre.motor;

public class MotorNuclear extends Motor {

    public MotorNuclear(Integer potencia) {
        super(potencia);
    }

    public void refrigerar(){
        temperatura *= 0.8;
        System.out.println("Temperatura motor nuclear: "+temperatura);
    }
}
