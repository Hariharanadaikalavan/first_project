import java.util.Scanner;
public class PrimeNumber_10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0){
                count++;
            }
            
        }
        if(count==2){  // Satisfied the condition 
            System.out.println("PrimeNumber");
        }
        else{
            System.out.println("Not a primeNumber");
        }
    }
}
