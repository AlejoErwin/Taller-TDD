public class Calculadora {
    private final Integer MAX = 1000;
    public String suma(String sumandos) throws Exception{
        if (sumandos != null && sumandos.equals("")){
            return "0";
        }
        int total=0;
        String[] sp=sumandos.split(",");
        for (int i=0;i<sp.length;i++){
            if (Integer.parseInt(sp[i])<MAX){
                total=total+Integer.parseInt(sp[i]);
            }
            if(Integer.parseInt(sp[i])<0){
                throw new Exception("El numero es negativo");
            }
        }
        return String.valueOf(total); //HardCode
    }
}
