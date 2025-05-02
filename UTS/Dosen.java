public class Dosen {

    String nidn, namaDosen;

    Dosen(String nidn, String namaDosen){
        this.nidn=nidn;
        this.namaDosen=namaDosen;
    }

    void tampilData(){
        System.out.println("NIDN: "+ nidn);
        System.out.println("Nama : "+ namaDosen);
        System.out.println("");
    }
}