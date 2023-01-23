import java.util.*;
public class DeleteChar {
    public static void main(String [] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        str=sc.next();

        // StringBuilder st=new StringBuilder(str);

        for(int i=1; i<str.length()-1; i++) {
            char ch=str.charAt(i);
            if(ch=='x') {
                str=str.substring(0, i) + str.substring(i + 1); 
            }
        }

        System.out.println(str);
    }
}
