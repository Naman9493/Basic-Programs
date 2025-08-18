import java.util.*;

public class cal {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.print("Enter a= "); 
       int a =sc.nextInt();
       System.out.print("Enter b= "); 
       int b =sc.nextInt();
       System.out.print("Enter operator= "); 
      
       char operator= sc.next().charAt(0);
       
        switch (operator) {
            case '+':System.out.println("Addition="+(a+b));
                 break;
            case '-':System.out.println("Sub="+(a-b));
                 break;
            case '*':System.out.println("Mul= "+(a*b));
                 break;
            case '/':System.out.println("Div="+(a/b));
                 break;
        
            default:
                break;
        }
    }
}
