package aguilarricardo;

public class Duenio {
    
    private String name;
    private String dire;
    private String telf;
    private Mascota[] mascota = new Mascota[5];

    public Duenio(String name, String dire, String telf) {
        this.name = name;
        this.dire = dire;
        this.telf = telf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Duenio:");
        sb.append("\nNombre: ").append(name);
        sb.append("\nDirecion: ").append(dire);
        sb.append("\nTelefono: ").append(telf);
        return sb.toString();
    }
    
    public void nombreMascotas(){
        for(int i=0;i<mascota.length;i++){
            System.out.printf("\nNombre mascota: %2d %10s",i,mascota[i]);
        }
    }
    
    public void aregarMascota(Mascota mascota){
        try{
            for(int i=0;i<this.mascota.length;i++){
                if(this.mascota[i] == null){
                   this.mascota[i] = mascota; 
                }
            }
        }catch(Exception e){
            throw e;
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }
}