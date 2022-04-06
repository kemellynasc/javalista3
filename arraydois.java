package kekaproject;

import java.util.Scanner;

public class arraydois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float m1[][] = new float[2][2];
		float m2[][] = new float[2][2];
		float m3[][] = new float[2][2];
		float soma_matrizes = 0, sub_matrizes = 0;
		int i, j;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n1a matriz: ");
		
		for (i=0; i<2; i++) {
			for (j=0; j<2; j++) {
				System.out.println("\nElemento ["+i+", "+j+"]:");
				m1[i][j] = leia.nextInt();
			}
		}
		
		System.out.println("\n2a matriz: ");
		
		for (i=0; i<2; i++) {
			for (j=0; j<2; j++) {
				System.out.println("\nElemento ["+i+", "+j+"]:");
				m2[i][j] = leia.nextInt();
			}
		}
		
		// (1)
		for (i=0; i<2; i++) {
			for (j=0; j<2; j++) {
				soma_matrizes = m1[i][j] + m2[i][j];
				System.out.println("\n"+soma_matrizes);
			}
		}
		
		// (2)
		for (i=0; i<2; i++) {
			for (j=0; j<2; j++) {
				sub_matrizes =  m2[i][j] - m1[i][j];
				System.out.println("\n"+sub_matrizes);
			}
		}
		
		// (3) 
		
		// (4)
        System.out.println("\n1a matriz: ");
		
		for (i=0; i<2; i++) {
			for (j=0; j<2; j++) {
				System.out.println("\nElemento ["+i+", "+j+"]:"+m1[i][j]);
			}
		}
		
		System.out.println("\n2a matriz: ");
			
		for (i=0; i<2; i++) {
			for (j=0; j<2; j++) {
					System.out.println("\nElemento ["+i+", "+j+"]:"+m2[i][j]);
			}
		}
		
		System.out.println("\n3a matriz: ");
		
		for (i=0; i<2; i++) {
			for (j=0; j<2; j++) {
					System.out.println("\nElemento ["+i+", "+j+"]:"+m3[i][j]);
			}
		}

	}

}
