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
     * consultar reservas
     * 
     */
    public void reservasAgosto()
    {
        for(Reserva reserv:reservas)
        {
            System.out.println(reserv);
        
        }
    }
          
    /**
     * consultar si esta libre un inmueble 
     */
    public void consultarDisponibles(int llegada,int salida,int personas)
    {   
        ArrayList<Inmueble> libres= new ArrayList<>();
        libres=(ArrayList)inmuebles.clone();
        ArrayList<Inmueble> ocupados= new ArrayList<>();
       //obtenemos los inmuebles que no podemos alquilar
       for(Reserva reserv:reservas)
        {
            if(reserv.getDiaLlegada()==llegada && reserv.getDiaSalida()==salida)
            {
                int id=reserv.getId();
                for(Inmueble inmueb:inmuebles)
                {
                        if(inmueb.getId() == id)
                        {
                            ocupados.add(inmueb);
                        }
                        
                }
            }
        
        }
        
        
        
       //eliminamos los inmuebles ocupados 
       for(Inmueble inmueb:libres)
        {
            
            for(Inmueble reservado:ocupados)
            {
                if(inmueb.getId() != reservado.getId())
                {
                    libres.remove(inmueb);
                }
                          
                   
               
            }
        }
        
        
        //comprobamos de los libres cuales pueden albergar a las personas
        for(Inmueble libre:libres)
            {
                if(libre.getNumMaxOcupantes() > personas)
                {
                    System.out.println(libre);
                }
                
            }
            
        
    }
    
   
}
