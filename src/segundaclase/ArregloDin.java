package segundaclase;

import java.util.ArrayList;

/**
 *
 * @author Juande
 */
public class ArregloDin {
    public static void main(String[] args) {
        ArrayList<String> vec = new ArrayList<>();
        vec.add("Leonel Messi");
        vec.add("Cristiano Ronaldo");
        vec.add(2, "Chichadios");
        
        System.out.println("Posición 0: "+vec.get(0));
        System.out.println("Posición 1: "+vec.get(1));
        System.out.println("Posición 2: "+vec.get(2));
        
        // Expresiones LANDA
        vec.forEach((i)->{System.out.println(i);});
        
        for (String i : vec) {
            System.out.println("Elemento: "+i);
        }
    }
}
