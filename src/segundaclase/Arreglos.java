package segundaclase;

/**
 *
 * @author Juande
 */
public class Arreglos {

    public Arreglos() {
    }
        
    private int[] llenarVector(int[] vec){
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) Math.round(Math.random()*100);
        }
        return vec;
    }
    
    private void imprimirVector(int[] vec){
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Elemento "+i+": "+vec[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] vec = new int[100];
        
        Arreglos ar = new Arreglos();
        
        ar.llenarVector(vec);
        ar.imprimirVector(vec);
    }
}
