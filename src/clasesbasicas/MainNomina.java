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
public class MainNomina {
    public static void main(String[] args) {
        Nomina n1 = new Nomina();
        n1.setClave(1);
        n1.setNombre("Juande");
        n1.setSueldo((float) 2500.00);
        
        System.out.println("La clave es: "+n1.getClave());
    }
}
