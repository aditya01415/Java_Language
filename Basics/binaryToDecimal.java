
import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        int pw=1;
        while(n>0){
            ans+=(n%10)*pw;
            n/=10;
            pw*=2;
        }
        System.out.print(ans);

        sc.close();
    }
}
