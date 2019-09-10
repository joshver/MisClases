package herencia;

public class MainCircunferencia {
    public static void main(String[] args) {
        Circunferencia cr = new Circunferencia();
        
        cr.setX(10);
        cr.setY(12);
        cr.setRadio(12.33f);
        
        System.out.println("Área: "+cr.getArea());
    }
}
