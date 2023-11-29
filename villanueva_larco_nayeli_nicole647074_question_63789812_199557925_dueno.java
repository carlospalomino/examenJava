/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascota;

public class dueno {
    private String nombre;
    private String direccion;
    private String telefono;
    private mascota[] mascotas;
    
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
    
    public dueno(String nombre, String direccion, String telefono){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    
    @Override
    public String toString(){
        return nombre+"-"+direccion+"-"+telefono;
    }
    
     public void agregarMascota(mascota[] mascotas){
                for(int i=0; i<mascotas.length;i++){
            System.out.println(mascotas[i]);
        }   
        
        
    }            
    
    public void nombreMascotas(){
        this.mascotas=new mascota[5];

    }
    
   
}
