import java.util.*;
public class Unique {
    public static void main(String[] args) {
        int[] arr=new int[127];

        System.out.print("Enter a string: ");
        String str,str1;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        str1=str.toLowerCase();

        for(int i=0; i<str1.length(); i++) {
            arr[(int)str1.charAt(i)]++;
        }

        for(int i=0; i<127; i++) {
            if(arr[i]==1) {
                System.out.print((char)i + " ");
            }
        }
    }
}
