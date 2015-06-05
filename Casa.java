import java.util.Random;
/**
 * Write a description of class Casa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa extends Inmueble
{
   
    private boolean jardin;
    private boolean tranquila;
    /**
     * Constructor for objects of class Casa
     */
    public Casa()
    {
        jardin=false;
       tranquila=true;
        
        //con dos random evaluamos si hay o nojardin y la tranquilidad
        // del inmueble, en principio no las hay en los pisos
         Random rnd=new Random();
         int hayJardin= rnd.nextInt(2);
         int hayTranquila= rnd.nextInt(2);
        if(hayJardin == 1)
        jardin= true;
        
        if(hayTranquila==1)
        tranquila=true;
    }

    /**
     * devuelve si hay jardin o no
     * @return boolean hay o no jardin
     */
    public boolean getJardin()
    {
    
        return jardin;
    }
    
     /**
     * devuelve si hay tranquilidad o no
     * @return boolean hay o no tranquilidad
     */
    public boolean getTranquila()
    {
    
        return tranquila;
    }

    /**
     * devuelve los datos del piso
     * @return string datos del piso
     */
    public String toString()
    {
        return super.toString() + " Tiene Jardin: " + jardin+ " Situado en zona tranquila : " + tranquila;
    }
    
}
