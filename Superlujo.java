import java.util.Random;
/**
 * Write a description of class Superlujo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Superlujo extends Casa
{
    private int numPiscinas;
    private int numHabitaciones;
   private static int MINDPISCINAS=1;
   private static int MAXDPISCINAS=6;
   private static int MINHABITAIONES=10;
   private static int MAXHABITAIONES=22;

    /**
     * Constructor for objects of class Superlujo
     */
    public Superlujo()
    {
        //con dos random GENERAMOS EL NUMERO DE HABITACIONES Y PISCIONAS 
        
         Random rnd=new Random();
       numPiscinas=rnd.nextInt(MAXDPISCINAS)+MINDPISCINAS;
       numHabitaciones=rnd.nextInt(MAXHABITAIONES)+MINHABITAIONES;
    }

   /**
    * devuelve el nuemro de piscinas
    * @return int piscinas
    */
   public int getNumPiscinas()
   {
       return numPiscinas;
   }
   
   /**
    * devuelve el numero de habitaciones de la casa
    * @return int num habitaciones 
    */
   public int getNumeroHabitaciones()
   {
       return numHabitaciones;
    }
    
   /**
     *devuelve el precio del alquiler por noche
     *return float
     */
     public float precioNoche()
     {
          int plusTranquila=1;
         if(super.getTranquila() == true)
            plusTranquila = 2;
         float plus= numPiscinas*numHabitaciones*plusTranquila*100;
         return super.precioNoche()+ plus ;
     } 
    
  
   /**
    * devuelve los datos 
    * @return string datos 
    */
   public String toString()
   {
       return super.toString() + " Numero piscinas: " + numPiscinas+
                " Numero de Habitaciones : " + numHabitaciones;
   }
   
   
   
   
   
   
   
}
