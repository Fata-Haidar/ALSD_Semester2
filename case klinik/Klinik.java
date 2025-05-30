import java.util.*;

public class Klinik {
    static LinkedList antrian = new LinkedList();
    static TransaksiList riwayatTransaksi = new TransaksiList();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 :
                 tambahPasien();
                 break;
                case 2 : 
                antrian.tampilkanAntrian();
                break;
                case 3 : 
                layaniPasien();
                break;
                case 4 : 
                System.out.println(">> Sisa antrian: " + antrian.getSize());
                break;
                case 5 : 
                lihatRiwayatTransaksi();
                break;
                case 0 :System.out.println("Keluar dari sistem.");
                break;
                default : System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 0);
    }

    static void tambahPasien() {
        System.out.print("Nama Pasien: ");
        String nama = scanner.nextLine();
        System.out.print("NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Keluhan: ");
        String keluhan = scanner.nextLine();

        Pasien pasien = new Pasien(nama, nik, keluhan);
        antrian.enqueue(pasien);
        System.out.println(">> Pasien ditambahkan ke antrian.");
    }

    static void layaniPasien() {
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        Pasien pasien = antrian.dequeue();
        System.out.println("Melayani pasien: " + pasien.nama);

        System.out.print("ID Dokter: ");
        String idDokter = scanner.nextLine();
        System.out.print("Nama Dokter: ");
        String namaDokter = scanner.nextLine();
        System.out.print("Durasi Layanan (jam): ");
        int durasi = scanner.nextInt();
        scanner.nextLine();

        Dokter dokter = new Dokter(idDokter, namaDokter);
        TransaksiLayanan transaksi = new TransaksiLayanan(pasien, dokter, durasi);
        riwayatTransaksi.add(transaksi);

        System.out.println(">> Pasien dilayani, transaksi berhasil dicatat");
    }

    static void lihatRiwayatTransaksi() {
        for (int i = 0; i < riwayatTransaksi.getSize(); i++) {
    TransaksiLayanan t = riwayatTransaksi.get(i);
    System.out.println(t.pasien.nama + " (" + t.durasiLayanan + " jam): Rp " + t.biaya);
}
    }
}
