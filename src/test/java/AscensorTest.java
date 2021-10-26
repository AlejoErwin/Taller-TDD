import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
public class AscensorTest {

    private Ascensor ascensor;

    @Rule
    public ExpectedException exception=ExpectedException.none();


    @Before
    public final void before(){
        //1.Preparacionde la prueba
        ascensor=new Ascensor();
        System.out.println("Inicializando Prueba..."+ascensor.toString());
    }


    @Test
    public void verificarQueSeaUnaPersona() throws Exception {

        //2.Logica de la prueba

        //3. Verificacion o Assert
        ascensor.PresionarBotonAscensor(1,2);
        exception.expect(Exception.class);
        ascensor.PresionarBotonAscensor(4,2);

        ascensor.PresionarBotonAscensor(1,1);
        exception.expect(Exception.class);
        ascensor.PresionarBotonAscensor(4,2);
    }

    @Test
    public void verificarLimitesAscensor() throws Exception {

        //2.Logica de la prueba

        //3. Verificacion o Assert
        ascensor.PresionarBotonAscensor(1,2);
        exception.expect(Exception.class);
        ascensor.PresionarBotonAscensor(4,2);

    }

    @Test
    public void verificarpisoDestinoDifeentedelActual() throws Exception {


        //3. Verificacion o Assert
        ascensor.PresionarBotonAscensor(1,1);
        ascensor.PresionarBotonAscensor(1,2);
        ascensor.PresionarBotonAscensor(1,3);

    }

    @Test
    public void verificarintercalarDireccionesArribayAbajo() throws Exception {

        //2.Logica de la prueba

        //3. Verificacion o Assert
        //exception.expect(Exception.class);
        //ascensor.verificarCantidadPersonas(4);
        ascensor.PresionarBotonAscensor(1,2);
    }



    @Test
    public void verificarpisoDestinoFueraDelRango() throws Exception {

        //2.Logica de la prueba

        //3. Verificacion o Assert
        ascensor.PresionarBotonAscensor(1,1);
        exception.expect(Exception.class);
        ascensor.PresionarBotonAscensor(1,5);
    }

    @Test
    public void verificarprimeraPersonaDElDiaApareceEnElPiso1() throws Exception {

        //2.Logica de la prueba

        //3. Verificacion o Assert
        assertEquals("Abrir ascensor",ascensor.posicionAscensor(1,3));
    }

    @Test
    public void verificarprimeraPersonaDElDiaNoApareceEnElPiso1() throws Exception {

        //2.Logica de la prueba

        //3. Verificacion o Assert
        assertEquals("Esperando ascensor",ascensor.posicionAscensor(3,3));
    }
    @Test
    public void verificarEstadoActualDelAscensor() throws Exception{
        //Verificacion o Assert
        ascensor.PresionarBotonAscensor(1,3);
        assertEquals("Piso actual del ascensor 3",ascensor.verificarEstadoDeAscensor());
        ascensor.PresionarBotonAscensor(1,1);
        assertEquals("Piso actual del ascensor 1",ascensor.verificarEstadoDeAscensor());
        ascensor.PresionarBotonAscensor(1,2);
        assertEquals("Piso actual del ascensor 2",ascensor.verificarEstadoDeAscensor());
    }


}