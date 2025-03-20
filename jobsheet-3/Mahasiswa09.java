public class Mahasiswa09 {

    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
   void cetakInfo(Mahasiswa09[] arrayOfMahasiswa09){
    for (int i = 0; i < 3; i++) {
        System.out.println("Data Mahasiswa ke-"+ (i+1)); 
        System.out.println("NIM     : "+ arrayOfMahasiswa09[i] .nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa09[i].nama);
        System.out.println("Keals   : "+arrayOfMahasiswa09[i].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa09[i].ipk);
        System.out.println("----------------------------------");
    }
   }
}