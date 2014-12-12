
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // Atributo que da nombre al usuario
    private String nombreUsuario;
    // Atributo de la clase alimento que da nombre al alimento.
    private Alimento nombreAlimento;
    //Atributo de la clase alimento que coge el valor de las grasas.
    private Alimento grasas;

    public Usuario (String nombreUsuario, Alimento newNombreAlimento, Alimento newGrasas)
    {
        this.nombreUsuario = nombreUsuario;
        nombreAlimento = newNombreAlimento;
        grasas = newGrasas;
    }

    public String nombreUsuario()
    {
        return nombreUsuario;
    }

    /**
     * Creado metodo para comer el usuario. 
     */
    public void comer(Alimento nombreAlimento, Alimento grasas)
    {
        this.nombreAlimento = nombreAlimento;
        this.grasas = grasas;
    }

}
