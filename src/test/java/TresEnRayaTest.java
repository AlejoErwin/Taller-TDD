import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TresEnRayaTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();
    private TresEnRaya tresEnRaya;
    @Before
    public final void before(){
        //1 Preparacion de la pruba
        tresEnRaya = new TresEnRaya();
        System.out.println("inicializando prueba.... " + tresEnRaya.toString());
    }

    @Test
    public void cuandoFueraXlanzarExcepcion() throws Exception{
        //1 Preparacion de la pruba
        //2. logica de la prueba
        //3. Verificacion o Assert
        exception.expect(Exception.class);
        tresEnRaya.jugar(5,2);
    }

    @Test
    public void cuandoFueraYlanzarExcepcion() throws Exception{
        //1 Preparacion de la pruba
        //2. logica de la prueba
        //3. Verificacion o Assert
        exception.expect(Exception.class);
        tresEnRaya.jugar(2,5);
    }
    @Test
    public void cuandoLugarOcupadolanzarExcepcion() throws Exception{
        //1 Preparacion de la pruba
        //2. logica de la prueba
        tresEnRaya.jugar(1,3);
        //3. Verificacion o Assert
        exception.expect(Exception.class);
        tresEnRaya.jugar(1,3);
    }

    @Test
    public void siPrimerTurnoEntoncesJuegaX() throws Exception{
        assertEquals('X',tresEnRaya.siguienteTurno());
    }

    @Test
    public void siPrimerTurnoXSiguienteMas() throws Exception{
        tresEnRaya.jugar(2,1);
        assertEquals('+',tresEnRaya.siguienteTurno());
        tresEnRaya.jugar(2,2);
        assertEquals('X',tresEnRaya.siguienteTurno());

    }

    @Test
    public void cuandoNoHayGanador() throws Exception{
        String resultado= tresEnRaya.jugar(2,1); // X
        assertEquals("No hay ganador",resultado);
    }

    @Test
    public void siLlenaColumnaEntoncesGana() throws Exception{
        tresEnRaya.jugar(1,1); //X
        tresEnRaya.jugar(1,2); //+
        tresEnRaya.jugar(2,1); //X
        tresEnRaya.jugar(2,2); //+
        String resultado= tresEnRaya.jugar(3,1); // X
        assertEquals("X es el ganador",resultado);
    }

    @Test
    public void siLlenaFilaEntoncesGana() throws Exception{
        tresEnRaya.jugar(2,1); //X
        tresEnRaya.jugar(1,1); //+
        tresEnRaya.jugar(3,1); //X
        tresEnRaya.jugar(1,2); //+
        tresEnRaya.jugar(2,2); //X
        String resultado= tresEnRaya.jugar(1,3); // +
        assertEquals("+ es el ganador",resultado);
    }
    @Test
    public void siLlenaDiagonalEntoncesGana() throws Exception{
        tresEnRaya.jugar(1,1); //X
        tresEnRaya.jugar(1,2); //+
        tresEnRaya.jugar(2,2); //X
        tresEnRaya.jugar(1,3); //+
        String resultado= tresEnRaya.jugar(3,3); // X
        assertEquals("X es el ganador",resultado);
    }

    @Test
    public void siLlenaDiagonaSecundariolEntoncesGana() throws Exception{
        tresEnRaya.jugar(1,2); //X
        tresEnRaya.jugar(1,3); //+
        tresEnRaya.jugar(1,1); //X
        tresEnRaya.jugar(2,2); //+
        tresEnRaya.jugar(2,3); //X
        String resultado= tresEnRaya.jugar(3,1); // +
        assertEquals("+ es el ganador",resultado);
    }
}