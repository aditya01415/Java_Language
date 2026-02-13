import java.util.Scanner;
public class countDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numofDigit=0;
        int temp=n;

        while(n>0){
            n=n/10;
            numofDigit++;
        }
        System.out.println("Number of digits in" + " "+ temp +" "+ "is" +" "+ numofDigit);

        sc.close();
    }
}