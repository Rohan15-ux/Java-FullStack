import java.util.Scanner;

public class Green {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a b c with spaces: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a==b && b==c && c==a) {
            System.out.println(20);
        }
        else if(a==b || b==c || c==a) {
            System.out.println(10);
        }
        else {
            System.out.println(0);
        }
    }
}
