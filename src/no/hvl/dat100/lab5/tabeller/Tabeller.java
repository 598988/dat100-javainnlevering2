package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
public static void main(String[] args) {
		
		int[]tabel = {1, 3, 4, 7, 9, 10};
		
		int[] tabel1 = {42,67,88};

		 skrivUt(tabel);
		 System.out.println();
		 tilStreng(tabel1);
		 System.out.println();
		 
		 reverser(tabel);
		 
		 System.out.println();
		 
		 System.out.println(summer(tabel) + " ");
		 
		 System.out.println(finnesTall(tabel,10));
		 
			int[] sortert = {1, 3, 4, 7, 9, 10};
			int[] usortert = {9,5,2,8,10,1};

			System.out.println(erSortert(sortert));
			System.out.println(erSortert(usortert));
			
			settSammen(sortert,usortert);
			System.out.println();
			
			System.out.println(posisjonTall(tabel,8));
		
	}

	// a)
	public static void skrivUt(int[] tabell) {
			
			for (int i=0; i< tabell.length; i++) {
				
				System.out.print(tabell[i] + " ");
			
			}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
	String tekst = "[";
	
	for(int i =0; i<tabell.length;i++) {
		if(i ==	tabell.length-1) {
			tekst= tekst+(tabell[i]);
		}else {
			tekst = tekst+(tabell[i] + ",");
		}
	}
		tekst = tekst + "]";
		return tekst;
		
	}

	// c)
	public static int summer(int[] tabell) {

	int sum =0;
		
		for (int i=0; i< tabell.length; i++) {
			
			sum = sum + tabell[i];
			
		}
		
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;
		
		while (i < tabell.length && (!funnet)) {
			
			if (tabell[i] == tall) {
				funnet = true;
			}
			
			i++;
		}
		
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
	int i = 0;
		
		while(i < tabell.length) {
			if (tabell[i] == tall) {
				return i;
			}
			
			i++;
			
		}
	
		return -1;
	
	}

	// f)
	public static int[] reverser(int[] tabell) {
	
		int[] nytab = new int[tabell.length];
		int j=0;
	for (int i=tabell.length-1; i>=0; i--) {
			nytab[j]= tabell[i];
			j++;
		}
	
		return nytab;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		
		int i = 0; 
		boolean sortert= true;
		while (sortert && i < tabell.length-1) {
			if(tabell[i] > tabell[i+1]) {
				sortert = false;
			}
			
			i++;
		}
		

		
		return sortert;
			
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammen= new int[tabell1.length+tabell2.length];
		int k=0;
		
		for(int i = 0; i<tabell1.length;i++) {
			sammen[i]=tabell1[i];
			k++;
		}
		
		for(int j=0; j<tabell2.length;j++) {
			sammen[k++]=tabell2[j];
		}
		
		for(int i=0; i<sammen.length; i++) {
			System.out.print(sammen[i] + " ");
		}
		
		int[] tab= sammen;
		
		return tab;
	}
}
