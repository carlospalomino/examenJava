/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private String edad;

    public Mascota(String nombre, String especie, String raza, String edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
    }
    public void Peligrosidad(String raza){
        if(raza=="pitbull"){
            System.out.println("Muy Peligroso");
        }else{
            System.out.println("Sin Peligro");
        }
    }
    public void edadMascota(int edad){
        if(edad<=8){
            if(edad<=3){
                System.out.println("Es cachorro");
            }else{
                System.out.println("Es adulto");
            }
        }else{
            System.out.println("Es anciano");
        }
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+" - "+"Especie: "+especie+" - "+"Raza: "+raza+" - "+"Edad "+edad;
    }
}
