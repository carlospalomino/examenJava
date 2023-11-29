/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bruno
 */
public class Dueno {

    private String nombre;
    private String direcion;
    private String telefono;
    private Mascota[] mascotas;

    public Dueno(String nombre, String direcion, String telefono) {
        this.nombre = nombre;
        this.direcion = direcion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Dueno{" + "nombre=" + nombre + ", direcion=" + direcion + ", telefono=" + telefono + '}';
    }

    public void nombreMascotas() {
        String cadena = "";
        for(Mascota nombres : mascotas ){
            cadena+= nombres + " ";
        }
        System.out.println(cadena);
        
        //for (Mascota mascota : mascotas) {
        //    System.out.println(mascota );
        //}
    }
    
    public void agregarMascota(Mascota mascota){
        if ( mascotas.length < 5 ){
            System.out.println("Puede ingresar mascota");
            if (Mascota[0]){
            nombre == ""
            }else if (Mascota[1]){
            nombre == ""
            }else if (Mascota[2]){
            nombre == ""
            }else if (Mascota[3]){
            nombre == ""
            }else if (Mascota[4]){
            nombre == ""
            }
        
        }
    
    }

    
    
    
    
}
