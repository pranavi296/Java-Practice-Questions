import java.util.Scanner;
import java.util.Arrays;
public class arraydeletion{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int size= scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=scan.nextInt();
        System.out.print(Arrays.toString(arr));
        int pos=scan.nextInt();
        int darr[]=new int[size-1];
        for(int i=pos;i<size-1;i++)
        arr[i]=arr[i+1];
        for(int i=0;i<size-1;i++)
        darr[i]=arr[i];
        System.out.print(Arrays.toString(darr));}}
