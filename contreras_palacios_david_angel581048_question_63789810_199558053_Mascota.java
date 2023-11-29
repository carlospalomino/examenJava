package pc3;

import java.util.Scanner;

public class Mascota {
    private String mascota;
    private String especie;
    private String raza;
    private int edad;
    
    
    public Mascota() {
    }
    
    public Mascota(String mascota,String especie, String raza, int edad){
            this.mascota=mascota;
            this.especie=especie;
            this.raza=raza;
            this.edad=edad; 
    }
    
    @Override
    public String toString(){
        return "Mascosta: "+this.mascota+"\n"+
            "Especie: "+this.especie+"\n" +
            "Raza: "+this.raza+"\n"+
            "Edad: "+this.edad+"\n"; 
    }
    
    public void edadMascota(){
        if(this.edad<=3){
            System.out.println("Es cachorro");
        }else if (edad>3 && edad<8) {
            System.out.println("Es adulto");
            if(edad>8){
                System.out.println("Abuelo");
            }
            
        }
    }
    

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
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

    public static void main(String[] args) {
        Mascota mascota1=new Mascota("Perro","Domestico","Galgo",23);
        System.out.println(mascota1.toString());        
        System.out.println();
    }
}
