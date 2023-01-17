import java.util.Scanner;
public class Stringreverse {
    public static void main(String[] args) {
        String str;
        String str1="";
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        char ch;
        // String temp=str;

        for(int i=str.length()-1; i>=0; i--) {
            ch=str.charAt(i);
            str1=str1+ch;
        }

        System.out.println(str1);
    }
}
