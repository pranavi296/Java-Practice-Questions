import java.util.Scanner;
import java.util.Arrays;
public class reverse2array{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int size= scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<=size-1;i++)
        arr[i]=scan.nextInt();
        int[i]=arr[0];
        int[j]=arr[size-1];
        System.out.print(Arrays.toString(arr));
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j++;

        }}}