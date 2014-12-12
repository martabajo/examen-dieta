
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
    private Alimento nombreAlimento;
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

    public void comer(Alimento nombreAlimento, Alimento grasas)
    {
        this.nombreAlimento = nombreAlimento;
        this.grasas = grasas;
    }
}
