/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesbasicas;

/**
 *
 * @author Juande
 */
public class Nomina {

    // Atributos de la clase
    private int clave;
    private String nombre;
    private float sueldo;
    
    // Constructor vacio
    public Nomina(){;}
    
    // Constructor sobrecargado
    public Nomina(int clave) {
        this.clave = clave;
    }

    public Nomina(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    public Nomina(int clave, String nombre, float sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
}
