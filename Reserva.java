
/**
 * Write a description of class Reserva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reserva
{
       private int id;
       private int diaLlegada;
       private int diaSalida;
       private int numPersonas;
       private int dni;

    /**
     * Constructor for objects of class Reserva
     */
    public Reserva(int id, int diaLlegada,int diaSalida ,int numPersonas,int dni)
    {
        this.id=id;
        this.diaLlegada=diaLlegada;
        this.diaSalida=diaSalida;
        this.numPersonas=numPersonas;
        this.dni=dni;
    }

   
    public int getId()
    {
        return id;
    }
    
    public int getDiaLlegada()
    {
        return diaLlegada;
    }
    
    public int getDiaSalida()
    {
        return diaSalida;
    }
    
    public int getNumPersonas()
    {
        return numPersonas;
    }
    
    public int getDni()
    {
        return dni;
    }
    
    public int diasEstancia()
    {
        return diaLlegada - (diaSalida-1);
    }
    
    public String toString()
    {
        return " ID inmueble: " + id + 
                " numero de ocupantes: " + numPersonas+
                " Dia llegada: " + diaLlegada+
                "Dia salida: " + diaSalida+
                "DNI cliente: " + dni+
                " noches de la estancia: " + diasEstancia();
    }
}
