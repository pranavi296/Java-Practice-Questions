import java.util.Scanner;

public class cdivision{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[]=new int[size];
        int sum=0;
        int no=0;
        for(int i=0;i<size;i++)
         arr[i]=scan.nextInt();
         for(int i=0;i<size;i++)
            sum=sum+arr[i];
         for(int i=0;i<size;i++){
            no=sum-arr[i];
            System.out.println(no);
         }}}