package herencia;

import javax.swing.JOptionPane;

public class MainCil {
    public static void main(String[] args) {
        Cilindro cil = new Cilindro();
        
        cil.setX(10);
        cil.setY(12);
        cil.setRadio(12.33f);
        cil.setAltura(12.56f);
        
        JOptionPane.showMessageDialog(null,"El volumen es: "+cil.getVolumen());
        
        //System.out.println("Volumen: "+cil.getVolumen());
    }
}
