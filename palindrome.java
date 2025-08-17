import java.util.*;

public class palindrome {
    public static void Palin(int n)
    {
        int r=0;
        int m=n;
        int a;
        while(m>0){
         a=m%10;
        // r=r+a;
        r=r*10+a;
        m=m/10;
    }
    
    if(r==n)
    {
        System.out.println("plaindrome");
    }
    else
    {
        System.out.println("not palindrome");
    }}
   public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter no.: ");
            int a=sc.nextInt();
            Palin(a);
   }

}
