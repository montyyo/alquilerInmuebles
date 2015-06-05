import java.util.ArrayList;
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
   private Inmobiliaria sabadel;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente()
    {
        sabadel=new Inmobiliaria();
    }

  
    public void consultarInmueblesInmobiliaria()
    {
    
        sabadel.verInmuebles();
    }
    
    public void consultarLibresFecha(int llegada,int salida,int personas)
    {
    
        sabadel.consultarDisponibles(llegada, salida, personas);
    }
    
    
}
