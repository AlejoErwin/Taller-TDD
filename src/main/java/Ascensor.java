public class Ascensor {

    private int[] pisoDeEdificio = {0,0,0};
    private final int LIMITE_MAXIMA_ASCENSOR = 1;

    public void PresionarBotonAscensor(int personas, int pisoDestino)throws Exception{
        verificarCapacidad(personas);
        int pisoActual =crearPersona(pisoDestino);
    }
    private void verificarCapacidad(int cantidadPersonas) throws Exception{
        if(cantidadPersonas>LIMITE_MAXIMA_ASCENSOR)
            throw new Exception("");
    }
    public int crearPersona(int pisoDestino) throws Exception{
        int pisoActual = asignarPisoActual();
        verificarPisoActualYDestino(pisoActual,pisoDestino);
        verificarPiso(pisoDestino);
        pisoDeEdificio[pisoActual-1]++;
        return pisoActual;
    }
    public int asignarPisoActual(){
        int posicionPersona = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
        return posicionPersona;
    }
    private void verificarPisoActualYDestino(int pisoActual, int pisoDestino) throws Exception{
        if(pisoActual==pisoDestino){
            throw new Exception("Piso actual y el destino es el mismo");
        }
    }
    private void verificarPiso(int pisoDestino) throws Exception{
        if(pisoDestino>pisoDeEdificio.length || pisoDestino<1){
            throw new Exception("Piso inexistente");
        }
    }









}
