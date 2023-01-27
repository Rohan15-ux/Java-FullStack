import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("day0=Sun day1=Mon day2=Tue day3=Wed day4=Thurs day5=Fri day6=Sat");
        System.out.print("Enter day: ");
        day=sc.nextInt();

        boolean vac;
        System.out.print("Are you on a vacation?(true/false) ");
        vac=sc.nextBoolean();

        if(day==1 || day==2 || day==3 || day==4 || day==5) {
            if(vac!=true) {
                System.out.println("7:00");
            }
            else {
                System.out.println("10:00");
            }
        }

        else if(day==0 || day==6) {
            if(vac!=true) {
                System.out.println("10:00");
            }
            else {
                System.out.println("Alarm is OFF");
            }
        }

    }
}
