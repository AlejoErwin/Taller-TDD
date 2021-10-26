public class Ascensor {

    private int[] pisoDeEdificio = {0,0,0};
    private final int LIMITE_MAXIMA_ASCENSOR = 1;
    private int pisoActualAscensor = 0;
    private int pisoDestinoAscensor = 0;
    private String estadoPuerta = "cerrado";

    public void PresionarBotonAscensor(int personas,int pisoActual, int pisoDestino)throws Exception{
        verificarCapacidad(personas);
        crearPersona(pisoDestino);
    }
    private void verificarCapacidad(int cantidadPersonas) throws Exception{
        if(cantidadPersonas>LIMITE_MAXIMA_ASCENSOR)
            throw new Exception("");
    }
    public String crearPersona(int pisoDestino) throws Exception{
        int pisoActual = asignarPisoActual();
        verificarPisoActualYDestino(pisoActual,pisoDestino);
        verificarPiso(pisoDestino);
        pisoDeEdificio[pisoActual-1]++;
        return "La persona esta en el piso: "+pisoActual;
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
