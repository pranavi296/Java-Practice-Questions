//Check whether the given number is divisible by both 3 and 5.
import java.util.Scanner;
public class division{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        if(n%3==0){
            if(n%5==0)
            System.out.println("Yes");
            else
            System.out.println("No");
            }
        
    }
    }