/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class Mascota {
    
     String nombre;
      String especie;
     String raza;
     int edad;

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

    public Mascota(String nombre, String especie, String raza, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
    }

    public void calcularedadmascota(){
        if(edad<=3){
            System.out.println("es un cachorro");
        }else{
            System.out.println("no es un cachorro");
        if(edad<=8){
            System.out.println("es adulto");
        }else{
            System.out.println("no es un adulto");
        }
        if(edad>8){
            System.out.println("es un abuelo peligroso");
        }else{
            System.out.println("no es un abuelo, no es peligroso");
        }
    }
        
        
        
    }
    
    

  
    }
    

