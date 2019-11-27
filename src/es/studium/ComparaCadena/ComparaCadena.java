package es.studium.ComparaCadena;

import java.util.Scanner;

public class ComparaCadena {

	
		public static void main(String[] args){

			Scanner teclado = new Scanner(System.in);

			String cadena1,cadena2;
			int long1,long2;
			System.out.println("Escribe la primera cadena");

			cadena1 = teclado.next();
			System.out.println("Escribe la segunda cadena:");

			cadena2 = teclado.next();
			
			long1 = cadena1.length();
			long2 = cadena2.length();
	
		if  (long1>long2)
		{ System.out.println("La primera cadena es mas larga que la segunda.");
		}
		
	
	    if  (long1<long2)
		{ System.out.println("La segunda cadena es mas larga que la primera.");
		}
		if (long1==long2)
			 {System.out.println("Son igual de largas");

}teclado.close();
		}
}