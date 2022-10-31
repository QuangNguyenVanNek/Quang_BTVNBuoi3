import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int dem = 1;
        int max = 1;
        for(int i = 0; i < n - 1; i++){
            if(a[i] < a[i+1]){
                dem++;
               if(dem > max){
                   max = dem;
               }
            }else{
                dem = 1;
            }
        }
        System.out.println(max);
    }
}
