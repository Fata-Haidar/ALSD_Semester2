import java.util.Scanner;
public class Tugas1_JS1_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] kode= {'A','B','D', 'E', 'F', 'G', 'H' ,'L', 'N', 'T'};
        char[][] kota = {
            {'B','A','N','T','E','N',' ',' ',' ',' ',' ',' '},
            {'J','A','K','A','R','T','A',' ',' ',' ',' ',' '}, 
            {'B','A','N','D','U','N','G',' ',' ',' ',' ',' '},
            {'C','I','R','E','B','O','N',' ',' ',' ',' ',' '},
            {'B','O','G','O','R',' ',' ',' ',' ',' ',' ',' '},
            {'P','E','K','A','L','O','N','G','A','N',' ',' '},
            {'S','E','M','A','R','A','N','G',' ',' ',' ',' '},
            {'S','U','R','A','B','A','Y','A',' ',' ',' ',' '},
            {'M','A','L','A','N','G',' ',' ',' ',' ',' ',' '},
            {'T','E','G','A','L',' ',' ',' ',' ',' ',' ',' '}};
      
      boolean s = true;
      while (s) {
        System.out.print("Masukkan Kode Plat Nomor : ");
      char c= Character.toUpperCase(sc.next().charAt(0));
        switch (c) {
            case 'A':
            System.out.print("Kota: ");
                for (int i = 0; i < 12; i++) {
                    System.out.print(kota[0][i]);
                }
                s=false;
                break;
            case 'B':
            for (int i = 0; i < kota[0].length; i++) {
                System.out.print(kota[1][i]);
            }
            s=false;
                break;
            case 'D':
            for (int i = 0; i < kota[0].length; i++) {
                System.out.print(kota[2][i]);
            }
                break;
            case 'E':
            for (int i = 0; i < kota[0].length; i++) {
                System.out.print(kota[3][i]);
            }
            s=false;
                break;
            case 'F':
            for (int i = 0; i < kota[0].length; i++) {
                System.out.print(kota[4][i]);
            }
            s=false;
                break;
            case 'G':
            for (int i = 0; i < kota[0].length; i++) {
                System.out.print(kota[5][i]);
            }
                break;
            case 'H':
            for (int i = 0; i < kota[0].length; i++) {
                System.out.print(kota[6][i]);
            }
            s=false;
                break;
            case 'L':
            for (int i = 0; i < kota[0].length; i++) {
                System.out.print(kota[7][i]);
            }
            s=false;
                break;
            case 'N':
            for (int i = 0; i < kota[0].length; i++) {
                System.out.print(kota[8][i]);
            }
            s=false;
                break;
            case 'T':
            for (int i = 0; i < kota[0].length; i++) {
                System.out.print(kota[9][i]);
            } 
            s=false;
                break;    
          
            default:
            
                System.out.println("Nomor Tidak ditemukan, Harap Input Ulang.");
                
              
      }
      
      }
    }
}