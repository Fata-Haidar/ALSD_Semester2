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
}
