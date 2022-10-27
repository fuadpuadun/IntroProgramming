 package tk4;
 
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class No1 {
	public static void main(String[] args) {
		int choice=0;
		boolean check=true;
		
		Scanner input = new java.util.Scanner(System.in);
		
		//Menu Header
		System.out.print("Selamat Datang di Program Simulasi\n");
		System.out.print("Menu\n");
		System.out.print("1.	Random Data\n");
		System.out.print("2.	Simulasi Bubble Sort - Ascending\n");
		System.out.print("3.	Simulasi Selection Sort - Ascending\n");
		System.out.print("4.	Simulasi Bubble Sort - Descending\n");		
		System.out.print("5.	Simulasi Selection Sort - Descending\n");
		System.out.print("6 .	Keluar\n");
		
		System.out.print("Masukkan Pilihan Anda : ");
		choice = input.nextInt();
		
		switch(choice) {
		case 1: randomNum();break;
		case 2:bubbleSortAsc();break;
		case 3:selectionSortAsc();break;
		case 4:selectionSortAsc();break;
		case 5:selectionSortAsc();break;
		case 6:System.exit(0);break;
		//default:goto equivalent in java
		}
		
	}
	
	public static void randomNum() {
		int[] arr = new int[5];		
		int min, max;
		
		Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Batas Bawah = ");
		min = input.nextInt();
		
		System.out.print("Batas Atas = ");
		max = input.nextInt();
		
		for(int i= 0; i<= arr.length - 1;i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
		}
		
		for(int i= 0; i<= arr.length - 1;i++) {
			//still buggy dk
			//System.out.print(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSortAsc() {
		
	}
	
	public static void selectionSortAsc() {
		
	}
	
	public static void bubbleSortDesc() {
		
	}
	
	public static void selectionSortDesc() {
		
	}
}
