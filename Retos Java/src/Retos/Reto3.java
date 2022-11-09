package Retos;
import java.util.*;
public class Reto3 {
    public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int lanzamientou;
		Random r = new Random();
		boolean moneda = r.nextBoolean();
			System.out.println("Ingrese 1.cara o 2.sello");
			lanzamientou = s.nextInt();
			System.out.println("Lanzando moneda... \n \n");
			if (moneda == true) {
				System.out.println("Cara");
			} else {
				System.out.println("Sello");
			}
			if(lanzamientou == 1 && moneda == true){System.out.println("Ganaste");}
			else{System.out.println("Perdiste");}
        s.close();

	}
}
