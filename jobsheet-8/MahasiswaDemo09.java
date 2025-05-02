// MahasiswaDemo09.java
import java.util.Scanner;

public class MahasiswaDemo09 {
    public static void main(String[] args) {
        StackTugasMahasiswa09 stack = new StackTugasMahasiswa09(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Pertama terkumpul");
            System.out.println("6. Lihat Jumlah Tugas yang Sudah Dikirim");
            System.out.print("Pilih: ");
            
            
            while (!scan.hasNextInt()) {
                System.out.println("Masukkan angka antara 1-4.");
                scan.next();
                System.out.print("Pilih: ");
            }
            pilih = scan.nextInt();
            scan.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa09 mhs = new Mahasiswa09(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa09 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai;
                        while (true) {
                            if (scan.hasNextInt()) {
                                nilai = scan.nextInt();
                                scan.nextLine();
                                if (nilai >= 0 && nilai <= 100) break;
                            } else {
                                scan.next(); 
                            }
                            System.out.print("Masukkan nilai yang valid (0-100): ");
                        }
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;

                case 3:
                    Mahasiswa09 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                Mahasiswa09 lihat2 = stack.bottom();
                    if (lihat2 != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihat2.nama);
                    }
                    break;
                case 6:
                System.out.println("Total Tugas yang dikumpulkan = "+ stack.jmltgs());
                    break;
                

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

        } while (pilih >= 1 && pilih <= 6);

        scan.close();
    }
}
