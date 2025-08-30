import java.util.Scanner;
public class maxmin {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int q=scan.nextInt();

        if(n>m){
            if(n>q)
            System.out.println("n is greater");
            else
            System.out.println("q is greater");
        }
        else if(m>n){
        if(m>q)
            System.out.println("m is greater");
            else
            System.out.println("q is greater");}}}
