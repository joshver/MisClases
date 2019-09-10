package herencia;

public class Circunferencia extends Punto {
    protected float radio;

    public Circunferencia() {
    }
    
    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public float getArea(){
        return (float) (Math.PI * Math.pow(this.radio, 2));
    }

    @Override
    public String toString() {
        //return "Circunferencia{" + "radio=" + radio + '}';
        return "Circunferencia " + super.toString()+""+" radio"+radio;
    }
}
