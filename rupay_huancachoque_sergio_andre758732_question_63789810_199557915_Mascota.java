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
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    
    public Mascota(String nombre, String especie, String raza, int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.raza=raza;
        this.edad=edad;
        
    }
    public Mascota(){
        
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+ "\nEspecie: "+especie+"\nRaza: "+raza+"\nedad: "+edad;
    }
    public String edadMascota(int edad){
        String edad_mascota;
        if (edad<=3){
            edad_mascota="Es un cachorro";     
        } else if(edad>3 || edad<=8){
            edad_mascota="Es un adulto";
        }else{
            edad_mascota="Es un abuelo";
        }
        return edad_mascota;
    }
    public static void peligrosidad(String raza){
        if(raza.equals("pitbull")){
            System.out.println("Muy peligroso");
        }else{
            System.out.println("Sin peligro");
        }
    }
}
