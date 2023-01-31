import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        int[] make=new int[2];

        for(int i=0; i<n; i++) {
            int a;
            System.out.print("Enter " +i+"th element: ");
            a=sc.nextInt();
            arr[i]=a;
        }

        int s=0,e=n-1,mid=s+(e-s)/2;

        if(n<=2) {
            for(int i=0; i<n;i++) {
                make[i]=arr[i];
            }
        }
        else {
            make[0]=arr[mid];
            make[1]=arr[mid+1];
        }

        for(int i=0; i<make.length;i++) {
            System.out.print(make[i]+" ");
        }
    }
}
