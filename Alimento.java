
/**
 * Write a description of class Alimento here.
 * 
 * @author (Marta Bajo) 
 * @version (a version number or a date)
 */
public class Alimento
{
    // variable para el nombreAlimento
    public String nombreAlimento;
    // variable para los gramos 
    public float gramosProteinas;
    // variable para los carbohidratos
    public float carbohidratos;
    // variable para las grasas
    public float grasas;
    // variable para las calorias
    public float calorias;
    // variable para los componenentes
    public String componente;

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

    /**
     * 
     */
    public void alimentoMasCalorico()
    {
        System.out.println("El alimento mas calorico ingerido por el usuario hasta el momento es: " + nombreAlimento);
       
    }

}
