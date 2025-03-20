public class KendaraanMain {

    public static void main(String[] args) {
        double m=0;
        Kendaraan[] atlet= new Kendaraan[4];
            atlet[0]=new Kendaraan();
            atlet[0].nomorPlat="KKKK";
            atlet[0].jarakTempuh=20;
            atlet[0].konsumsiBahanBakar=5;
            atlet[1]=new Kendaraan();
            atlet[1].nomorPlat="W1345";
            atlet[1].jarakTempuh=35;
            atlet[1].konsumsiBahanBakar=7;
            
            atlet[2] = new Kendaraan("D890",40,8);
            atlet[3] = new Kendaraan("Z3456",36,6);
            atlet[1].efisiensi();
            
            System.out.println("Kendaraan paling efisien: "+atlet[1].nomorPlat);
            System.out.println("Nilai efisiensi:"+atlet[1].efisiensi());
            if (atlet[0].efisiensi()>atlet[1].efisiensi()) {
                System.out.println(m);
            }
            System.out.println("Data Kendaraan");
            for (int i = 0; i < atlet.length; i++) {
                atlet[i].printData();
                System.out.println("--------------------------------");
            }  
            
    }
}