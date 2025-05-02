import java.util.Arrays;

public class mainDos {
    static Dosen[] dataDosen = {
        new Dosen("D001", "Budi Hartono"),
        new Dosen("D002", "Rina Marlina"),
        new Dosen("D003", "Agus Wijaya"),
        new Dosen("D004", "Siti Aminah"),
        new Dosen("D005", "Andi Pratama")
    };

    static MataKuliah[] dataMataKuliah = {
        new MataKuliah("MK001", "Struktur Data", 3),
        new MataKuliah("MK002", "Pemrograman Java", 3),
        new MataKuliah("MK003", "Basis Data", 3),
        new MataKuliah("MK004", "Algoritma dan Pemrograman", 2),
        new MataKuliah("MK005", "Matematika Diskrit", 2),
        new MataKuliah("MK006", "Jaringan Komputer", 3),
        new MataKuliah("MK007", "Pemrograman Web", 3)
    };

    static Jadwal[] dataJadwal = {
        new Jadwal(dataDosen[0], dataMataKuliah[0], "Senin", "08:00"),
        new Jadwal(dataDosen[1], dataMataKuliah[1], "Selasa", "10:00"),
        new Jadwal(dataDosen[2], dataMataKuliah[2], "Rabu", "09:00"),
        new Jadwal(dataDosen[0], dataMataKuliah[3], "Kamis", "13:00"),
        new Jadwal(dataDosen[3], dataMataKuliah[4], "Jumat", "07:00"),
        new Jadwal(dataDosen[4], dataMataKuliah[5], "Senin", "11:00"),
        new Jadwal(dataDosen[1], dataMataKuliah[6], "Rabu", "14:00")
    };

    public static void main(String[] args) {
        urutkanJadwal();
    }

    static void urutkanJadwal() {
        String[] urutanHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        
        for (int i = 0; i < dataJadwal.length-1; i++) {
            for (int j = 0; j < dataJadwal.length-1-i; j++) {
                int bandingHari = getIndexHari(dataJadwal[j].hari, urutanHari)-getIndexHari(dataJadwal[j+1].hari, urutanHari);
                if (bandingHari >0) {
                    Jadwal temp = dataJadwal[j];
                    dataJadwal[j]=dataJadwal[j+1];
                    dataJadwal[j+1]=temp;
                }else if (bandingHari==0) {
                    if (dataJadwal[j].jam.compareTo(dataJadwal[j+1].jam)>0) {
                        Jadwal temp = dataJadwal[j];
                        dataJadwal[j]= dataJadwal[j+1];
                        dataJadwal[j+1]=temp;

                    }
                }
            }
        }

        // Output hasil sorting
        System.out.println("=== JADWAL KULIAH TERURUT (Hari & Jam) ===");
        for (Jadwal j : dataJadwal) {
            System.out.println(j.hari+" - "+ j.jam+" | "+ j.dosen.namaDosen+" - "+ j.mataKuliah.namaMK);
        }
    }

    static int getIndexHari(String hari, String[] urutanHari) {
        for (int i = 0; i < urutanHari.length; i++) {
            if (urutanHari[i].equalsIgnoreCase(hari)) return i;
        }
        return 999;
    }
}
