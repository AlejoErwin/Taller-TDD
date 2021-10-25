import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class AscensorTest1 {

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
        exception.expect(Exception.class);
        ascensor.verificarCantidadPersonas(4);
    }

    @Test
    public void intercalarDireccionesArribayAbajo() throws Exception {

        //2.Logica de la prueba

        //3. Verificacion o Assert
        exception.expect(Exception.class);
        ascensor.verificarCantidadPersonas(4);
    }

    @Test
    public void pisoDestinoDifeentedelActual() throws Exception {

        //2.Logica de la prueba

        //3. Verificacion o Assert
        exception.expect(Exception.class);
        ascensor.verificarCantidadPersonas(4);
    }

    @Test
    public void pisoDestinoDifeentedelActual() throws Exception {

        //2.Logica de la prueba

        //3. Verificacion o Assert
        exception.expect(Exception.class);
        ascensor.verificarCantidadPersonas(4);
    }













}