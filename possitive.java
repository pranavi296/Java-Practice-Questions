 //Write a program to check whether a number is Positive, Negative, or Zero.
import java.util.Scanner;
public class possitive{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        if(num>0)
        System.out.println("Possitive");
        else
        System.out.println("Negative");
    }
}