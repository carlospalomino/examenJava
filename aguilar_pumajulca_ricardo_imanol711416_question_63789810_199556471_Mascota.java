package aguilarricardo;

public class Mascota {
    
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    
    public Mascota(String nombre, String especie, String raza, int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.raza=raza;
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mascota:");
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nEspecie: ").append(especie);
        sb.append("\nRaza: ").append(raza);
        sb.append("\nEdad: ").append(edad);
        return sb.toString();
    }
    
    public String edadMascota(){
        if(edad<3){
            return "Es cachorro";
        }else if(edad>8){
            return "Es anciano";
        }
        return "Es adulto";
    }
    
    public static void peligrosidad(String raza){
        if (raza.equals("pitbull"))
            System.out.println("Es muy peligroso");
        System.out.println("No hay peligro");
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