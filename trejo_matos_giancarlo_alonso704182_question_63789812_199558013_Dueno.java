/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica03;
public class Dueno {
    private String nombre;
    private String direccion;
    private String telefono;
    private Mascota mascota[];
    
    public Dueno(String nombre,String direccion,String telefono,Mascota mascota[]){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.mascota=mascota;
    }
    
    @Override
        public String toString(){
            return nombre+ "Chester" +direccion+"Comas"+telefono+"958758638";
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

    public Mascota[] getMascota() {
        return mascota;
    }

    public void setMascota(Mascota[] mascota) {
        this.mascota = mascota;
    }
    
}
