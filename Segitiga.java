package bangunruang;

import java.util.Scanner;

public class Segitiga {
	public void Segitiga(){
        double luas;
        double alas;
        double tinggi;
        double sisi;
        double keliling;
        Scanner scan = new Scanner (System.in);
        System.out.println("SEGITIGA");
        System.out.println("========");
        System.out.println("Masukkan alas : ");
        alas = scan.nextDouble();
        System.out.println("Masukkan tinggi :");
        tinggi = scan.nextDouble();
        System.out.println("Masukkan sisi : ");
        sisi = scan.nextDouble();
        luas = (alas*tinggi)/2;
        keliling = (sisi*2)+alas;
        System.out.println("Luas Segitiga adalah : "+luas);
        System.out.println("Keliling Segitiga adalah : "+keliling);
    }
}
