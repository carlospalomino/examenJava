/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class mascota {
    private String nombre;  
    private String especie;  
    private String raza;
    private int edad;

    public mascota(String nombre, String especie, String raza, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
    }
    @Override 
    public String toString() {
    return nombre+" "+especie+" "+raza+" "+edad;
    }
   public String EdadMascota(){
    String edadMascota="";
    if(edad<=3){
        edadMascota="es un cachorro";
    }else{
     if(edad<8){
        edadMascota="es adulto";
    }else{
           edadMascota="es abuelo"; 
            }   
    }
    return edadMascota;
    }
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
