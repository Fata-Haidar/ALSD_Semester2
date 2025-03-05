import java.util.Scanner;

public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen09[] arrayOfDosen = new Dosen09[3];
        String kode, nama, dummy;
        int usia;
        Boolean jenisKelamin;

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode    : ");
            kode = sc.nextLine();
            System.out.print("Nama    : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            dummy = sc.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("Wanita");
            System.out.print("Usia     : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-------------------------------------");

            arrayOfDosen[i] = new Dosen09(kode, nama, jenisKelamin, usia );
        }
        
       

        for (Dosen09 dosen09 : arrayOfDosen) {
            for (int i = 0; i < arrayOfDosen.length; i++) {
                System.out.println("Data Dosen ke-" + (i + 1));
                System.out.println(dosen09);
            }
             // Otomatis memanggil toString()
        }
    }
}
