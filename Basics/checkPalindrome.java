import java.util.Scanner;

public class checkPalindrome {
   static void palindrome(int n){
    int d;
    int rev=0;
    int a=n;
    while(n>0){
         
     d=n%10;
    rev=rev*10+d;
    n/=10;
    }
    if(rev==a){
        System.out.print("The given no. is Palindrome");
    }
    else{
        System.out.print("The given no. is Not Palindrome");

    }
  

   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        palindrome(n);

    }
}

