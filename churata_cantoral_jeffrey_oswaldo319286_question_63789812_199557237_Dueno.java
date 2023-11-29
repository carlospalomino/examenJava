/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc3;

public class Dueno {
private String nombre;
private String direccion;
private String telefono;
private mascota[] mascotas = new mascota[5];
private int numMascotas = 0;

public Dueno(String nombre, String direccion, String telefono) {
this.nombre = nombre;
this.direccion = direccion;
this.telefono = telefono;
}

@Override
public String toString() {
return "Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono;
}

public void nombreMascotas() {
for (int i = 0; i < numMascotas; i++) {
System.out.println(mascotas[i].getNombre());
}
}

public void agregarMascota(mascota mascota) {
if (numMascotas < 5) {
mascotas[numMascotas] = mascota;
numMascotas++;
} else {
System.out.println("Error: El dueño ya tiene 5 mascotas.");
}
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
