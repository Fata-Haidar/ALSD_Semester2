public class DataDosen09 {

   public static  void  dataSemuaDosen(Dosen09[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode            : " + arrayOfDosen[i].kode);
            System.out.println("Nama            : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin   : " + (arrayOfDosen[i].jenisKelamin ? "Wanita" : "Pria"));
            System.out.println("Usia            : " + arrayOfDosen[i].usia);
            System.out.println("-----------------------------");
        }
        
    }
}