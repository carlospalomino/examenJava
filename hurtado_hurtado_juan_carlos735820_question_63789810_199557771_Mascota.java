package practica3;

public class Mascota {

    private String nombre;
    private String especie;
    private String raza;
    private int edad;

    public Mascota(String nombre, String especie, String raza, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
    }
    
     
    
    public String EdadMascota(){
        if (edad<= 3) {
            return("Es un cachorro");
        }else if (edad<8){
            return("Es adulto");
        }else{
           return("abuelo");
            
        }
         
    }
    
    public static void Peligrosidad(String raza){
        if (raza.equals("Pitbull")) {
            System.out.println("Muy peligroso");
        }else{
            System.out.println("Sin peligro");
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota" + "\nnombre=" + nombre + "\nespecie=" + especie + "\nraza=" + raza + "\nedad=" + edad + "";
    }
    
    
    

}
