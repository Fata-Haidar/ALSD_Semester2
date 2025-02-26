public class Dosen09 {

    String idDosen;
    String nama;
    String bidangKeahlian;
    int tahunGabung;
    boolean statusAktif;

    void tampilInformasi(){
        System.out.println("ID Dosen: "+ idDosen);
        System.out.println("Nama: "+ nama);
        System.out.println("Status Aktif: "+(statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Gabung: "+ tahunGabung);
        System.out.println("Bidang Keahlian: "+ bidangKeahlian);
        System.out.println("----------------------------------");
    }
    void setStatusAktif(boolean status){
            this.statusAktif=status;
    
    }
    void ubahKeahlian(String bidang){
        this.bidangKeahlian=bidang;
    }
    int hitungMasaKerja(int thnSekarang){
      return thnSekarang-this.tahunGabung;
       
    }
    public Dosen09(String idD, String nm,boolean sA,String bidang ,int thnGB){
        idDosen = idD ;
        this.nama = nm;
        this.statusAktif= sA;
        tahunGabung=thnGB;
        this.bidangKeahlian=bidang;
    }
    public Dosen09(){
        
    }
}