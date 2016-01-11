
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
        float totalNutrientes = (proteinas + grasas + 			carbohidratos) / 100;
       		String datosProteinas = "Gramos totales de proteinas ingeridos:     " + proteinas;
        	String datosCarbohidratos = "Gramos totales de carbohidratos ingeridos: " + 			carbohidratos;
        	String datosGrasas = "Gramos totales de grasas ingeridos:        " + grasas;
        	if (proteinas > 0) {
            	datosProteinas = datosProteinas + " (" + proteinas / totalNutrientes + "%)";
        	}
        	if (carbohidratos > 0) {
            	datosCarbohidratos = datosCarbohidratos + " (" + carbohidratos / totalNutrientes + "%		)";
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

}
