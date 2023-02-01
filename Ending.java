import java.util.Scanner;

public class Ending {
    public static void main(String[] args) {
        String str;
        System.out.print("Enter strings with space:");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int cnt=0, n=str.length();
        for(int i=0; i<=n-1; i++) {
            char ch=str.charAt(i);
            if(ch==' ' && str.charAt(i-1)=='z'|| ch==' ' && str.charAt(i-1)=='y') {
                cnt++;
            }
            char ch1=str.charAt(n-1);
            if(i==n-1) {
                if(ch1=='z' || ch1=='y'){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
