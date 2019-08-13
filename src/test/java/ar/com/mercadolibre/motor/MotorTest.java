package ar.com.mercadolibre.motor;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorTest {

    private Motor motor;
    private Integer potenciaInicial = 20;

    @Test
    public void crearMotor(){
        motor =  new Motor(potenciaInicial);
        Assertions.assertThat(motor.potencia).isEqualTo(potenciaInicial);
        Assertions.assertThat(motor.temperatura).isNotNull();
    }

    @Test
    public void subirPotenciaMotor(){
        motor =  new Motor(potenciaInicial);
        motor.subirPotencia(5);
        Assertions.assertThat(motor.potencia).isGreaterThan(potenciaInicial);
    }

    @Test
    public void bajarPotenciaMotor(){
        motor =  new Motor(potenciaInicial);
        Assertions.assertThat(motor.potencia).isEqualTo(potenciaInicial);
        motor.bajarPotencia(5);
        Assertions.assertThat(motor.potencia).isLessThan(potenciaInicial);
    }

    @Test
    public  void refrigerarMotorNuclear(){
        Double temperaturaInicial = 30.0;
        MotorNuclear motorNuclear = new MotorNuclear(10);
        Assertions.assertThat(motorNuclear.potencia).isEqualTo(10);
        Assertions.assertThat(motorNuclear.temperatura).isNotNull();
        //refrigerar
        motorNuclear.refrigerar();
        Assertions.assertThat(motorNuclear.temperatura).isLessThan(temperaturaInicial);
    }

    @Test
    public  void refrigerarMotorSolar(){
        Double temperaturaInicial = 30.0;
        MotorSolar motorSolar = new MotorSolar(10);
        Assertions.assertThat(motorSolar.potencia).isEqualTo(10);
        Assertions.assertThat(motorSolar.temperatura).isNotNull();
        //refrigerar
        motorSolar.refrigerar();
        Assertions.assertThat(motorSolar.temperatura).isLessThan(temperaturaInicial);
    }

}
