package pc3;

public class Dueno {
    private String nombre;
    private String direccion;
    private String telefono;
    private final Mascota [] mascota= new Mascota[5];
    
    public Dueno(){
        
    }
    
    public Dueno(String nombre,String direccion, String telefono){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }

    @Override
    public String toString(){
        return "Nombre: "+this.nombre+ "\n"+
                "Direccion: "+this.direccion+"\n"+
                "Telefono: "+this.telefono+"\n";
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

    public static void main(String[] args) {
        Dueno dueno1=new Dueno("Carlos","Los Olivos","987654321");
        System.out.println(dueno1.toString());
    }
    
    
}