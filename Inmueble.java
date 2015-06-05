import java.util.Random;
/**
 * Write a description of class Inmueble here.
 * 
 * @author marco
 * @version 1-5/6/2015
 */
public class Inmueble
{
   private int id;
   private int distanciaCentro;
   private int numOcupantes;
   private static int MINID=1;
   private static int MINDISTCENTRO=1;
   private static int MAXDISTCENTRO=10;
   private static int MINCAPACIDADINMUEBLE=4;
   private static int MAXCAPACIDADINMUEBLE=12;

    /**
     * Constructor for objects of class Inmueble
    *datos generados aleatoriamente
     */
    public Inmueble()
    {
        //generamos una id para cada inmueble
        id=MINID;
        MINID++;
        Random rnd=new Random();
        distanciaCentro=rnd.nextInt(MAXDISTCENTRO)+MINDISTCENTRO;
        numOcupantes=rnd.nextInt(MAXCAPACIDADINMUEBLE)+MINCAPACIDADINMUEBLE;
    }

    /**
     * devuelve la id del inmueble
     * @return int id del inmueble
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * devuelve la distancia desde el centro de la ciudad
     * @return int distancia 
     */
    public int getDistanciaCentro()
    {
        return distanciaCentro;
    }
    
    /**
     * devuelve el numero de personas que como max podran alojarse
     * @return int num max personas
     */
    public int getNumMaxOcupantes()
    {
        return numOcupantes;
    
    }
    
    /**
     * devuelve los datos del inmueble
     * @return string datos del inmueble
     */
   public String toString()
   {
       return "ID :" + id+"\t Distancia del centro: " + distanciaCentro+
               "\t nuemero max. ocupantes: " + numOcupantes;
    
    }
   
   
}
