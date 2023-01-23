import java.util.*;
public class Chocolate {

    public static void check() {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 small bar=1kg \n1 big bar=5kg");
        int s,b,g;
        System.out.print("Enter number of small bars: ");
        s=sc.nextInt();
        
        System.out.print("Enter number of big bars: ");
        b=sc.nextInt();
        
        System.out.print("Enter goal: ");
        g=sc.nextInt();
        

        if((s+b*5)==g) {
            System.out.println(s);
        }
        else if ((s+b*5)>g) {
            System.out.println((s+b*5)-g);
        }
        else if ((s+b*5)<g) {
            System.out.println("-1");
        }


    }
    public static void main(String[] args) {
        check();
    }
}
