public class Dosen09 {
    String kode; 
    String nama; 
    Boolean jenisKelamin; 
    int usia;

    public Dosen09(String kode, String nama, Boolean jenisKelamin, int usia) { 
        this.kode=kode; 
        this.nama=nama;
        this.jenisKelamin=jenisKelamin; 
        this.usia=usia;
        } 
        public String toString() {
            return "Kode            : " + kode + "\n" +
                   "Nama            : " + nama + "\n" +
                   "Jenis Kelamin   : " + (jenisKelamin ? "Wanita" : "Pria") + "\n" +
                   "Usia            : " + usia + "\n" +
                   "-------------------------------------";
        }
        public static int[] hitungDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
            int pria = 0, wanita = 0;
            for (Dosen09 dosen : arrayOfDosen) {
                if (dosen.jenisKelamin) {
                    wanita++;
                } else {
                    pria++;
                }
            }
            return new int[]{pria, wanita};
        }
    }
    
        
