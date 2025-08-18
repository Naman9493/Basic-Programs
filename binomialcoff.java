import java.util.*;

public class binomialcoff {

    public static int factorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return(fact);
    }
    public static int bicoff(int n,int r) {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nr=factorial(n-r);
        int bioff= fact_n/(fact_r*fact_nr);
       return bioff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
         int n=sc.nextInt();
         System.out.print("enter r: ");
         int r=sc.nextInt();
         int f=bicoff(n, r);
         System.out.println(f);

     }
}
