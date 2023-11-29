package pc03;

import java.util.Arrays;

public class Dueno {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private Mascota[] mascota=new Mascota[5];
        
    public Dueno(String nombre,String direccion,String telefono){
    this.nombre=nombre;
    this.direccion=direccion;
    this.telefono=telefono;
    }
    
    @Override 
    public String toString(){
        return "Nombre: " +this.nombre+ "\n"+
               "Direccion: "+this.direccion+"\n"+
               "Telefono: "+this.telefono;      
    }
    
    public void nombreMascota() {
            System.out.println(Arrays.toString(mascota));
    }
    
    public void AgregarMascota(Mascota mascota) throws Exception{
        for(int i=0; i<this.mascota.length; i++){
            if(this.mascota[i] == null){
                this.mascota[i] = mascota;
                return;
            }
        }
        throw new Exception("Limite de mascotas alcanzado");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }   
    
    }

