package Retos;
import java.util.*;;
public class reto9 {
    public static void main(String[] args) 
    {
          Scanner s = new Scanner(System.in);
          String[][] nombre = new String[4][4];
          double[][] precio = new double[4][4];
          for(int i = 0; i< nombre.length; i++) {
        	  for(int c = 0; c < precio.length; c++) {
        		  System.out.println("Ingresa el nommbre del producto");
        		  nombre[i][c] = s.next();
        		  System.out.println("Ingresa el precio del producto");
        		  precio[i][c] = s.nextDouble();
        	  }
        	  
          }
          for(int n = 0; n< nombre.length; n++) {
        	  for(int z= 0 ; z<precio.length; z++) {
        		  System.out.println("Posicion: "+n+""+z+" "+" Nombre: "+ nombre[n][z]+" Precio: " + precio[n][z]);
        	  }
          }


        s.close();
    }
}
