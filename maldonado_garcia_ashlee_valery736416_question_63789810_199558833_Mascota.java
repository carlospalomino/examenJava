/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascota;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class Mascota {
       private String nombre;
       private String especie;
       private String raza;
       private int edad;
       private mascota=mascota[5];
       
    public Mascota(String nombre, String especie, String raza, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", edad=" + edad + '}';
      }   
    
     public String edadMascota() {
       String mensaje="";
       if (edad<=3) {
          mensaje="es un cachorro"; 
       }else{
         if (edad>3 || edad<8) {
           mensaje="es un adulto"; 
           }else{
             if(edad>8) {
                 mensaje="esta viejo";
             }
         }   
    }
