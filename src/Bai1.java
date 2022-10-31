import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int cnt = 1;
        for(int i = 1; i < n; i++){
            if(a[i] == a[i-1]){
                cnt++;
            }else{
                System.out.println(a[i - 1] + " : " + cnt);
                cnt = 1;
            }
        }
        System.out.println(a[n-1] + " : " + cnt);
    }
}
