import java.util.*;
public class Rangesum {
    public static void main(String [] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a and b: ");
        a=sc.nextInt();
        b=sc.nextInt();

        if((a+b)>=10 && (a+b)<=19) {
            System.out.println(20);
        }
        else {
            System.out.println(a+b);
        }
    }
}
