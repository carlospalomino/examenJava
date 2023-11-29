
package pc03;

public class mascota {
    private String nombre;
    private int edad;
    private String raza;
    private String especie;
    
    public mascota(String nombre,int edad,String raza, String especie){
        this.nombre=nombre;
        this.edad=edad;
        this.raza=raza;
        this.especie=especie;
    }
 
    @Override
    public String toString(){
        return "Nombre:"+nombre+"\nEdad:"+edad+"\nRaza:"+raza+"\nEspecie:"+especie;
    }
    
    public String edadMascota(int edad){
        String edadMascota;
        if(edad<3){
            edadMascota="Cachorro";
        } else if(edad>3 && edad<8){
            edadMascota="Adulto";
            }else{
                edadMascota="Abuelo";
            }
        return edadMascota;
    }
    
    public static void Peligrosidad(String raza){
        if(raza.equals("Pitbull")){
            String Peligrosidad="Muy peligroso";
        }else{
            String Peligrosidad="Sin peligro";
        }
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
