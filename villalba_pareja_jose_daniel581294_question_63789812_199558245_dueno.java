/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc3;

/**
 *
 * @author LAB-USR-LN6377-B0803
 */
public class dueno {
    private String nombre;
    private String direccion;
    private String telefono;
    private mascota[] mascotas = new mascota[5];
    private int mascotaCount = 0;
     public dueno(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
     @Override
    public String toString() {
        return "Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void nombreMascotas() {
        for (int i = 0; i < mascotaCount; i++) {
            System.out.println(mascotas[i].toString());
        }
    }

    public void agregarMascota(mascota mascota) {
        if (mascotaCount < 5) {
            mascotas[mascotaCount] = mascota;
            mascotaCount++;
        } else {
            throw new RuntimeException("No se pueden agregar más mascotas. Límite alcanzado.");
        }
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
    public mascota[] getMascotas() {
        return mascotas;
    }
    public void setMascotas(mascota[] mascotas) {
        this.mascotas = mascotas;
    }
    public int getMascotaCount() {
        return mascotaCount;
    }
    public void setMascotaCount(int mascotaCount) {
        this.mascotaCount = mascotaCount;
    }
}
