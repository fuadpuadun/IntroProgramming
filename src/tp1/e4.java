package tp1;

import java.util.Scanner;

public class e4 {
	  public static void main(String[] args) {
		  boolean next = true;
		  int firstNum=1, amount, difference;
		  
		  Scanner input = new java.util.Scanner(System.in);
		  
		  label:
		  while(next) {
			  
			  System.out.print("Belajar Deret Aritmatika, Geometri, dan menghitung Faktorial\n");
			  
			  System.out.print("Masukkan banyak angka yang ingin dicetak [2..10] : ");
		      amount = input.nextInt();
		      
		      System.out.print("Masukkan beda masing - masing angka [2..9] : ");
		      difference = input.nextInt();
		      input.nextLine();
		      
		      if((amount < 2) || (amount > 10) || (difference < 2) || (difference > 9)) {
		    	  System.out.print("Angka Diluar Batas !");
		      } else {
		    	  arithmatic(firstNum,difference,amount);
			      geometric(firstNum,difference,amount);
			      factorial(amount);
		      }
		      System.out.print ("\n Anda mau ulang [y/t] : ");
		      String check = input.nextLine();
		      
		      if (check.equalsIgnoreCase ("Y"))
					next = true;
				else if (check.equalsIgnoreCase ("T"))
					next = false;
				else {
					System.out.print ("Input yang diberikan salah !\n");
					continue label;
				}
		  }
		  
	  }
	  
	  public static void arithmatic(int firstNum, int diff, int amt) {
		  int curr_term=firstNum;
		  
		  System.out.println("Deret Aritmatika :");
		  for (int i = 1; i <= amt; i++) {			  
			  System.out.print(curr_term + " ");
		      curr_term =curr_term + diff;
		      }
		  System.out.print("\n");
	  }
	  
	  public static void geometric(int firstNum, int ratio, int amt) {
		  int curr_term;
		  curr_term=firstNum;
		  
		  System.out.print("Deret Geometri :\n");
		  for (int i = 0; i < amt; i++) {
	            curr_term = firstNum * (int)Math.pow(ratio, i);
	            System.out.print(curr_term + " ");
	        }
		  System.out.print("\n");
	  }
	  
	  public static void  factorial(int num) {
		  int curr_term=num;
		  int result=1;
		  
		  System.out.println("Faktorial dari " + num + " : ");
		  for (int i = 1; i < num; i++) {
			  result = result+curr_term;
			  System.out.print(curr_term + " * ");
			  curr_term--;
	        }
		  System.out.print(curr_term + " = ");
		  System.out.print(result + "\n"); 
	  }
}
