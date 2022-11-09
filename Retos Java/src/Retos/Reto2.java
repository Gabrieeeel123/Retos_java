package Retos;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        double  b1, b2, f;
        System.out.println("Peso del bebe: ");
        b1 = s.nextDouble();
        System.out.println("Edad del bebe: ");
        b2 =  s.nextDouble();

        f = (b1 + 10) / b2 * 10 * 8;
        System.out.println("Al bebe se le debe aplicar la dosis " + f);
s.close();
    }
}

