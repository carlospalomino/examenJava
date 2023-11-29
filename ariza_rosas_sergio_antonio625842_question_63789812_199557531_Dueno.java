package practica3;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class Dueno {

    private String nombre;
    private String direccion;
    private String telefono;
    private final Mascota[] mascotas = new Mascota[5] ;

    public Dueno(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    

    
    public void nombreMascota(){
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i]!=null) {
                System.out.println(mascotas[i].toString());
            }
        }
    }
    
    public void agregarMascota(Mascota mascota) throws ArrayIndexOutOfBoundsException{
        for (int i = 0; i < mascotas.length; i++) {
            if (this.mascotas[i]==null) {
                this.mascotas[i] = mascota;
                return;
            }
        }
       throw new ArrayIndexOutOfBoundsException("No se puede agregar mas mascotas");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Dueno{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
}
