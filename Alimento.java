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
        proteinas = proteinasGramo * 4 / 100;        
        carbohidratos = carbohidratosGramo * 4 / 100;
        grasas = grasasGramo * 9 / 100;

    }

    public void muestraDatos(){
        System.out.println("----");
        System.out.println("Nombre:  "+nombre);
        System.out.println("Proteinas por cada 100 gramos:   "+proteinas);
        System.out.println("Carbohidratos por cada 100 gramos:   "+carbohidratos);
        System.out.println("Grasas por cada 100 gramos:    "+grasas);
        float calorias = proteinas + carbohidratos + grasas;
        System.out.println("calorias:    "+calorias);
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

