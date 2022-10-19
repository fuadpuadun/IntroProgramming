package tp1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class exercise {
	public static void main(String[] args) {
		boolean next = true;
		int min = 1, max = 100, randomNum;
		
		Scanner input = new Scanner(System.in);
		
		label:
		while (next) {
			randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			System.out.print (randomNum);
			
			System.out.print ("\nNext ? (Y/N) ");
			String check = input.nextLine();
			
			if (check.equalsIgnoreCase ("N"))
				next = false;
			else if (check.equalsIgnoreCase ("Y"))
				next = true;
			else {
				System.out.print ("Input yang diberikan salah !\n");
				continue label;
			}
		}
		System.out.print ("Thank you for using this program");
	}
}
