public class MahasiswaBerprestasi09 {
    Mahasiswa09[] listMhs= new Mahasiswa09[5];
    int idx;
    void tambah(Mahasiswa09 mhs){
        
    }
    void tampil(){
        for (int i = 0; i < listMhs.length; i++) {
            System.out.println("NIM = " +listMhs[i].nim);
        System.out.println("Nama = "+listMhs[i].nama);
        System.out.println("Kelas = "+listMhs[i].kelas);
        System.out.println("IPK = "+listMhs[i].ipk);
        }
    }
    int seqeuntialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK :"+x+" ditemukan pada indeks "+pos);
        } else {
         System.out.println("data "+x+"tidak ditemukan");   
        }
    }
    void tampilDataSearch(double x, int pos){
        if (pos!=-1) {
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : "+listMhs[pos].kelas);
            System.out.println("ipk\t : "+x);
        } else {
            System.out.println("Data Mahasiswa dengan IPK "+x+" tidak ditemukan");
        }
    }

}
