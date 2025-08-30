/*Convert the given number of days into completed years, months, and remaining days. Assume 1
year = 365 days, 1 month = 30 days.*/
import java.util.Scanner;
public class calender {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int temp=n;
        if(n>0){
            n = n / 365;
            System.out.println("years:" + n);
            if(n>0){
            temp=temp%365;
            System.out.println("Months:"+temp/30);
            temp=temp%30;}
            if(n>0){
                System.out.println("Days:" +temp );
            }
            
            
            
        }}}
            
        
        