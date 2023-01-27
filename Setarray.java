import java.util.Scanner;

public class Setarray {
    public static void main(String[] args) {
        int[] arr=new int[3];
        Scanner sc=new Scanner(System.in);

        for(int i=0; i<3; i++) {
            System.out.print("Enter "+i+"th element: ");
            int a;
            a=sc.nextInt();
            arr[i]=a;
        }

        for(int i=0; i<2; i++) {
            if(arr[i]==2 && arr[i+1]==3) {
                arr[i+1]=0;
            }
        }

        for(int i=0 ;i<3; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
