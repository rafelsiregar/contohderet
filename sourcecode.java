package tryjava;

import java.util.Scanner;

public class sequence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan jumlah angka : ");
		int n = sc.nextInt();
		float[] angka = new float[n];
		float[] selisih = new float[n-1];
		float[] rasio = new float[n-1];
		System.out.println("Masukkan suku deret : ");
		for(int i=0;i<n;i++) {
			angka[i] = sc.nextFloat();
		}
		int j = n-1;
		for(int i=0;i<n-1;i++) {
				selisih[i] = angka[j]-angka[j-1];
				rasio[i] = angka[j]/angka[j-1];
				j--;
		}
		
		boolean aritmetika = true;
		boolean geometri = true;

		for(int i=0;i<n-2;i++) {
			if(selisih[i]!=selisih[i+1]) aritmetika = false;
			if(rasio[i]!=rasio[i+1])geometri=false;
		}
		if(aritmetika) {
			System.out.print("Deret Aritmetika");
		}
		else if(geometri) {
			System.out.print("Deret Geometri");
		}
		sc.close();
	}
	
}
