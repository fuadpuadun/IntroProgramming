package tp1;

import java.io.IOException;
import java.util.Scanner;

public class no4 {
public static void main(String []args) throws IOException {
		
		String name, soName;
		int age, soAge;
		double rng;
		
		Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Selamat Datang Di Program Ramalan Cupu\n");
		System.out.print("+++++++++++++++++++++++++++++++++++++++\n");
		
		//Input data pribadi
		System.out.print("Data Anda :\n");
		System.out.print("♥♥♥♥♥♥♥♥♥♥♥♥\n");
		System.out.print("Masukan Nama Anda	: ");
        name = input.nextLine();
        System.out.print("Masukan Umur Anda	: ");
        age = input.nextInt();
        input.nextLine();
        
        //Input data pasangan
        System.out.print("Data Pasangan Anda :\n");
		System.out.print("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥\n");
		System.out.print("Masukan Nama Pasangan Anda : ");
        soName = input.nextLine();
        System.out.print("Masukan Umur Pasangan Anda : ");
        soAge = input.nextInt();
        rng = randBetween(50.0, 100.0);
        rng = rng /1.1;
        
        //End print
        System.out.print(name + " [" + age + "] tahun\n");
        System.out.print("  ♥♥♥    ♥♥♥\n");
        System.out.print(" ♥♥♥♥♥  ♥♥♥♥♥\n");
        System.out.print("♥♥♥♥♥♥♥♥♥♥♥♥♥♥\n");
        System.out.print(" ♥♥♥♥♥♥♥♥♥♥♥♥\n");
        System.out.print("   ♥♥♥♥♥♥♥♥\n");
        System.out.print("     ♥♥♥♥\n");
        System.out.print("      ♥♥\n");
        System.out.print(soName + " [" + soAge + "] tahun\n");
        
        System.out.print("Tekan ENTER untuk melihat hasil ramalan\n");
        System.in.read();
        
        System.out.print("Kecocokan anda dengan pasangan anda adalah :" + rng + "\n");
        System.out.print("Terima Kasih karena anda telah menggunakan jasa Ramalan kami.. ^^v\n");        
	}
	
	public static double randBetween(double min, double max) {
		return (double) (Math.random() * (max - min) + min);
	}
}
