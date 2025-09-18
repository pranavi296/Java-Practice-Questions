import java.util.Scanner;
public class factorial{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int temp=n;
        if(n>0){
        for(int i=1;i<n;i++)
            temp=temp*(i);
         System.out.println("factorial of "+ n + " is "+temp) ; 
        }
        else
        System.out.println("Factorial for Negative Number does'nt exit");
        
    }
}
