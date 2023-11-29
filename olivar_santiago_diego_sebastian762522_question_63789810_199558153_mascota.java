package modelo;

public class mascota{

    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    
    public mascota(){
        //construc. vacio
    }
    
    public mascota(String nombre,String especie,String raza,int edad){
        this.nombre=nombre;
	this.especie=especie;
        this.raza=raza;
        this.edad=edad;
    }

    public int edadMascota(){
	if (edad <= 3) {
            System.out.println("Es un cachorro");
        } else if (3 <edad && edad < 8) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es un abuelo");
        }
        return edad;
    }
    
    public String peligrosidad(String raza){
	if ("pitbull".equals(raza)) {
            System.out.println("Muy peligroso");
        } else {
            System.out.println("Sin peligro");
        }
        return raza;
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




				