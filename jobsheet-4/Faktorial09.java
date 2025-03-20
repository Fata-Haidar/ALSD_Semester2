public class Faktorial09 {

    public int faktorialBF(int n){
        int i= 1;
        int fakto = 1;
        while (i<=n) {
            fakto=fakto*i;
            i++;
        }
        return fakto;
    }
    int faktorialDC(int n){
        if (n==1) {
            return n;
        }else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}