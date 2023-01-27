import java.util.*;
public class Smile {
    public static void main(String[]args) {
        boolean asmile,bsmile;
        Scanner sc= new Scanner(System.in);

        System.out.print("Say if a is smiling(true/false): ");
        asmile=sc.nextBoolean();
        System.out.print("Say if b is smiling(true/false): ");
        bsmile=sc.nextBoolean();

        if(asmile==bsmile) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
