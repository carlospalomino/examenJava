 
package practica3;

 
public class Dueno {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private Mascota[]mascotas= new Mascota [5];

    public Dueno(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void NombreMascotas(){
        for (int i = 0; i < mascotas.length; i++) {
            if(mascotas[i]!=null){
                System.out.println(mascotas[i].toString());
            }
        }
    }
    
    public void AgregarMascota(Mascota mascota)throws ArrayIndexOutOfBoundsException  {
        for (int i = 0; i < mascotas.length; i++) {
            if (this.mascotas[i]==null) {
                this.mascotas[i] = mascota;
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException("No se puede agregar mas cuentas");
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

     
    
    
}
