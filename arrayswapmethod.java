import java.util.*;
public class arrayswapmethod{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[]=new int[size];
        for(int i =0;i<size;i++)
         arr[i]=scan.nextInt();
         int[] res=SwapAdjPair(arr);
         //for(int x:res)
        // System.out.print(x+" ");
         System.out.print(Arrays.toString(res));
         }
         static int[] SwapAdjPair(int[] a){
            for(int i=0;i<a.length-1;i=i+2){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;}
            return a;
         }}
