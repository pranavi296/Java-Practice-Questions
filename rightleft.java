import java.util.Scanner;
public class rightleft{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        int div=0;
        int dig=0;
        int temp=n;
        int m=n;
        while(n/10>0){
            count=count+1;
            n=n/10;}
        div=(int)Math.pow(10,count);  
       
       while(m/10>0) {
            dig=(temp/div)%10;
            System.out.print(dig);
            div=div/10;
            m=m/10;

        }
    }
        }