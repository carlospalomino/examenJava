/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    
    public mascota(String nombre, String especie, String raza,int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.raza=raza;
        this.edad=edad;
    }
    
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public void setEspecie (String especie){
        this.especie=especie;
    }
    public void setRaza (String raza){
        this.raza=raza;
    }
    public void setEdad (int edad){
        this.edad=edad;
    }
    
    public String getNombre (){
        return this.nombre;
    }
    public String getRaza (){
        return this.raza;
    }
    public String getEspecie (){
        return this.especie;
    }
    public int getEdad (){
        return this.edad;
    }
    
    @Override
    public String toString(){
        return nombre+"-"+edad+"-"+raza+"-"+especie;
    }
    
    public static void peligrosidad(String raza){
        if (raza.equals("Pitbull")||raza.equals("pitbull")){
            System.out.println("Peligroso");
        }else{
            System.out.println("No es peligroso");
        }
    }
    
    public String edadMascota(){
        
        String edadP="";
        
        if(edad<=3){
            edadP.equals("Es un cachorro");
        }else{
                if(edad>3&&edad<8){
                    edadP.equals("Adulto");
                }else{
                    edadP.equals("Abuelo");
                }
        }
        return edadP;
    }
    
}
