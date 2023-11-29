/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc3;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class Dueno {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private Mascota[] mascotas=new Mascota[5];
    
    public Dueno ( String nombre,String direccionString,String telefono, Mascota[] mascotas){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.mascotas=mascotas;
    }
    
    @Override
    public String toString(){
       return "Nombre: "+this.nombre+"\n"+
       "Direccion: "+this.direccion+"\n"+
       "Telefono: "+this.telefono+"\n";
    }
    
    public void nombreMascotas(){
         
    }
    
    public void agregarMascota(Mascota mascota){
        
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

    public Mascota[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }
    
    
    
}
