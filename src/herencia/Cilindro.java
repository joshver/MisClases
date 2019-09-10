package herencia;

public class Cilindro extends Circunferencia {
    protected float altura;

    public Cilindro() {
    }

    public Cilindro(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" + "altura=" + altura + '}' + super.toString();
    }
    
    public float getVolumen(){
        return this.getArea()*this.getAltura();
    }
}
