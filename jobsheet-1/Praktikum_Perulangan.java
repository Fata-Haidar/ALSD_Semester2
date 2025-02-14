import java.util.Scanner;
public class Praktikum_Perulangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        Long nim = sc.nextLong();
        System.out.println("=======================");
        long angka = nim%100;
        if (angka < 10) {
            angka+=10;
            
        }
        System.out.println("n : "+angka); 
        for (int i = 1; i <= angka; i++) {
            if (i==6||i==10) {
                continue;
            }
            if (i % 2 == 1) {
               System.out.print("* "); 
            }else{
                System.out.print(i+" ");
            }
             
            
        }
    }
}