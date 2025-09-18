import java.util.Scanner;
import java.util.Arrays;
public class rightrotation{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int size= scan.nextInt();
        int arr[]=new int[size];
       
        
        for(int i=0;i<=size-1;i++)
        arr[i]=scan.nextInt();
        
        
        System.out.print(Arrays.toString(arr));
         int n=scan.nextInt();

        for(int i=1;i<=n;i++){
            int temp=arr[size-1];
            for(int j=size-1;j>=1;j--){
                arr[j]=arr[j-1];
            }
            arr[0 ]=temp;
        }
        System.out.print(Arrays.toString(arr));}}
