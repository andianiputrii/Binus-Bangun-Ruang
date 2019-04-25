package bangunruang;

import java.util.Scanner;

public class Kubus extends BangunRuang {
	public void Kubus(){
		 Scanner scan = new Scanner(System.in);
		 int sisi=0;
	        System.out.println("Volume dan Luas Kubus");
	        System.out.print("panjang rusuk     : ");
	        sisi = scan.nextInt();
	        System.out.print("Luas permukaan    : "+ (6*(sisi*sisi)) + "\n");
	        System.out.println("Volume          : " + (sisi*sisi*sisi));
	}
}
