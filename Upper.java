import java.util.*;
public class Upper {
    public static void main(String []args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        str=sc.nextLine();

        if(str.length()<3) {
            System.out.println(str.toUpperCase());
        }
        else {
            String str1;
            str1=str.substring(str.length()-3, str.length());
            System.out.println(str.substring(0, str.length()-3)+str1.toUpperCase());
        }
    }
}
