/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc3;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    
    public Mascota ( String nombre,String especie,String raza,int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.raza=raza;
        this.edad=edad;
    }
    
    @Override
    public String toString(){
       return "Nombre: "+this.nombre+"\n"+
       "Especie: "+this.especie+"\n"+
       "Raza: "+this.raza+"\n"+
       "Edad: "+this.edad+"\n";
    }
    
    public void edadMascota(){
        int edadingresada=0;
        if(edadingresada<=3){
            System.out.println("Cachorro");
        }else{
        if(edadingresada>=3){
            System.out.println("adulto");
        }else{
        if(edadingresada>8){
            System.out.println("abuelo");
        }    
      }
    }
        
    
    public static void peligrosidad(){
         
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
}
