package Retos;
import java.util.*;
public class reto7 {
    public static void main(String[] args) 
	{
		  Scanner s = new Scanner(System.in);
		  int veces;
		  double total = 0;
		  double promedio;
		  System.out.println("Ingrese la cantidad de competidores");
		  veces = s.nextInt();
		  double[] notas = new double[veces];
		  for(int i = 0 ; i< veces ; i++) {
			  System.out.println("Ingrese la nota " + i);
			  notas[i] = s.nextDouble();		  
		  }
		  for(int z= 0 ; z<veces; z++) {
			  System.out.println("Las notas ingresadas fueron: ");
			  System.out.println(notas[z]);
			  total = total + notas[z];
		  }
		  promedio = total/veces;
		  System.out.println("La nota final es: " + promedio);
		  if(promedio < 3.0) {
			  System.out.println("Reprobaste");
		  }
		  else if(promedio> 3.0 && promedio< 4.0) {
			  System.out.println("pasaste raspando");
		  }
		  else{System.out.println("Aprobaste con buenos resultados");}
		s.close();
	}
}
