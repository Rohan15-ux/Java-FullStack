import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        int speed;
        Boolean birthday;
        Scanner sc=new Scanner(System.in);

        System.out.print("Speed: ");
        speed=sc.nextInt();
        System.out.print("Is you birthday today? ");
        birthday=sc.nextBoolean();
        if(birthday==true) {
            
            if(speed-5<=60) {
                System.out.println(0);
            }
    
            else if(speed-5>=61 && speed-5<=80) {
                System.out.println(1);
            }
            else if(speed-5>80) {
                System.out.println(2);
            }
        }
        else {
            if(speed<=60) {
                System.out.println(0);
            }
    
            else if(speed>=61 && speed<=80) {
                System.out.println(1);
            }
            else if(speed>80) {
                System.out.println(2);
            }
        }
    }
}
