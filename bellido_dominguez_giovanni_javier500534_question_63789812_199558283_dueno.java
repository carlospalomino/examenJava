/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class dueno {
    private String nombre;
    private String direccion;
    private String telefono;
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
   public dueno(String nombre, String direccion, String telefono) {
   this.nombre = nombre;
   this.direccion = direccion;
   this.telefono = telefono;
   }
    @Override
    public String toString(){
        return nombre+"-"+direccion+"-"+telefono;
        
    }
}
