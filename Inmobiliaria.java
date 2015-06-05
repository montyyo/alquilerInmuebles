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
       
       for(int a = 0; a < inmuebles.size();a++)
       {
        
           for(int i = 0 ; i < ocupados.size();i++)
           {
            
               if(inmuebles.get(a).getId() != ocupados.get(i).getId())
               {
                   libres.add(inmuebles.get(a));
                }
            }
           
       }
        
        //comprobamos de los libres cuales pueden albergar a las personas indicadas
        for(Inmueble libre:libres)
            {
                if(libre.getNumMaxOcupantes() > personas)
                {
                    System.out.println(libre + "alquiler por noche:" + libre.precioNoche() + 
                    "total estancia: " + libre.precioNoche()*(llegada - (salida-1)));
                }
                
            }
            
            
        
        
    }
   
    /**
     * reserva un inmueble si esta libre en unas fechas
     */
    public void realizarReserva(int llegada,int salida,int personas,int idInmueble,int dniInquilino)
    {   
        //con un booleano conprobamos si esta libre para las fechas indicadas
        boolean realizarReserva=true;
        for(Reserva reserva:reservas)
        {
        
            if(reserva.getId() == idInmueble && reserva.getDiaLlegada()== llegada && reserva.getDiaSalida()==salida)
            {
               realizarReserva=false;
            }
        }
        
        //si esta libre hacemos la reserva
        if(realizarReserva=true)
        {
        
            addReserva(new Reserva( idInmueble, llegada, salida ,personas, dniInquilino));
            
        }
    }
    
    /**
     * visualizar los inmuebles ordenados por numero de reservas
     */
   public void ordenarPorNumeroReservas()
   {
             
       
    
   }
   
   
   /**
    * ordenamos por ingresos los inmuebles
    */
   
   public void ordenarPorIngresos()
   {
    
   }
   
   
}
