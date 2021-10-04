package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void main(String[] args) {
		
		int[][] tabel = { {1, 3, 4},{7, 9, 10} , { 7, 1, 3} };
		int[][] tabel1 = { {1, 3, 4},{7, 9, 10} , { 7, 1, 3} };


		 skrivUt(tabel);
		 
		 System.out.println();
		 
		 tilStreng(tabel);
		 System.out.println();
		 
		 skaler(2,tabel);
		System.out.println(erLik(tabel, tabel1));
	}
	
	// a)
	public static void skrivUt(int[][] matrise) {
		
		
		for(int i = 0; i <matrise.length; i++) {
			System.out.println();
			for(int j=0; j < matrise.length; j++) {
			System.out.print(matrise[i][j] + " ");
		}
		}
	}


	// b)
	public static String tilStreng(int[][] matrise) {

String tekst ="";
		
		for(int[] i : matrise) {
			for(int j : i) {
				
			tekst =tekst +  j + " ";
			
			}
				
			tekst += "\n";
			
		}
		
		return tekst;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
	int[][] nytabell = new int[matrise.length][matrise.length];
	
		
		for(int i = 0; i< 3; i++) {
			System.out.println();
			for(int j=0; j< 3; j++) {
				nytabell[i][j]= matrise[i][j]*tall;
			System.out.print(nytabell[i][j] + " ");
			
		}
		}
		
		return nytabell;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;
		for (int  i = 0; i<a.length;i++) {
			int[] rad = a[i];
			for(int j =0; j<rad.length;j++) {
				if (a[i][j] != b[i][j]) {
					lik = false;
				}
			}
		}
		return lik;
		
	}
	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
