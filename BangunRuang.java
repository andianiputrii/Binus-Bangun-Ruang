package bangunruang;

import java.util.Scanner;

public class BangunRuang {
	public static void main (String[]args){
		int pilihan;
		
        Lingkaran L = new Lingkaran();
        Segitiga S = new Segitiga();
        Persegi B = new Persegi();
        Persegipanjang P = new Persegipanjang();
        Kubus K = new Kubus ();
        Balok BK = new Balok ();
        Bola BL = new Bola ();
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("MENU");      
        System.out.println("====");      
        System.out.println("1. Lingkaran");
        System.out.println("2. Segitiga");      
        System.out.println("3. persegi");      
        System.out.println("4. Persegi Panjang");  
        System.out.println("5. Kubus");
        System.out.println("6. Balok");
        System.out.println("7. Bola");
        System.out.println("8. Exit");
        
        System.out.print("Pilihan : ");
        pilihan = scan.nextInt();
        
        switch(pilihan){
            case 1 : L.Lingkaran();break;
            case 2 : S.Segitiga();break;
            case 3 : B.Persegi();break;
            case 4 : P.Persegipanjang();break;
            case 5 : K.Kubus();break;
            case 6 : BK.Balok();break;
            case 7 : BL.Bola ();break;
            case 8 : System.exit(0);
        }
	}
}
