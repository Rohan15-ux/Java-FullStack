import java.util.*;
public class Append {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str,str1;
        System.out.print("Enter Strings: ");
        str=sc.next();
        str1=sc.next();

        if(str.length()==str1.length()) {
            System.out.println(str+str1);
        }
        else {
            if(str.length()>str1.length()) {
                System.out.println(str.substring((str.length()-str1.length()),str.length()) + str1);
            }
            else {
                System.out.println(str+str1.substring((str1.length()-str.length()), str1.length()));
            }
        }
    }
}
