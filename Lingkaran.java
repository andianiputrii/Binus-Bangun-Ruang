package bangunruang;

import java.util.Scanner;

public class Lingkaran extends BangunRuang {
	public void Lingkaran(){      
        double luas;
        double r;
        double keliling;
        double pi = 3.14;
        Scanner scan = new Scanner (System.in);
        System.out.println("LINGKARAN");
        System.out.println("=========");
        System.out.println("Masukkan jari-jari : ");
        r = scan.nextDouble();
        luas = pi*r*r;
        keliling = 2*pi*r;
        System.out.println("Luas Lingkaran adalah : "+luas);
        System.out.println("Keliling Lingkaran adalah : "+keliling);
   }
}
