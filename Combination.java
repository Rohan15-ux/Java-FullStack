import java.util.Scanner;

public class Combination {
    public static int fact(int n) {
        int fact=1;
        for(int i=1; i<n; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n,r;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        n=sc.nextInt();
        System.out.print("Enter r: ");
        r=sc.nextInt();

        if(n==0 && r==0 || r==0 || n==0) {
            System.out.println(1);
        }
        else {
            int ans=fact(n)/(fact(r)*fact(n-r));
            System.out.println(ans);
        }

    }
}
