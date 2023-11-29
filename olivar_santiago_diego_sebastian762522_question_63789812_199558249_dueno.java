package modelo;

public class dueno {
    
    private String nombre;
    private String direccion;
    private String telefono;
    
    public dueno(){
        //construc. vacio
    }
    
    //construc. completo
    public dueno(String nombre,String direccion,String telefono){
        this.nombre=nombre;
	this.direccion=direccion;
        this.telefono=telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return direccion;
    }

    public void setDirección(String dirección) {
        this.direccion = dirección;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
