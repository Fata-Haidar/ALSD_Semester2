public class Mahasiswa09 { 
    String nim, nama, kelas; 
    double ipk; 
    public Mahasiswa09(){ 
    } 
    public Mahasiswa09(String nm, String name, String kls, double ip){
        nim = nm; 
        nama = name; 
        kelas = kls; 
        ipk = ip; 
    } 
    void tampilInformasi(){ 
        System.out.println(nim+" - "+nama+" - "+kelas+" - "+ipk); 
    } 
} 