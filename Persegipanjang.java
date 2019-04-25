package bangunruang;

import java.util.Scanner;

public class Persegipanjang extends BangunRuang {
	public void Persegipanjang(){
        double panjang;
        double lebar;
        double luas;
        double keliling;
        Scanner scan = new Scanner (System.in);
        System.out.println("Persegi panjang");
        System.out.println("Masukkan Panjang : ");
        panjang = scan.nextDouble();      
        System.out.println("Masukkan Lebar : ");
        lebar = scan.nextDouble();      
        luas = panjang*lebar;
        keliling = (2*panjang)+(2*lebar);
        System.out.println("Luas Persegi Panjang adalah : "+luas);
        System.out.println("Keliling Persegi Panjang adalah : "+keliling);
    }
}
