import java.util.*;
public class Stringadd {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        str=sc.next();

        if(str.length()<2){
            str=str.substring(0, 1)+str;
            str=str+str.substring(0, 1);
        }
        else {
            str=str.substring(0, 2)+str;
            str=str+str.substring(0, 2);
        }

        System.out.print("After processing: ");
        System.out.println(str);
    }
}
