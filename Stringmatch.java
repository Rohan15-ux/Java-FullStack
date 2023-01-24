import java.util.*;
public class Stringmatch {
    public static void main(String[] args) {
        String str,str1;
        int cnt=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first string: ");
        str=sc.next();
        System.out.print("Enter second string: ");
        str1=sc.next();
        
        for(int i=0; i<=str1.length()-1; i++ ) {
            if(i==str.length()-1){
                break;
            }
            if(str.charAt(i)==str1.charAt(i)) {
                if(str.charAt(i+1)==str1.charAt(i+1)) {
                        cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
