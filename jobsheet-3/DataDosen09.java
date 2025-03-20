public class DataDosen09 {

    public static  void  dataSemuaDosen(Dosen09[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode            : " + arrayOfDosen[i].kode);
            System.out.println("Nama            : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin   : " + (arrayOfDosen[i].jenisKelamin ? "Wanita" : "Pria"));
            System.out.println("Usia            : " + arrayOfDosen[i].usia);
            System.out.println("-----------------------------");
        }

   
    }
    public static void jumlahDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
        int[] jumlah = Dosen09.hitungDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("\n=== Jumlah Dosen Per Jenis Kelamin ===");
        System.out.println("Jumlah Dosen Pria   : " + jumlah[0]);
        System.out.println("Jumlah Dosen Wanita : " + jumlah[1]);
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen09 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            } else {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            }
        }

        System.out.println("\n=== Rata-rata Usia Dosen Per Jenis Kelamin ===");
        System.out.println("Rata-rata usia Dosen Pria   : " + (jumlahPria > 0 ? (totalUsiaPria / jumlahPria) : 0));
        System.out.println("Rata-rata usia Dosen Wanita : " + (jumlahWanita > 0 ? (totalUsiaWanita / jumlahWanita) : 0));
    }public static void infoDosenPalingTua(Dosen09[] arrayOfDosen) {
        Dosen09 dosenTertua = arrayOfDosen[0];
        for (Dosen09 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }
        System.out.println("\n=== Dosen Paling Tua ===");
        System.out.println("Kode            : " + dosenTertua.kode);
        System.out.println("Nama            : " + dosenTertua.nama);
        System.out.println("Jenis Kelamin   : " + (dosenTertua.jenisKelamin ? "Wanita" : "Pria"));
        System.out.println("Usia            : " + dosenTertua.usia);
    }
    public static void infoDosenPalingMuda(Dosen09[] arrayOfDosen) {
        Dosen09 dosenTermuda = arrayOfDosen[0];
        for (Dosen09 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }
        System.out.println("\n=== Dosen Paling Muda ===");
        System.out.println("Kode            : " + dosenTermuda.kode);
        System.out.println("Nama            : " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin   : " + (dosenTermuda.jenisKelamin ? "Wanita" : "Pria"));
        System.out.println("Usia            : " + dosenTermuda.usia);
    }
    
}

