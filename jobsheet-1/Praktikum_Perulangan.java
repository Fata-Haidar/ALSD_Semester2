import java.util.Scanner;
public class Praktikum_Perulangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = sc.nextLine();
        String nim2 = nim.substring(nim.length() - 2);
        int angkaInt = Integer.parseInt(nim2);
        if (angkaInt < 10) {
            angkaInt+=10;
            
        }
        for (int i = 1; i <= angkaInt; i++) {
            if (i==6||i==10) {
                continue;
            }
            if (i % 2 == 1) {
               System.out.print("* "); 
            }else{
                System.out.print(i+" ");
            }
             
            
        }
    }
}