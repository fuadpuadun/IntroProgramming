package tp1;

import java.math.BigDecimal;
import java.util.Scanner;

public class no3 {
	public static void main(String []args) {
        String name, itemName;
        int stock;
        float buyPrice, salePrice;
        BigDecimal salePriceResult, buyPriceResult;
        
        Scanner input = new java.util.Scanner(System.in);
        System.out.print("Masukan nama anda : ");
        name = input.nextLine();
        
        System.out.print("Stok Gudang   Input Barang\n");
        System.out.print("#########################\n");
        System.out.print("Selamat Datang " + name + " \n");
        
        //Item Name
        System.out.print("Masukan nama barang yang mau ditambah : ");
        itemName = input.nextLine();
        
        //Item Stock
        System.out.print("Masukan jumlah barang yang mau ditambah : ");
        stock = input.nextInt();
        
        //Buy price
        System.out.print("Masukan harga beli untuk barang tersebut : ");
        buyPrice = input.nextFloat();
        
        //Item Stock
        System.out.print("Masukan harga beli untuk barang tersebut : ");
        salePrice = input.nextFloat();
        
        //Convert to 2 digit decimal
        buyPriceResult = round(buyPrice,2);
        salePriceResult = round(salePrice,2);
        
        //Display All
        System.out.print("Stok Gudang   Input Barang\n");
        System.out.print("#########################\n");
        //df.format(buyPrice)
        System.out.print("Nama Barang       : " + itemName + " \n");
        System.out.print("Jumlah Barang     : " + stock + " \n");
        System.out.print("Harga Beli        : " + buyPriceResult + " \n");
        System.out.print("Nama Barang       : " + salePriceResult + " \n");
    }
    
    public static BigDecimal round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd;
    }
}
