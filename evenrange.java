//Display even numbers between a given range inclusive of both start and end.
import java.util.Scanner;
public class evenrange {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int n=scan.nextInt();
        int m=scan.nextInt();
        for(int i=n;i<=m;i++){
            if(i%2==0)
            System.out.println(i);
        }}}