public class MataKuliah09 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode Mata KUliah: "+ kodeMK);
        System.out.println("Nama: "+ nama);
        System.out.println("SKS: "+ sks);
        System.out.println("Jumlah: "+ jumlahJam);
        System.out.println("----------------------------------");
    }
    void ubahSKS(int sksBaru){
            sks = sksBaru;
            System.out.println("SKS Telah Diubah");
    
    }
    void tambahJam(int jam){
        jumlahJam+=jam;
    }
    void kurangiJam(int jam){
        if (jam<= jumlahJam) {
            jumlahJam-=jam;
        }else{
            System.out.println("Pengurangan Tidak Dapat Dilakukan");
        }
    }
    public MataKuliah09(String kMK, String nm, int sks, int jJ){
        kodeMK = kMK ;
        this.nama = nm;
        this.sks = sks;
        jumlahJam = jJ;
    }
    public MataKuliah09(){
        
    }
}