//To check whether the given number is neon or not
import java.util.Scanner;
public class neon {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        
        if(n>0){
            int a=n*n;
            int b=a/10;
            int c=a%10;
            int d=b+c;
            {
            if(d==n)
                System.out.println("It is a Neon Number");
                else
                System.out.println("It is not a Neon Number");
            }

        
        }}}
