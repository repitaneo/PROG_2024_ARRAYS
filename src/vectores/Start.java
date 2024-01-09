package vectores;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {


		char frase[] = new char[10];
		
		frase[0] = 'H';
		frase[1] = 'o';
		frase[2] = 'l';
		frase[3] = 'a';
		frase[4] = ' ';
		frase[5] = 'h';
		frase[6] = 'o';
		frase[7] = 'l';
		frase[8] = 'a';
		frase[9] = '!';
		
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
