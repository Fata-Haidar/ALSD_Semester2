import java.util.Scanner;
public class ALSD_FataHaidar_jobsheet1 {
    public static void main(String[] args) {
        int t,k,ut,ua;
        String h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitunh Nilai Akhir");
        System.out.println("=============================");
        System.out.print("Masukkan Nilai Tugas: ");
        t=sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        k=sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        ut=sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        ua=sc.nextInt();
        System.out.println("=============================");
        System.out.println("=============================");
        if (t < 0 || t > 100||k < 0 || k > 100 ||  ut < 0 || ut > 100 || ua < 0 || ua > 100 ) {
           System.out.println("nilai tidak valid"); 
        }
        double total = ((t*0.2)+(k*0.2)+(ut*0.3)+(ua*0.4));
        System.out.println("nilai akhir : "+total);
        if (total <= 100 && total > 80) {
            h ="A";
        } else if (total <= 80 && total > 73) {
            h ="B+";
        } else if (total <= 73 && total > 65) {
            h ="B";
        } else if (total <= 65 && total > 60) {
            h ="C+";
        } else if (total <= 60 && total > 50) {
            h ="C";;
        } else if (total <= 50 && total > 39) {
             h ="D";
        } else {
             h ="E";
        }
        System.out.println("Nilai Huruf :"+h);
        System.out.println("=============================");
        System.out.println("=============================");
        if (h.equals("D")||h.equals("E")) {
            System.out.println("MOHON MAAF ANDA TIDAK LULUS");
        }else{
            System.out.println("SELAMAT ANDA LULUS");
        }
       

    }
}