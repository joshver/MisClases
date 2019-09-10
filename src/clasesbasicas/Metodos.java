/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesbasicas;

import java.util.Scanner;

/**
 *
 * @author Juande
 */
public class Metodos {
    
    // Método estatico
    private static void mensaje(){
        System.out.println("Soy un metodo estatico ...");
    }
    
    // Método para analizar Switch
    private void pruebaSwitch(int num1) {
        switch (num1){
            case 1: System.out.println("Tecleaste 1");
                break;
            case 2: System.out.println("Tecleaste 1");
                break;
            case 3: System.out.println("Tecleaste 1");
                break;
            default: System.out.println("Tecleaste otra cosa");
                break;
        }
    }
    
    // Método para comparar dos numeros
    private void comparar(int num1, int num2){
        if (num1 > num2) {
            System.out.println("El mayor es: "+num1);
        } else if(num1 < num2){
            System.out.println("El mayor es: "+num2);
        } else {
            System.out.println("Los números son iguales");
        }
    }
    
    public int sumar(int num1, int num2){
        return num1+num2;
    }
    
    public int restar(int num1, int num2){
        return num1-num2;
    }
    
    public int multiplicar(int num1, int num2){
        return num1*num2;
    }
    
    public float dividir(int num1, int num2){
        return (float) num1/num2;
    }
    
    private void ciclo(int num1, int num2){
        if (num1<num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println("i = "+i);
            }
        } else {
            for (int i = num1; i >= num2; i--) {
                System.out.println("i = "+i);
            }
        }
    }
    
    public static void main(String[] args){
        
        int n1, n2;
        String band="S";
        Scanner key = new Scanner(System.in);
        
        while (band.equalsIgnoreCase("S")){
            System.out.print("Introduce el primer número: ");
            n1 = key.nextInt();
            System.out.print("Introduce el segundo número: ");
            n2 = key.nextInt();

            System.out.println("");

            Metodos m1;
            m1 = new Metodos();

            Metodos m2 = new Metodos();
            Metodos m3 = new Metodos();

            System.out.println("La suma es: "+m1.sumar(n1, n2));
            System.out.println("La resta es: "+m1.restar(n1, n2));
            System.out.println("La multiplicación es: "+m1.multiplicar(n1, n2));
            System.out.println("La división es: "+m1.dividir(n1, n2));

            /* Usando varios objetos
            System.out.println("La resta es: "+m2.restar(n1, n2));
            System.out.println("La multiplicación es: "+m3.multiplicar(n1, n2));*/

            System.out.println("");

            /* Invocar metodo estatico
            mensaje();*/

            // Comparar
            m1.comparar(n1, n2);

            System.out.println("");

            // Ciclo
            m1.ciclo(n1, n2);
            
            System.out.println("");
            
            // Switch
            m1.pruebaSwitch(n1);
            
            System.out.println("¿Desea hacer otro calculo (S/n)");
            band=key.next();
        }
    }
}
