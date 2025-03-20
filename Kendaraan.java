public class Kendaraan {

    String nomorPlat;
    double jarakTempuh, konsumsiBahanBakar;
    double efisiensi (){
return jarakTempuh/konsumsiBahanBakar;
    }
    void printData(){
        System.out.println("Nomor Plat : "+ nomorPlat);
        System.out.println("Jarak Tempuh : "+ jarakTempuh);
        System.out.println("Konsumsi Bahan Bakar : "+ konsumsiBahanBakar);
    }
    public Kendaraan(){
        
    }
    public Kendaraan(String nomorPlat, double jarakTempuh, double konsumsiBahanBakar){
        this.nomorPlat=nomorPlat;
        this.jarakTempuh=jarakTempuh;
        this.konsumsiBahanBakar=konsumsiBahanBakar;
        }
}