package ar.com.mercadolibre.motor;

public class MotorSolar extends Motor {
    public MotorSolar(Integer potencia) {
        super(potencia);
    }

    public void refrigerar(){
        temperatura *= 0.8;
        System.out.println("Temperatura motor solar: "+temperatura);
    }
}
