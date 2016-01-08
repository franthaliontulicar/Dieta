
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
       
         gramos = alimento.getProteinas() + alimento.getCarbohidratos()+ alimento.getGrasas()+ alimento.getCaloriasTotales();
            
    }
    
    public void mostrarDatos(Alimento alimento){
        System.out.println("Nombre:    "+nombreCompleto);
        System.out.println("Gramos de proteinas ingeridas:    "+alimento.getProteinas());
		System.out.println("Gramos de carbohidratos ingeridos:    "+alimento.getCarbohidratos());
		System.out.println("Gramos de grasas ingeridas:    "+alimento.getGrasas());
		System.out.println("Calorias totales ingeridas:    "+alimento.getCaloriasTotales());
    }

    
}
