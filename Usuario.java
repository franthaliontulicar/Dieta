
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

    public Usuario(String nombreDeUsuario){
        nombreCompleto = nombreDeUsuario;
        proteinas =0;
        carbohidratos = 0;
        grasas = 0;
        caloriasTotales = 0;

    }

    public void comer(Alimento alimento, float gramos){
        proteinas = proteinas +(alimento.getProteinas()/100* gramos);
        carbohidratos = proteinas +(alimento.getCarbohidratos()/100* gramos);
        grasas = proteinas +(alimento.getGrasas()/100* gramos);
        caloriasTotales = proteinas +(alimento.getCaloriasTotales()/100* gramos);

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
        String masCalorico = "null"; 
        if(alimento.getCaloriasTotales() == alimento2.getCaloriasTotales()){
            masCalorico = "iguales";
            System.out.println("El alimento mas calorico ingerido por el usuario es "+masCalorico+" ("+alimento.getCaloriasTotales()+" calorias por cada 100 gramos )");
        }
        else{
            if(alimento.getCaloriasTotales() > alimento2.getCaloriasTotales()){
                masCalorico = alimento.getNombre();
                 System.out.println("El alimento mas calorico ingerido por el usuario es "+masCalorico+" ("+alimento.getCaloriasTotales()+" calorias por cada 100 gramos )");
            }
            else{
                if(alimento.getCaloriasTotales() < alimento2.getCaloriasTotales()){
                    masCalorico = alimento2.getNombre();
                     System.out.println("El alimento mas calorico ingerido por el usuario es "+masCalorico+" ("+alimento2.getCaloriasTotales()+" calorias por cada 100 gramos )");
                }
                else{
                System.out.println("No se ha ingerido ningun alimento ");
                }
            
            }
        }
    }
}
