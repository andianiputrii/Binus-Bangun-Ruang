package bangunruang;

import java.util.Scanner;

public class Bola extends BangunRuang {
	public void Bola(){
		 Scanner scan = new Scanner(System.in);
		 	int r=0;
		 	double pi=3.14;
	        System.out.println("Volume dan Luas Bola");
	        System.out.print("jari-jari         : ");
	        r = scan.nextInt();
	        System.out.print("Luas permukaan    : "+ (4*pi*r*r) + "\n");
	        System.out.println("Volume          : " + (pi*r*r*r*4/3));  
	}
}
