//print the minimum value in the given array
import java.util.Scanner;
public class minarray{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<size;i++){
        if(min>arr[i])
        min=arr[i];}
        System.out.println("MIN:"+min);

    }
}