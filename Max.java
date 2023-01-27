import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0; i<n; i++) {
            int a;
            System.out.print("Enter "+i+"th element: ");
            a=sc.nextInt();
            arr[i]=a;
        }

        int maxele=arr[0];
        int s=0, e=n-1, mid=s+(e-s)/2;

        if(arr[s]>arr[e] && arr[s]>arr[mid] ){
            maxele=arr[s];
        }

        else if(arr[e]>arr[s] && arr[e]>arr[mid]) {
            maxele=arr[e];
        }

        else {
            maxele=arr[mid];
        }
        System.out.println("Max element: " + maxele);
    }
}
