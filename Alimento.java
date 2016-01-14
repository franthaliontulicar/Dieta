//import java.util.ArrayList;
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    private String nombre;
    private float proteinas;
    private float carbohidratos;
    private float grasas;

    public Alimento(String nombreAlimento, float proteinasGramo, float carbohidratosGramo, float grasasGramo){
        nombre = nombreAlimento;       
        proteinas = proteinasGramo * 4;        
        carbohidratos = carbohidratosGramo * 4;
        grasas = grasasGramo * 9 ;

    }
    
    public float getProteinas(){
        return proteinas;
    }
    
     public float getCarbohidratos(){
        return carbohidratos;
    }
    
    
     public float getGrasas(){
        return grasas;
    }
    
     public float getCaloriasTotales(){
        float caloriasTotales = proteinas + carbohidratos + grasas;
        return caloriasTotales;
    }
    
    public String getNombre(){
    
    return nombre;
}

    public void muestraDatos(){
        System.out.println("----");
        System.out.println("Nombre:  "+nombre);
        System.out.println("Proteinas por cada 100 gramos:   "+getProteinas());
        System.out.println("Carbohidratos por cada 100 gramos:   "+getCarbohidratos());
        System.out.println("Grasas por cada 100 gramos:    "+getGrasas());
        System.out.println("calorias:    "+getCaloriasTotales());
        String mayoritario = "null";
        if(proteinas > carbohidratos){
            if(carbohidratos > grasas){
                mayoritario = "proteinas";            
            }

        }
        else{
            if(carbohidratos == proteinas){
                mayoritario = "carbohidratos y proteinas";

            }
            else{
                if(grasas > carbohidratos){
                    mayoritario = "grasas";   
                }
                else{
                    if(carbohidratos == grasas){
                        mayoritario = "carbohidratos y grasas";
                    }
                    else{
                        if(grasas == proteinas){
                            mayoritario = "grasas y proteinas";
                        }
                        else{
                            mayoritario = "carbohidratos";
                        }
                    }
                }
            }
        }
        System.out.println("Macronutriente mayoritario:    "+mayoritario);
    }

}

