public class Ascensor {

    private Character[] pisoEdificio ={'0', '0', '0'};
    private final int LIMITE_MAXIMO_PERSONAS=1;



   /* public void usarAscensor(Integer cantidadPersona, Integer pisoActual, Integer pisoDestino) throws Exception{
        verificarCantidadPersonas(cantidadPersona);
        verificarPisoActualConPisoDestino(pisoActual,pisoDestino);
    }

    private void verificarPisoActualConPisoDestino(Integer pisoActual, Integer pisoDestino) throws Exception {
        if(pisoActual==pisoDestino){
            throw new Exception();
        }

    }*/

    public void verificarCantidadPersonas(Integer personas) throws Exception {
        if(personas>LIMITE_MAXIMO_PERSONAS){
            throw new Exception("La capacidad de peso del ascensor esta disponible para una persona");
        }
    }


}
