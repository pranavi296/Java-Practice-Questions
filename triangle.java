//Check whether a triangle is Equilateral, Isosceles, or Scalene.
import java.util.Scanner;
public class triangle {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if(a==b && b==c)
        System.out.println("equialateral Triangle");
        else if (a==b && b!=c)
        System.out.println("Isosceles Triangle");
        else if(a!=b && b!=c && a!=c)
         System.out.println("Scalene Triangle");
    }}