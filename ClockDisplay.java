
/**
 * * Reloj 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    
    private NumberDisplay horas;
   
    private NumberDisplay minutos;
   
    private String tiempo;
    
    /**
     * constructor crea hora y minutos a 0
     */
    public ClockDisplay()
    {
      
        horas = new NumberDisplay(24);        
        minutos = new NumberDisplay(60);
        tiempo = horas.getDisplayValue() + ":" + minutos.getDisplayValue();        
    }

    /**
     * constructor para reloj en el cual se fija la hora al construirse
     */
    public ClockDisplay(int h, int m)
    {
        horas = new NumberDisplay(24);
        horas.setValue(h);
        minutos = new NumberDisplay(60);
        minutos.setValue(m);
        tiempo = horas.getDisplayValue() + ":" + minutos.getDisplayValue(); 
    }
   
    /**
     * metodo en el cual se introducen las horas y minutos     
     */
    public void setTime(int h, int m)
    {
        horas.setValue(h);
        minutos.setValue(m);
        tiempo = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
        /**
     * Metodo que devuelve el tiempo en formato de 12 horas     
     */
    public String getTime()
    {
        String periodo = " am";
        String hora = horas.getDisplayValue();
        if (horas.getValue() > 12) {
        periodo = " pm";
        hora = horas.getValue() - 12 + "";
         }
        if (horas.getValue() == 00) {
            hora = 12 + "";
        }
        tiempo = hora + ":" + minutos.getDisplayValue() + periodo;
        
        
        return tiempo;
    }
  
    /**
     * Avanzar un minuto hacia delante
     */
    public void timeTick()
    {
        minutos.increment();
        if (minutos.getValue() == 0) {
            horas.increment();
        }
        tiempo = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
}    
