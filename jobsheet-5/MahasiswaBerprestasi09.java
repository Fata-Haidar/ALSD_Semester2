public class MahasiswaBerprestasi09 {
    Mahasiswa09 [] listMhs=new Mahasiswa09[5];  
    int idx;
    void tambah(Mahasiswa09 m){
        if (idx < listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }
    void tampil (){
        for (Mahasiswa09 m : listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------");
        }

    }
    void bubblesort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j-1].ipk>listMhs[j].ipk) {
                   Mahasiswa09 temp=listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=temp;
                }
            }
        }
    }
}
