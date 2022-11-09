package Retos;

import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double g1, g2; 
        System.out.println("Ingrese la cantidad de grados fahrenheit ");
        g1=  s.nextDouble();
        g2 = (g1- 32)/1.8;
        System.out.println( g1 + "en grados centrigrados es:  " + g2);
        s.close();
    }
}
