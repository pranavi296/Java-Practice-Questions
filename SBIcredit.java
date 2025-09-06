//Check eligibility for SBI Credit Cards based on criteria
import java.util.Scanner;
public class SBIcredit {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
         int PAge=scan.nextInt();
        int AddAge=scan.nextInt();
        int Etype=scan.nextInt();
        int salary=scan.nextInt();
        if((PAge>21 && PAge<61) && (AddAge>18) && (Etype>=1 && Etype<5 ) && (salary>=300000)){
                System.out.println("Yes,You are eligible for SBI credit cards");
               
            }
        
         else{
                System.out.println("No,You are not an eligible for SBI credit cards");
        
    }}
    }