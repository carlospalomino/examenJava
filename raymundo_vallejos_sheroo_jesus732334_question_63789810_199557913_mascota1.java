/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

public class mascota1 {
private String nombre;
private String especie;
private String raza;
private int edad;

public mascota1(String nombre, String especie, String raza, int edad) {
this.nombre = nombre;
this.especie = especie;
this.raza = raza;
this.edad = edad;
}

@Override
public String toString() {
return "Nombre: " + nombre + ", Especie: " + especie + ", Raza: " + raza + ", Edad: " + edad;
}

public String edadMascota() {
if (edad <= 3) {
return "Es un cachorro";
} else if (edad < 8) {
return "Es adulto";
} else {
return "Es abuelo";
}
}

public void peligrosidad(String raza) {
if (raza.equalsIgnoreCase("pitbull")) {
System.out.println("Muy peligroso");
} else {
System.out.println("Sin peligro");
}
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
