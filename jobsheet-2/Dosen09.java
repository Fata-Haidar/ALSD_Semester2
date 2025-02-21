public class Dosen09 {

    String idDosen;
    String nama;
    String bidangKeahlian;
    int tahunGabung;
    boolean statusAktif;

    void tampilInformasi(){
        System.out.println("ID Dosen: "+ idDosen);
        System.out.println("Nama: "+ nama);
        System.out.println("Status Aktif: "+ statusAktif);
        System.out.println("Tahun Gabung: "+ tahunGabung);
        System.out.println("Bidang Keahlian: "+ bidangKeahlian);
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
    public Dosen09(String kMK, String nm, int sks, int jJ){
        kodeMK = kMK ;
        this.nama = nm;
        this.sks = sks;
        jumlahJam = jJ;
    }
    public Dosen09(){
        
    }
}