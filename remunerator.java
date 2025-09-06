//Write a program that calculates mileage remuneration for a salesperson at a rate of Rs.25 per mile.import java.util.Scanner;
/*import java.util.Scanner;
public class remunerator{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        float n=scan.nextFloat();
        float m=scan.nextFloat();
        float d = m-n;
        float rem = d*25;
        System.out.printf("%.2f %.2f",d,rem);
    }
}*/

import java.util.Scanner;
public class remunerator{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        float n=scan.nextFloat();
        float m=scan.nextFloat();
        float d=m-n;
        System.out.printf("%.2f",d);
        System.out.printf("%.2f",d*25);}}