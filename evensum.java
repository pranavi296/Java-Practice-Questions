//Find the sum of even numbers between 1 and a given number.
import java.util.Scanner;
public class evensum {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int n=scan.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum=sum+i;}}
            System.out.println(sum);
        }}