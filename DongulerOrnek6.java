import java.util.Scanner;
public class DongulerOrnek6 {

	public static void main(String[] args) {
		// Bir sayýnýn basamak sayýlarýnýn toplamýný hesaplayan program yazýnýz.

       //  Örnek : 1643 = 1 + 6 + 4 + 3 = 14
	   /*  1643 % 10 = 3 , 1643 / 10 = 164
	    *  164  % 10 = 4 , 164  / 10 = 16
	    *  16   % 10 = 6 , 16   / 10 = 1
	    *  1    % 10 = 1 , 1    / 10 = 0
	    *  0    % 10 = 0 , 0    / 10 = 0
	    * 
	    */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayi giriniz : ");
		
		int sayi = scan.nextInt();
		
		int total = 0;
		
		while((sayi % 10) != 0) {
			total = total + (sayi % 10);
			sayi = sayi / 10;
		}
		
		System.out.println(total);

	}

}
