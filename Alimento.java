
/**
 * Write a description of class Alimento here.
 * 
 * @author (Marta Bajo) 
 * @version (a version number or a date)
 */
public class Alimento
{
    // instance variables - replace the example below with your own
    private String nombreAlimento;
    private float gramosProteinas;
    private float carbohidratos;
    private float grasas;
    private float calorias;
    private String componente;
    

    /**
     * Creado el constructor de la clase alimento.
     */
    public Alimento (String nombreAlimento, float gramosProteinas, float carbohidratos, float grasas)
    {
        this.nombreAlimento = nombreAlimento;
        gramosProteinas = 0;
        carbohidratos = 0;
        grasas = 0;
        
    }

    /**
     * Metodo llamado muestraDatos
     */
    public void muestraDatos()
    {
        System.out.println("Nombre: " + nombreAlimento);
        System.out.println("Proteinas por cada 100 gramos: " + gramosProteinas);
        System.out.println("Carbohidratos por cada 100 gramos: " + carbohidratos);
        System.out.println("Grasas por cada 100 gramos: " + grasas);
        System.out.println("Calorias: " + calorias);
        System.out.println("Componente/s mayoritario/s: " + componente);
    }
   
   
    /**
     * Devuelve al valor de los Gramos por proteinas.
     */
   public float gramosProteinas()
   {
    return gramosProteinas;
   }
   
   /**
    * Devuelve el valor de los carbohidratos.
    */
   public float carbohidratos()
   {
    return carbohidratos;
   }
  
   /**
    * devuelve el valor de las grasas.
    */
   public float grasas()
   {
    return grasas;
   }
  
   /**
    * Devuelve el valor de las calorias.
    */
   public float calorias()
   {
    return calorias;
   }

}