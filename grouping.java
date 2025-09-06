//Write a program for customer grouping
import java.util.Scanner;
public class grouping {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int GC=scan.nextInt();
        int Age=scan.nextInt();
        if(Age<=25)
        {
            if(GC==1)
            System.out.println("Group 1");
            else if (GC==2)
            System.out.println("Group 2");
            else
            System.out.println("Invalid");
        }
        if(Age>25 && Age<46)
        {
            if(GC==1)
            System.out.println("Group 3");
            else if(GC==2)
            System.out.println("Group 4");
            else if(GC>2)
            System.out.println("Invalid");
        } 
        if(Age>=45){
            System.out.println("Group 5");
        }

            }
        }