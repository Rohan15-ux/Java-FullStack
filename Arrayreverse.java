import java.util.*;
public class Arrayreverse {
    public static void main(String [] args) {
        int[] arr={1,2,4,1,7,8};
        int l=0, r=arr.length-1;

        System.out.println("Before Reversing");

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        while(r>l){
            arr[l]=arr[l]+arr[r];
            arr[r]=arr[l]-arr[r];
            arr[l]=arr[l]-arr[r];
            l++;
            r--;
        }

        System.out.println("After Reversing");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
