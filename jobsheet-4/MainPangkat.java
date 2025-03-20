import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen: ");
    int elemen = input.nextInt();
    Pangkat[] png = new Pangkat[elemen];
    for (int j = 0; j < elemen; j++) {
        System.out.print("Masukkan nilai basis elemen ke-"+(j+1)+": "); 
        int basis=input.nextInt();
        System.out.print("Masukkan nilai pangkat elemen ke-"+(j+1)+": ");
        int pangkat = input.nextInt();
        png[j]= new Pangkat(basis, pangkat);
    }
    System.out.println("HASIL PANGKAT BRUTEFORCE:");
    for (Pangkat p : png) {
        System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF());
    }
    System.out.println("HASIL PANGKAT DIVIDE AND CONQUERE:");
    for (Pangkat p : png) {
        System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
    }
    } 
}

