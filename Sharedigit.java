import java.util.Scanner;

public class Sharedigit {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a and b with spaces: ");
        a=sc.nextInt();
        b=sc.nextInt();
        
        if((a/10)==(b/10) || (a/10)==(b%10) ) {
            System.out.println(true);
        }
        else if ((a%10)==(b/10) || (a%10)==(b%10)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
