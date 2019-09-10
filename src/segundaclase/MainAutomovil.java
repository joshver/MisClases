package segundaclase;

import java.util.ArrayList;

/**
 *
 * @author Juande
 */
public class MainAutomovil {
    public static void main(String[] args) {
        ArrayList<Automovil> auto = new ArrayList<>();
        
        Automovil a1 = new Automovil("Nissan", 2006, 65000.00f);
        Automovil a2 = new Automovil("Toyota", 2005, 30000.00f);
        Automovil a3 = new Automovil("Ford", 2018, 150000.23f);
        
        auto.add(a1);
        auto.add(a2);
        auto.add(a3);
        
        //auto.forEach((i)->{System.out.println(i);});
        
        for (Automovil i : auto) {
            System.out.print("Marca: "+i.getMarca());
            System.out.print(". Modelo: "+i.getModelo());
            System.out.print(". Precio: "+i.getPrecio());
            System.out.println("");
        }
    }
}
