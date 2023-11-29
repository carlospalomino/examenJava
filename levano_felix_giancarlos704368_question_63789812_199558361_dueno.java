/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc3;

import java.util.logging.Logger;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class dueno {
    private String nombre;
    private String direccion;
    private String telefono;

    public dueno(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "dueno{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
     public void nombreMascota() {
         String volver="";
        for(Mascota nombres:Mascotas){
             volver+=nombre+ " ";
         }
      System.out.println(volver);
}
     public void agregarMascota(Mascota mascota){
         if(mascota.length<3)
             
     }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    private static final Logger LOG = Logger.getLogger(dueno.class.getName());

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
}
