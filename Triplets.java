import java.util.*;
public class Triplets {
    public static boolean check() {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0; i<n; i++) {
            System.out.print(i+"th element: ");
            arr[i]=sc.nextInt();
        }
        System.out.println();

        for(int i=0; i<n; i++) {
            int j=i+2;
            if(n<=2) {
                return true;
            }
            else if(arr[i]==arr[i+1] && arr[i+1]==arr[j]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(check());
    }
}
