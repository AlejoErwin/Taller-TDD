public class Ascensor {

    private int[] pisoDeEdificio = {0,0,0};
    private final int NUMERO_DE_PISOS=3;
    private final int LIMITE_MAXIMA_ASCENSOR = 1;
    private int pisoActualAscensor = 0;

    public String PresionarBotonAscensor(int personas, int pisoDestino)throws Exception{
        verificarCapacidad(personas);
        int pisoActual =crearPersona(pisoDestino);
        System.out.println("Se encuentra en el piso "+pisoActual);
        verificarLimitesAscensror(pisoActual);
        String ascensorActual = posicionAscensor(pisoActual, pisoDestino);
        return ascensorActual;
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
        int pisoActual = asignarPisoActual(pisoDestino);
        verificarPisoActualYDestino(pisoActual,pisoDestino);
        verificarPiso(pisoDestino);
        pisoDeEdificio[pisoActual-1]++;
        return pisoActual;
    }
    public int asignarPisoActual(int pisoDestino){
        int posicionPersona;
        while(true){
            posicionPersona = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
            if(posicionPersona!=pisoDestino) break;
        }
        return posicionPersona;
    }
    private void verificarPisoActualYDestino(int pisoActual, int pisoDestino) throws Exception {
        if(pisoActual==pisoDestino){

            //System.out.println("El piso actual y el destino son lo mismo");
            throw new Exception("El piso actual y el destino son lo mismo");
        }
    }
    private void verificarPiso(int pisoDestino) throws Exception{
        if(pisoDestino>NUMERO_DE_PISOS || pisoDestino<1){
            throw new Exception("Piso esta fuera de rango");
        }
    }

    private void verificarLimitesAscensror(int pisoActualAscensor){
        if(pisoActualAscensor==NUMERO_DE_PISOS){
            System.out.println("Solo puede bajar");
        }
        if(pisoActualAscensor==1){
            System.out.println("Solo puede subir");
        }

    }

    public String posicionAscensor(int pisoActual, int pisoDestino) throws Exception {
        String ascensorActual = "";
        if(pisoActualAscensor+1 == pisoActual){
            ascensorActual = "Abrir ascensor";
        }else ascensorActual = "Esperando ascensor";

        pisoActualAscensor = pisoActual;
        limpiarPisoEdificio();
        pisoActualAscensor = pisoDestino - 1;
        return ascensorActual;
    }
    private void limpiarPisoEdificio(){
        for(int i = 0; i < pisoDeEdificio.length ; i++){
            pisoDeEdificio [i] = 0 ;
        }
        //pisoDestinoAscensor = 0;
    }

    public String verificarEstadoDeAscensor() throws Exception{
        int pisoActual = pisoActualAscensor + 1 ;
        return "Piso actual del ascensor " + pisoActual;
    }











}
