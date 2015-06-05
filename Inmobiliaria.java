import java.util.ArrayList;
/**
 * generamos los distintos edificios y metodos que consultaran los usuarios y trabajadores
 * 
 * @author marco
 * @version 5/6/2015
 */
public class Inmobiliaria
{
   private ArrayList<Inmueble> inmuebles;
   private int NUMINMUEBLES=5;//minmo numero de inmuebles de cada tipo
   
   
   private ArrayList<Reserva> reservas;

    /**
     * Constructor for objects of class Inmobiliaria
     */
    public Inmobiliaria()
    {
      inmuebles=new ArrayList<>();
      reservas=new ArrayList<>();
      
      //generamos los inmuebles aleatorios y los vamos añadiendo al array de la inmobliaria
      //casas
      for(int a =0;a< NUMINMUEBLES;a++)
      {
        inmuebles.add(new Casa());
      }
      //pisos
      for(int a =0;a< NUMINMUEBLES;a++)
      {
        inmuebles.add(new Piso());
      }
      //superlujo (casas)
      for(int a =0;a< NUMINMUEBLES;a++)
      {
        inmuebles.add(new Superlujo());
      }
    }

    
    
    /**
     * genera un listado de los inmuebles disponibles
     * 
     */
    public void verInmuebles()
    {
        //recorermos el foreach y vamos inprimiendo todos los datos de lo inmuebles disponibles
        for(Inmueble inmueb:inmuebles)
        {
            System.out.println(inmueb);
        }
    }
    
    /**
     * añadimos una reserva 
     */
    public void addReserva(Reserva reserva)
    {
        reservas.add(reserva);
    }
     
          
    /**
     * consultar si esta libre un inmueble 
     */
    public void consultarDisponibles(int llegada,int salida,int pesonas)
    {
    
        
    }
}
