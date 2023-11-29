/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mascotas;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class mascotas {
    private String nombre;
    private String especie;
    private String raza;
    private int edad; 
    
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
   public mascotas(String nombre, String especie, String raza, int edad) {
   this.nombre = nombre;
   this.especie = especie;
   this.raza = raza;
   this.edad = edad;
    }
   @Override
    public String toString(){
        if(edad<=3){
            System.out.println("Es un cachorro");
        }else{
            if(edad>=8){
                System.out.println("Es un adulto");
                }else{
            if(edad<=8){
                System.out.println("Es un abuelo");
            }
        }    
    }
    return nombre+"-"+especie+"-"+raza+"-"+edad;
    }
    public void RazaMascota(){
        if(raza.equals="pitbull"){
         System.out.println("La raza es muy peligroso");
     } else{
         System.out.println("La raza es sin peligro");
     }
    }
}



