
package pc03;

public class dueno {
    private String nombre;
    private String direccion;
    private String telefono;
    private mascota[] Mascotas=new mascota[5];
    
    public dueno(String nombre,String direccion,String telefono){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    
    @Override
    public String toString(){
        return "Nombre:"+nombre+"\nDireccion:"+direccion+"\nTelefono:"+telefono;
    }
    
    public void nombreMascotas(){
        for(int i=0;i<this.Mascotas.length;i++){
            if(this.Mascotas[i]!=null){
                System.out.println(Mascotas[i].toString());
            }
        }
    }
    
     public void AgregarMascota(mascota Mascota) throws Exception{
        for(int i=0; i<this.Mascotas.length; i++){
            if(this.Mascotas[i] == null){
                this.Mascotas[i] = Mascota;
                return;
            }
        }
        throw new Exception("No se pueden tener mas mascotas");
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
