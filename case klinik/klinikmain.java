import java.util.Scanner;

public class klinikmain {

Scanner sc = new Scanner(System.in);
        AntrianPasien antrian = new AntrianPasien(10);
        LinkedListTransaksi riwayat = new LinkedListTransaksi();

        int pilihan;
        do {
            System.out.println("\n=== Sistem Antrian Klinik Dokter ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Tampilkan Daftar Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("");
                    
                    break;

                case 2:
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    if () {
                        System.out.println(".");
                    } else {
                        
                    }
                    break;

                case 4:
                    System.out.println("");
                    break;

                case 5:
                    riwayat.tampilkanRiwayat();
                    break;

                case 0:
                    System.out.println("");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }

