/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class Dueno {
    private String nombre;
    private String direccion;
    private String telefono;
    private mascota mascotas[];
    
    public Dueno(String nombre, String direccion, String telefono){
        
    }
    @Override
    public String toString(){
        return nombre+"-"+direccion+"-"+telefono;
    }
    public void nombreMascotas(){
        for(int i=0;i<mascotas.length;i++){
            System.out.println(mascotas[i]);
        }
    }
    public void agregarMascota(mascota mascotas){
            
    }
    
    public void setDireccion (String direccion){
        this.direccion=direccion;
    }
    public void setTelefono (String telefono){
        this.telefono=telefono;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
   
    
    public String getNombre (){
        return this.nombre;
    }
    public String getDireccion (){
        return this.direccion;
    }
    public String getTelefono (){
        return this.telefono;
    }
}
