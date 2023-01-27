import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class Maketags {
    public static void main(String[] args) {
        String str1,str2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter tag: ");
        str1=sc.next();

        System.out.print("Enter string: ");
        str2=sc.next();

        System.out.println("<"+str1+">"+str2+"</"+str1+">");
    }
}
