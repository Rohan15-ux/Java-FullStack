import java.util.Scanner;

public class VandC {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        str=sc.next();
        int v=0,c=0;

        for(int i=0; i<str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                v++;
            }
            else {
                c++;
            }
        }

        System.out.println("VOWELS: " + v + "\nCONSONANTS: " + c);
    }
}
