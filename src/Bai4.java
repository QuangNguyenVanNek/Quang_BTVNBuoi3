import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Bai4 {
    public static boolean CheckSNT(int a){
        if(a < 2) return false;
        if(a % 2 == 0 && a != 2) return false;
        for(int i = 3; i <= Math.sqrt(a); i+=2){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean CheckTungSo(int a){
        while(a != 0){
            int du = a%10;
            if(CheckSNT(a) == false){
                return false;
            }
            a /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(CheckSNT(a[i]) == true){
                if(CheckTungSo(a[i]) == true){
                    cnt++;
                    System.out.println(a[i] + " ");
                }
            }
        }
        if(cnt == 0){
            System.out.println("NO");
        }
    }
}
