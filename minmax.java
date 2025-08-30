import java.util.Scanner;
public class minmax {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int q=scan.nextInt();{
        if(n>m)
        {if(n>q)
        System.out.println("max:"+n);
        else 
         System.out.println("max:"+q);}
         else if(n<m){
            if(m>q)
            System.out.println("max:"+m);
            else
            System.out.println("max:"+q);
         }}
         {
            if(n>m){
                if(m<q)
                System.out.println("min:"+m);
                else
                System.out.println("min:"+q);
            }
            else if(m>n){
                if(n>q)
                System.out.println("min:"+q);
                else
                System.out.println("min:"+n);
            }
         }}}


