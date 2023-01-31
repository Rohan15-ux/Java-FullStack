import java.util.Scanner;

public class There {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        str=sc.next();

        for(int i=0; i<str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='x') {
                if(str.charAt(i+1)=='.') {
                    System.out.println(false);
                    
                }
                else if(i==0) {
                    System.out.println(true);
                    
                }
                else {
                    System.out.println(true);
                    
                }
            }
        }
    }
}
