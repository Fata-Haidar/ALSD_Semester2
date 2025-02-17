import java.util.Scanner;

public class Tugas2_JS1_09 {
    
 
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    
   
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }
    
  
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
    
   
    public static void tampilkanMenu() {
        System.out.println("\n=====Pilih Perhitungan yang Ingin Dilakukan=====");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan (1-4): ");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        boolean s = true;
        double sisi=0;
        while (s) {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                System.out.print("Masukkan panjang sisi kubus: ");
             sisi = scanner.nextDouble();
                    System.out.println("Volume Kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                System.out.print("Masukkan panjang sisi kubus: ");
             sisi = scanner.nextDouble();
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                System.out.print("Masukkan panjang sisi kubus: ");
             sisi = scanner.nextDouble();
                    System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                    break;
                case 4:
                System.out.println("Terima kasih telah menggunakan program ini!");
                s=false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");

            }
        }
        
    }
}
