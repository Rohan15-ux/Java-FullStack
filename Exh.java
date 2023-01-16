import java.util.InputMismatchException;
import java.util.Scanner;
public class Exh{
    public static void main(String [] args){
        int a,b,result;
        Scanner sc=new Scanner(System.in);

        try{
            a=sc.nextInt();
            b=sc.nextInt();
            result=a/b;
            System.out.println("the result is "+ result);
        }

        catch (ArithmeticException e) {
         System.out.println ("Can't be divided by Zero " + e);
        }

        catch(InputMismatchException e1) {
            System.out.println("Not 32 bit Integer "+ e1);
        }        
    }
}