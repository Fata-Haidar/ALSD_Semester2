public class MataKuliahMain09 {

    public static void main(String[] args) {
            MataKuliah09 mhs1 = new MataKuliah09();
            mhs1.kodeMK = "Praktikum ALSD";
            mhs1.nama = "Fata Haidar Aly";
            mhs1.sks = 6;
            mhs1.jumlahJam = 6;
            mhs1.tampilInformasi();
            mhs1.ubahSKS(5);
            mhs1.tambahJam(2);
            mhs1.kurangiJam(3);
            mhs1.tampilInformasi();
        
            MataKuliah09 mhs2= new MataKuliah09("Praktikum Basis Data", "Ary Valdurers", 4, 5);
            mhs2.tampilInformasi();
            mhs2.kurangiJam(10);
            mhs2.tampilInformasi();
    }
}