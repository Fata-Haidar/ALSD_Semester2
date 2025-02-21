public class MahasiswaMain09 {

    public static void main(String[] args) {
    Mahasiswa09 mhs1 = new Mahasiswa09();
    mhs1.nama = "Muhammad Ali Farhan";
    mhs1.nim = "2441720171";
    mhs1.kelas = "SI 2J 1H";
    mhs1.ipk = 3.55;
    mhs1.tampilkanInformasi();
    mhs1.ubahKelas("SI 2K");
    mhs1.updateIPK(3.60);
    mhs1.tampilkanInformasi();

    Mahasiswa09 mhs2= new Mahasiswa09("Annisa Nabila", "2141720160", 3.25, "TI 2L");
    mhs2.updateIPK(3.30);
    mhs2.tampilkanInformasi();
    Mahasiswa09 mhsFata = new Mahasiswa09("Fata Haidar Aly","244107020108",3.50,"TI 1H");
    mhsFata.tampilkanInformasi();
    Mahasiswa09 mhsF = new Mahasiswa09("Fata Haidar Aly","244107020108",3.50,"TI 1H");
    mhsF.tampilkanInformasi();
    }
}