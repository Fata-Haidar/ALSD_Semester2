public class DosenMain09 {

    public static void main(String[] args) {
        Dosen09 dosen1 = new Dosen09();
        dosen1.idDosen = "2445678";
        dosen1.nama = "Fata Haidar Aly";
        dosen1.statusAktif = true;
        dosen1.bidangKeahlian = "Basis Data";
        dosen1.tahunGabung=2018;
        dosen1.tampilInformasi();
        dosen1.ubahKeahlian("Sistem Operasi");
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.tampilInformasi();

        Dosen09 dosen2 = new Dosen09("123456", "Dr. Budi",true, "Informatika", 2010);
        dosen2.tampilInformasi();
        
        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Kecerdasan Buatan");
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.tampilInformasi();
    }
}