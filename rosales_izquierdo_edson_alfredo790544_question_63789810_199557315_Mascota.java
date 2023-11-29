
package pc03;

public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    
    public Mascota(String nombre,String especie,String raza,int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.raza=raza;
        this.edad=edad;
    }
    
    @Override 
    public String toString(){
        return "Nombre: " +this.nombre+ "\n"+
               "Especie: "+this.especie+"\n"+
               "Raza: "+this.raza+"\n"+
               "Edad: "+this.edad;
    }
    
    public void edadMascota() {
            if (edad<=3){
                System.out.println("Es un cachorro");
            } else if (edad>3 && edad<8) {
                System.out.println("Es  un adulto");    
            } else {
                System.out.println("Abuelo");
            }
    }
    
    public static void peligrosidad(String Raza) {
        if (Raza.equals("Pitbull")) {
            System.out.println("Muy peligroso");
        } else {
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
 
}
