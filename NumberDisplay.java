
/**
 * 
 * @Franfuentes
 * @version 1.0
 */
public class NumberDisplay
{
    
    private int num;
    
    private int limite;
 
    /**
     * se crea un valor
     * se lke asigna un limite al valor
     * 
     */
    public NumberDisplay(int limSup)
    { 
        limite = limSup;
        num = 0;        
    }
    
    /**
     * metodo que fija valores como parametros.  
     */
    public void setValue(int val)
    {
        if (val <= limite && val >= 0) {
            num = val;
        }
        else {
            System.out.println ("val debe estar entre 0 y " + limite);
        }
    }
    
    /**
     *metodo que devuelve en cadena de 2 caracteres.
     */
    public String getDisplayValue()
    {
        String numero = num + "";
        if (num < 10) {            
            numero = "0" + numero;
        }
        return numero;
    }
    
    /**
     * metodo que devuelve el valor actual
     */
    public int getValue()
    {
        return num;
    }
    
    /**
     * metodo que incrementa en uno y lo hace retornar
     */
    public void increment()
    {
        num++;
        if (num == limite) {
            num = 0;
        }
    }
}
