import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Praktikum_Fungsi {
   
     static int[][] stockBunga = {{10, 5, 15, 7}, {6, 11, 9, 12}, {12, 2, 10, 10}, {5, 5, 7, 12}   
    };
    static int[] hargaBunga = {75000, 50000, 60000, 10000}; 
    static String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    public static void main(String[] args) {          
                    tampilkanPendapatan();
               
                    
                    tampilkanStockCabang(3);           
                 
                    kurangiStockKarenaMati(3);
                   
    }
    static void tampilkanPendapatan() {
        System.out.println("\n==== Pendapatan Setiap Cabang ====");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga.length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println(cabang[i] + " : Rp " + pendapatan);
        }
    }
    static void tampilkanStockCabang(int index) { 
        System.out.println("\n==== Stok Bunga di " + cabang[index] + " ====");
        for (int i = 0; i < stockBunga.length; i++) {
                System.out.println(jenisBunga[i] + " : " + stockBunga[index][i]);      
            
        }
    
    }
    static void kurangiStockKarenaMati(int index) {
        int[] bungaMati = {1, 2, 0, 5};
        int [] muatan = new int[4];
        System.out.println("\n========================================");  
        System.out.println("Pengurangan stock akibat bunga yang mati");
        System.out.println("========================================");
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                 muatan[j] = stockBunga[i][j] - bungaMati[j];  
            }
        }
        System.out.println("\n==== Stok Bunga di " + cabang[index] + " ====");
        for (int i = 0; i < stockBunga.length; i++) {
                System.out.println(jenisBunga[i] + " : " + stockBunga[index][i]+"-"+bungaMati[i]+" = "+muatan[i]);  
    }
    
} 
}
   

