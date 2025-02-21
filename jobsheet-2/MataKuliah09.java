public class MataKuliah09 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode Mata KUliah: "+ kodeMK);
        System.out.println("Nama: "+ nama);
        System.out.println("SKS: "+ sks);
        System.out.println("Jumlah: "+ kelas);
    }
    void ubahSKS(int sksBaru){}
    void tambahJam(int jam){}
    void kurangiJam(int jam){}
    public MataKuliah09(String kMK, String nm, int sks, int jJ){
        kodeMK = kMK ;
        this.nama = nm;
        this.sks = sks;
        jumlahJam = jJ;
    }
    public MataKuliah09(){
        
    }
}