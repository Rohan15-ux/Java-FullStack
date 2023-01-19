import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.next();

        for(int i=0; i<str.length(); i++) {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)) {
                System.out.print(Character.toLowerCase(ch));
            } 
            else {
                System.out.print(Character.toUpperCase(ch));
            }
        }

    }
}
