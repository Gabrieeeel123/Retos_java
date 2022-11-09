package Retos;
import java.util.*;
public class Reto4 {

public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int lanzarn = 0;
		System.out.println("Elija 0.piedra\n1.papel\n2.tijera");
		lanzarn = s.nextInt();
		Random r = new Random();
		int juegos = r.nextInt(3);
		System.out.println("El resultado de la maquina es: ");
		//intento de validacion if(lanzarn != 1 || lanzarn != 2 || lanzarn !=3){System.out.println("ingrese un dato valido");}
		if(juegos == 0) {
			System.out.println("Piedra");
		}
		else if(juegos == 1) {
			System.out.println("Papel");
		}
		else{
			System.out.println("Tijera");
		}
		if(juegos == lanzarn){
			System.out.println("Es un empate");
		}
		else if(juegos == 0 && lanzarn == 1 || juegos == 1 && lanzarn == 2 || juegos == 2 && lanzarn == 0 ) {System.out.println("Ganaste!");}
	else {System.out.println("Perdiste");}
    s.close();
	}
}
