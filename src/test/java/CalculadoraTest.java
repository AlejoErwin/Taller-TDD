import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void sicadenaVaciaRetornaCero() throws Exception{
        //1 preprara prueba
        Calculadora c=new Calculadora();
        //2 logica de prueba

        String resultado =c.suma("");

        //3 Verificar prueba o Assert
        assertEquals("0",resultado);
    }
    @Test
    public void para2numerosRetornarSuma() throws Exception{
        //1 preprara prueba
        Calculadora c=new Calculadora();
        //2 logica de prueba

        String resultado =c.suma("2,3");

        //3 Verificar prueba o Assert
        assertEquals("5",resultado);
        assertEquals("500",c.suma("200,300"));
        assertEquals("0",c.suma("0,0"));
    }

    @Test
    public void para3numerosRetornarSuma() throws Exception{
        //1 preprara prueba
        Calculadora c=new Calculadora();
        //2 logica de prueba


        //3 Verificar prueba o Assert
        assertEquals("10",c.suma("2,3,5"));
    }

    @Test
    public void numerosMayores1000SonIgnorados() throws Exception{
        //1 preprara prueba
        Calculadora c=new Calculadora();
        //2 logica de prueba


        //3 Verificar prueba o Assert
        assertEquals("8",c.suma("2000,3,5"));
        assertEquals("0",c.suma("2000,3000,5000"));
        assertEquals("10",c.suma("5000,5,5"));

    }

    @Test
    public void numerosNegativosLanzanExcepcion() throws Exception{
        //1. Preparacion de la prueba
        Calculadora c = new Calculadora();

        //2. Logica de la prueba

        //3. Verificacion o Assert
        exception.expect(Exception.class);
        assertEquals("5", c.suma("2,3,-1"));
    }
}