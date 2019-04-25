package bangunruang;

import java.util.Scanner;

public class Balok extends BangunRuang{
	public void Balok(){
		  Scanner scan = new Scanner(System.in);
		  int panjang =0;
		  int lebar=0;
		  int tinggi=0;
	        System.out.println("Volume dan Luas Balok");
	        System.out.print("panjang : ");
	        panjang = scan.nextInt();
	        System.out.print("lebar  : ");
	        lebar = scan.nextInt();
	        System.out.print("tinngi  : ");
	        tinggi = scan.nextInt();
	        System.out.print("Luas permukaan    : "+ (2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi))) + "\n");
	        System.out.println("Volume          : " + (panjang*lebar*tinggi));  
	}
}
