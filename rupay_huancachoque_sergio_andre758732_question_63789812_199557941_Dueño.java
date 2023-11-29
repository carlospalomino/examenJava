/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc3;

import java.util.Arrays;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class Dueño {

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
    private String nombre;
    private String direccion;
    private String telefono;
    private Mascota [] mascotas = new Mascota[5];
    
    public Dueño(String nombre,String direccion,String telefono){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nDireccion"+direccion+"\nTelefono: "+telefono;
    }
    public void nombreMascotas(){
        for(int i=0;i<mascotas.length;i++){
            System.out.println(mascotas[i]);
        }
    }
    public void agregarMascota(Mascota mascota)throws Exception{
        try{
             for(int i=0;i<mascotas.length;i++){
                if(mascotas[i]==null){
                    
                    mascotas[i]=mascota;
                    return;
                
                }
             }   
        }catch(Exception e){   
            
            System.out.println("limite de mascotas");     
            
        }
                     
        
            
      
    }
}
