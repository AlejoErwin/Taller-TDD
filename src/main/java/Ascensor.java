public class Ascensor {

    private int[] pisoDeEdificio = {0,0,0};
    private final int LIMITE_MAXIMA_ASCENSOR = 1;
    private int pisoActualAscensor = 0;
    private int pisoDestinoAscensor = 0;
    private String estadoPuerta = "cerrado";

    public String PresionarBotonAscensor(int personas, int pisoDestino)throws Exception{
        verificarCapacidad(personas);
        int pisoActual =crearPersona(pisoDestino);
        int piso = posicionAscensor(pisoActual, pisoDestino);
        return "El ascensor esta en el piso: "+piso;
    }
    private void verificarCapacidad(int cantidadPersonas) throws Exception{
        if(cantidadPersonas>LIMITE_MAXIMA_ASCENSOR) {
            throw new Exception("Capacidad excedida");
        }
        else{
            if(cantidadPersonas==LIMITE_MAXIMA_ASCENSOR){
                System.out.println("Capacidad Aceptada");
            }
        }

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
    private void verificarPisoActualYDestino(int pisoActual, int pisoDestino){
        if(pisoActual==pisoDestino){
            System.out.println("El piso actual y el destino son lo mismo");
        }
    }
    private void verificarPiso(int pisoDestino) throws Exception{
        if(pisoDestino>pisoDeEdificio.length || pisoDestino<1){
            throw new Exception("Piso inexistente");
        }
    }

    private int posicionAscensor(int pisoActual, int pisoDestino){
        String mensaje = "";
        //if(pisoActualAscensor+1 == pisoActual && pisoDestinoAscensor == 0){
        //    mensaje = "Abrir inmediatamente";
        //}else{
        //    mensaje = "Esperando ascensor";
        //}
        pisoActualAscensor = pisoActual;
        estadoPuerta = "abierto";
        pisoDestinoAscensor = pisoDestino;
        estadoPuerta = "cerrado";
        limpiarPisoEdificio();
        pisoActualAscensor = pisoDestino - 1;
        return pisoActualAscensor;
    }
    private void limpiarPisoEdificio(){
        for(int i = 0; i < pisoDeEdificio.length ; i++){
            pisoDeEdificio [i] = 0 ;
        }
        pisoDestinoAscensor = 0;
    }









}
