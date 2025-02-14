import java.util.Scanner;

public class JadwalKuliah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah mata kuliah
        int n;
        do {
            System.out.print("Masukkan jumlah mata kuliah (harus lebih dari 0): ");
            n = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer
            if (n <= 0) {
                System.out.println("Jumlah mata kuliah harus lebih dari 0. Silakan coba lagi.");
            }
        } while (n <= 0);

        // Deklarasi array untuk menyimpan data
        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        // Input data mata kuliah
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        // Menu utama
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    // Menampilkan seluruh jadwal kuliah
                    System.out.println("\nSeluruh Jadwal Kuliah:");
                    for (int i = 0; i < n; i++) {
                        System.out.println((i + 1) + ". " + namaMataKuliah[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - Hari: " + hariKuliah[i]);
                    }
                    break;

                case 2:
                    // Menampilkan jadwal kuliah berdasarkan hari
                    System.out.print("\nMasukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = sc.nextLine();
                    System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
                    boolean foundHari = false;
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(hari)) {
                            System.out.println((i + 1) + ". " + namaMataKuliah[i] + " - " + sks[i] + " SKS - Semester " + semester[i]);
                            foundHari = true;
                        }
                    }
                    if (!foundHari) {
                        System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
                    }
                    break;

                case 3:
                    // Menampilkan jadwal kuliah berdasarkan semester
                    System.out.print("\nMasukkan semester yang ingin ditampilkan: ");
                    int sem = sc.nextInt();
                    System.out.println("\nJadwal Kuliah pada semester " + sem + ":");
                    boolean foundSemester = false;
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == sem) {
                            System.out.println((i + 1) + ". " + namaMataKuliah[i] + " - " + sks[i] + " SKS - Hari: " + hariKuliah[i]);
                            foundSemester = true;
                        }
                    }
                    if (!foundSemester) {
                        System.out.println("Tidak ada jadwal kuliah pada semester " + sem);
                    }
                    break;

                case 4:
                    // Mencari mata kuliah berdasarkan nama
                    System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
                    String nama = sc.nextLine();
                    boolean foundNama = false;
                    for (int i = 0; i < n; i++) {
                        if (namaMataKuliah[i].equalsIgnoreCase(nama)) {
                            System.out.println("\nInformasi Mata Kuliah:");
                            System.out.println("Nama: " + namaMataKuliah[i]);
                            System.out.println("SKS: " + sks[i]);
                            System.out.println("Semester: " + semester[i]);
                            System.out.println("Hari Kuliah: " + hariKuliah[i]);
                            foundNama = true;
                            break;
                        }
                    }
                    if (!foundNama) {
                        System.out.println("Mata kuliah dengan nama \"" + nama + "\" tidak ditemukan.");
                    }
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}