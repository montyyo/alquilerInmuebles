import java.util.Random;
/**
 * Write a description of class Piso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piso extends Inmueble
{
   
    private boolean terraza;
    private boolean ascensor;
    
    /**
     * Constructor for objects of class Piso
     */
    public Piso()
    {
        terraza=false;
        ascensor=true;
        
        //con dos random evaluamos si hay o no terraza, en principio no las hay en los pisos
         Random rnd=new Random();
         int hayTerraza= rnd.nextInt(2);
         int hayAscensor= rnd.nextInt(2);
        if(hayTerraza == 1)
        terraza = true;
        
        if(hayAscensor==1)
        ascensor=true;
        
        
    }
    
    /**
     * devuelve si hay terraza o no
     * @return boolean hay o no terraza
     */
    public boolean getTerraza()
    {
    
        return terraza;
    }
    
     /**
     * devuelve si hay ascensor o no
     * @return boolean hay o no ascenso0r
     */
    public boolean getAscensor()
    {
    
        return ascensor;
    }
    
    
    /**
     *devuelve el precio del alquiler por noche
     *return float
     */
     public float precioNoche()
     {
         int plus=1;
         if(ascensor == true || terraza==true)
            plus = 2;
         return super.precioNoche() *plus;
     }
     
     
    /**
     * devuelve los datos del piso
     * @return string datos del piso
     */
    public String toString()
    {
        return super.toString() + " Terraza: " + terraza+ " Ascensor: " + ascensor ;
    }
    
}
