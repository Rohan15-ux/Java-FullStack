import java.util.Scanner;

public class Xcount {
    public static void main(String[] args) {
        String str;
        int cnt=0;
        System.out.print("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        str=sc.next();

        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
