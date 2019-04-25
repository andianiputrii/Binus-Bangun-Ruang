package bangunruang;

import java.util.Scanner;

public class Persegi extends BangunRuang {
	 public void Persegi(){
	        double sisi;
	        double luas;
	        double keliling;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Persegi");
	        System.out.println("Masukkan sisi : ");
	        sisi = scan.nextDouble();      
	        luas = sisi*sisi;
	        keliling = 4*sisi;
	        System.out.println("Luas persegi adalah : "+luas);
	        System.out.println("Keliling persegis adalah : "+keliling);
	    }   
}
