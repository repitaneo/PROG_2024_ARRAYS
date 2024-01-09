package vectores;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {


		char frase[] = new char[10];
		
	
		for(int i=0;i<frase.length;i++) {
			// System.out.println("pos "+i+" = "+frase[i]);
			System.out.print(frase[i]);
		}
		
		System.out.println("");
		
		for(int i=9;i>=0;i--) {
			System.out.print(frase[i]);
		}
		
		System.out.println("");
		
		// java mas avanzado
		for(char letra:frase) {
			
			System.out.println("bucle avanzado - "+letra);
		}
		
		
	}

}
