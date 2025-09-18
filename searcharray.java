/*import java.util.Scanner;
public class searcharray{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        int m=0;
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();}
            int n=scan.nextInt();
            for(int i=0;i<size;i++){
                if(arr[i]==n)
                 m=i;
                else
                 m=-1;
            }
            System.out.println(m);
            }
        }*/


       import java.util.Scanner;
public class searcharray{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();}
            int n=scan.nextInt();
           boolean find=false;
           int i;
           for(i=0;i<size;i++){
            if(arr[i]==n){
                find=true;
                break;
            }}
         if(find)
           System.out.println(i);
           else
           System.out.println("-1"); 
    }}
           