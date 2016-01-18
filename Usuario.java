import java.util.ArrayList;
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    private String nombreCompleto;
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    private float caloriasTotales;
    private Alimento alimentoMasCalorico;
    private ArrayList<Alimento> alimentoIngerido;

    public Usuario(String nombreDeUsuario){
        nombreCompleto = nombreDeUsuario;
        proteinas =0;
        carbohidratos = 0;
        grasas = 0;
        caloriasTotales = 0;
        alimentoMasCalorico = null;
        alimentoIngerido = new ArrayList<Alimento>();

    }

    public void comer(Alimento alimento, float gramos){
        proteinas = proteinas +(alimento.getProteinas()/100* gramos);
        carbohidratos = proteinas +(alimento.getCarbohidratos()/100* gramos);
        grasas = proteinas +(alimento.getGrasas()/100* gramos);
        caloriasTotales = proteinas +(alimento.getCaloriasTotales()/100* gramos);
        if (alimentoMasCalorico != null) {
            if (alimento.getCaloriasTotales() >= alimentoMasCalorico.getCaloriasTotales()) {
            alimentoMasCalorico = alimento;
            }
        }
        else {
            alimentoMasCalorico = alimento;
        }
        
        alimentoIngerido.add(alimento);

        //gramos = alimento.getProteinas() + alimento.getCarbohidratos()+ alimento.getGrasas()+ alimento.getCaloriasTotales();
    }

    public void mostrarDatos(){
        float totalNutrientes = (proteinas + grasas +           carbohidratos) / 100;
        String datosProteinas = "Gramos totales de proteinas ingeridos:     " + proteinas;
        String datosCarbohidratos = "Gramos totales de carbohidratos ingeridos: " +             carbohidratos;
        String datosGrasas = "Gramos totales de grasas ingeridos:        " + grasas;
        if (proteinas > 0) {
            datosProteinas = datosProteinas + " (" + proteinas / totalNutrientes + "%)";
        }
        if (carbohidratos > 0) {
            datosCarbohidratos = datosCarbohidratos + " (" + carbohidratos / totalNutrientes + "%       )";
        }
        if (grasas > 0) {
            datosGrasas = datosGrasas + " (" + grasas / totalNutrientes + "%)";
        }
        System.out.println("Nombre:                                    " + nombreCompleto);
        System.out.println(datosProteinas);    
        System.out.println(datosCarbohidratos);
        System.out.println(datosGrasas);
        System.out.println("Calorias totales ingeridas:                " + caloriasTotales);    
    }

    public String getNombre(){
        return nombreCompleto;

    }

    public float getCaloriasTotalesIngeridas(){
        return caloriasTotales;

    }

    public void comparar(Usuario usuario2){
        if(getCaloriasTotalesIngeridas() > usuario2.getCaloriasTotalesIngeridas()){
            System.out.println(getNombre()+" ha consumido mas calorias que "+usuario2.getNombre()+" ("+getCaloriasTotalesIngeridas()+" frente a "+usuario2.getCaloriasTotalesIngeridas()+")");
        }
        else{
            if(getCaloriasTotalesIngeridas() == usuario2.getCaloriasTotalesIngeridas()){
                System.out.println(getNombre()+" y  "+usuario2.getNombre()+" han consumido las mismas calorias ("+getCaloriasTotalesIngeridas()+")");
            }
            else{
                System.out.println(usuario2.getNombre()+" ha consumido mas calorias que "+getNombre()+" ("+usuario2.getCaloriasTotalesIngeridas()+" frente a "+getCaloriasTotalesIngeridas()+")");
            }
        }

    }

    public void alimentoMasCalorico(Alimento alimento, Alimento alimento2){
        if (alimentoMasCalorico == null) {
            System.out.println("No has consumido ningun alimento");
        }
        else {
            System.out.println("El alimento mas calorico es: " + alimentoMasCalorico.getNombre() +
                   "(" + alimentoMasCalorico.getCaloriasTotales() + ")");
          }
    }

    public void muestraAlimentoPorPosicion(int posicion)
    {
        if ((posicion >= 1) && (posicion <= alimentoIngerido.size())) {
            alimentoIngerido.get(posicion-1).muestraDatos();
        } 
        else {
            System.out.println("La posicion dada no es valida");
        }

    }

    public void vecesComido(String nombreAlimento){    
        int contAli = 0;    
        for(Alimento alimento : alimentoIngerido){        
            if(alimento.getNombre().contains( nombreAlimento)){//comparo el nombre 
                contAli = contAli +1;//se cuenta las veces que se consumen con un contador
                System.out.println("el usuario ha ingerido "+nombreAlimento+" "+contAli+" veces.");
            }
            if(contAli <= 1){
                System.out.println("El alimento no se comió más de una vez");
            }
            else {
                System.out.println("El alimento se comio más de una ve  z: " + contAli + " veces");
            }

        }
    }

    public void alimentosConsumidosVariasVeces(){
        int contAli = 0;
        for(Alimento alimento : alimentoIngerido){
            if(numeroVecesIngeridoAlimento(alimento) > 1){
                //System.out.println(alimento.getNombre());
                contAli++;
                System.out.println(contAli);
            } 
        }
    
    }
    
    public int numeroVecesIngeridoAlimento(Alimento nombreAli){
        int contRep = 0;
        for(Alimento alimento : alimentoIngerido){
            if(alimento.getNombre() == nombreAli.getNombre()){
                contRep = contRep + 1;//contRep++;

            }
        }
        return contRep;
    }
}
