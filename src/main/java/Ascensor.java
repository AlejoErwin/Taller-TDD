public class Ascensor {

    private Character[] pisoEdificio ={'0', '0', '0'};
    private final int LIMITE_MAXIMO_PERSONAS=1;

    public void crearPersona(Integer cantidadPersona, Integer pisoActual, Integer pisoDestino) throws Exception{
        verificarCantidadPersonas(cantidadPersona);

    }

    private void verificarCantidadPersonas(Integer personas) throws Exception {
        if(personas>LIMITE_MAXIMO_PERSONAS){
            throw new Exception();
        }
    }


}
