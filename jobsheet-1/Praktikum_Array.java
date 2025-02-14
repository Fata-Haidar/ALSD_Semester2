import java.util.Scanner;
public class Praktikum_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================");
        String[] matkul= {"Pancasila"," Konsep Teknologi Informasi","Critical Thinking dan Problem Solving", "Matematika Dasar", " Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int[] nilaiAngka = new int[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] bobotNilai= new double[matkul.length];
        int[] sks= {2,2,2,3,2,2,3,2};
        double ip=0;
        double totalBobot=0;
        int totalSks=0;
        for (int j = 0; j < matkul.length; j++) {
            System.out.print("Masukkan nilai Angka untuk MK "+matkul[j]+" : ");
            nilaiAngka[j] = sc.nextInt(); 
            if (nilaiAngka[j] <= 100 && nilaiAngka[j] > 80) {
                nilaiHuruf[j] ="A";
                bobotNilai[j] =4.00;
            } else if (nilaiAngka[j] <= 80 && nilaiAngka[j] > 73) {
                nilaiHuruf[j] ="B+";
                bobotNilai[j] =3.50;
            } else if (nilaiAngka[j] <= 73 && nilaiAngka[j] > 65) {
                nilaiHuruf[j] ="B";
                bobotNilai[j] =3.00;
            } else if (nilaiAngka[j] <= 65 && nilaiAngka[j] > 60) {
                nilaiHuruf[j] ="C+";
                bobotNilai[j] =2.50;
            } else if (nilaiAngka[j] <= 60 && nilaiAngka[j] > 50) {
                nilaiHuruf[j] ="C";
                bobotNilai[j] =2.00;
            } else if (nilaiAngka[j] <= 50 && nilaiAngka[j] > 39) {
                nilaiHuruf[j] ="D";
                bobotNilai[j] =1.50;
            } else {
                nilaiHuruf[j] ="E";
                bobotNilai[j] =1.00;
            }  
            totalBobot+=bobotNilai[j]*sks[j];
            totalSks+=sks[j];
        }
        ip=totalBobot/totalSks;
        System.out.println("=======================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("=======================");
        System.out.printf("%-40s %-20s %-20s %-20s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-20s %-20s %-20.2f%n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);    
        }
        System.out.println("=======================");
        System.out.println(String.format("IP : %.2f",ip));

    }
}