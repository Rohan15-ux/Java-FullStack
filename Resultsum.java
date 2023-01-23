import java.util.*;
public class Resultsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter first val: ");
        a=sc.nextInt();
        System.out.print("Enter second val: ");
        b=sc.nextInt();
        System.out.print("Enter third val: ");
        c=sc.nextInt();

        int sum=a+b+c;
        if(a==b) {
            System.out.println(c);
        }
        else if(b==c) {
            System.out.println(a);
        }
        else if(c==a) {
            System.out.println(b);
        }
        else {
            System.out.println(sum);
        }
    }
}
