import java.util.Scanner;
public class Tugas3_JS1_09 {
    static String[] namaMatkul;
    static  int[] sks;
    static  int[] semester;
    static String[] hariKuliah;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputData(sc);
        while (true) {
            System.out.println("\n========== Menu Jadwal Kuliah ==========");
            System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Kuliah Berdasarkan Hari Tertentu");
            System.out.println("3. Tampilkan Jadwal Kuliah Berdasarkan Semester Tertentu");
            System.out.println("4. Cari Mata Kuliah Berdasarkan Nama Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu (1-5): ");
            int pilihMenu = sc.nextInt();
            sc.nextLine();
            switch (pilihMenu) {
                case 1:
                    tampilkanSeluruhJadwal();
                    break;
                case 2:
                    tampilkanHari(sc);
                    break;
                case 3:
                    tampilkanSemester(sc);
                    break;
                case 4:
                    cariMataKuliah(sc);
                    break;
                case 5:
                System.out.println("Terima kasih! ");
                return; 
    
                default:
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                    break;
            }
        }
    }
    public static void inputData(Scanner sc) {
        System.out.print("Masukkan Jumlah Data Mata Kuliah : ");
        n = sc.nextInt();
        sc.nextLine();
        namaMatkul= new String[n];
        sks = new int[n];
        semester = new int[n];
        hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("======================================================");
            System.out.println("\nMasukkan Data Mata Kuliah ke - " + (i+1) + ": ");
            System.out.print("Nama Mata Kuilah: ");
            namaMatkul[i]=sc.nextLine();
            System.out.print("Jumlah SKS : ");
            sks[i]=sc.nextInt();
            System.out.print("Semester ke : ");
            semester[i]=sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah : ");
            hariKuliah[i]=sc.nextLine();
        }
    
    }
    public static void tampilkanSeluruhJadwal() {
        System.out.println("\n================ Seluruh Jadwal Kuliah ================");
        System.out.printf("%-20s %-10s %-10s %-10s%n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        for (int i = 0; i < n ; i++) {
            System.out.printf("\n%-20s %-10s %-10s %-10s%n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
        }
    }
    public static void tampilkanHari(Scanner sc) {
        System.out.print("\nMasukkan Hari Dari Jadwal Kuliah yang Ingin Ditampilkan : ");
        String hari=sc.nextLine();
        boolean set=false;
        for (int i = 0; i < n; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println("\n================ Seluruh Jadwal Kuliah Hari "+hari.substring(0,1).toUpperCase()+hari.substring(1).toLowerCase()+" ================");
                System.out.printf("%-20s %-10s %-10s %-10s%n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
                set=true;
                break;
            }
        }
        for (int i = 0; i < n ; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.printf("\n%-20s %-10s %-10s %-10s%n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
            } 
        }
        if (!set) {
            System.out.println("\nTidak Ada Jadwal Kuliah di Hari " + hari);
        }
    }
    public static void tampilkanSemester(Scanner sc) {
        System.out.print("\nMasukkan Semester Dari Jadwal Kuliah yang Ingin Ditampilkan : ");
        int sms=sc.nextInt();
        sc.nextLine();
        boolean set=false;
        for (int i = 0; i < n; i++) {
            if (semester[i]== sms) {
                System.out.println("\n================ Seluruh Jadwal Kuliah Semsester "+sms+" ================");
                System.out.printf("%-20s %-10s %-10s %-10s%n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
                set=true;
                break;
            }
        }
        for (int i = 0; i < n ; i++) {
            if (semester[i]== sms) {
                System.out.printf("\n%-20s %-10s %-10s %-10s%n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
            } 
        }
        if (!set) {
            System.out.println("\nTidak Ada Jadwal Kuliah di Semester " + sms);
        }    
    }
    public static void cariMataKuliah(Scanner sc) {
        System.out.print("\nMasukkan Nama Mata Kuliah Yang Ingin Dicari: ");
        String cariMatkul = sc.nextLine();
        boolean set = false;
        for (int i = 0; i < n; i++) {
            if (namaMatkul[i].equalsIgnoreCase(cariMatkul)) {
                System.out.println("\n================  Informasi Mata Kuliah "+cariMatkul.substring(0,1).toUpperCase()+cariMatkul.substring(1).toLowerCase()+" ================");
                System.out.println("Nama: " + namaMatkul[i]);
                System.out.println("SKS: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari Kuliah: " + hariKuliah[i]);
                set = true;
                break;
            }
        }
        if (!set) {
            System.out.println("Mata kuliah "+cariMatkul +" tidak ditemukan!");
        }
    }
}