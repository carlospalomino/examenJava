/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc3;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class Mascotas {

     private String nombre;
     private String especie;
     private String raza;
     private int edad;

    public Mascotas(String nombre, String especie, String raza, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "mascota{" + "nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", edad=" + edad + '}';
    }
    public String edadMascota(){
        String mensaje="";
        if(edad<=3){
            mensaje="es un baby p";
        }else{
            if(edad>3 || edad<8){
                mensaje="Es un adulto ";
            }else{
                if(edad>8){
                mensaje="Esta viejo";
            }
        }
            
        } 
    }


    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }
    }
    
