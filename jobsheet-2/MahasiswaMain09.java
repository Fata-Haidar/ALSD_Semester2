public class MahasiswaMain09 {

    public static void main(String[] args) {
    Mahasiswa09 mhs1 = new Mahasiswa09();
    mhs1.nama = "Fata";
    mhs1.nim = "244107020108";
    mhs1.kelas = "TI 1H";
    mhs1.ipk = 3.55;
    mhs1.tampilkanInformasi();
    mhs1.ubahKelas("TI 1K");
    mhs1.updateIPK(3.60);
    mhs1.tampilkanInformasi();

    Mahasiswa09 mhs2= new Mahasiswa09("Annisa Nabila", "2141720160", 3.25, "TI 2L");
    mhs2.updateIPK(3.30);
    mhs2.tampilkanInformasi();
    }
