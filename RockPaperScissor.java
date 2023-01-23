import java.util.*;

public class RockPaperScissor {
    public static void rps(){
        Random random = new Random();
        ArrayList<String> choice=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        int rounds;
        System.out.print("Enter number of rounds: ");
        rounds=sc.nextInt();
        
        System.out.println();

        choice.add("Rock");
        choice.add("Paper");
        choice.add("Scissor");
        
        System.out.print("Choices: ");
        for(int i=0; i<choice.size(); i++) {
            System.out.print((i) + "."+ choice.get(i) + " ");
        }
        int n; 
        int cnt=0, cnt1=0;
        System.out.println();
        for(int i=0; i<rounds; i++) {
            System.out.print("Enter Your Choice: ");
            n=sc.nextInt();
            int CPU=random.nextInt(0, 3);
            if(CPU==n) {
                System.out.println("Your choice :" + choice.get(n));
                System.out.println("CPU Choice :"+ choice.get(CPU));
                System.out.println("ITS A DRAW!");
            }
            else if(n==0){
                if(CPU==1) {
                    System.out.println("Your choice :" + choice.get(n));
                    System.out.println("CPU Choice :"+ choice.get(CPU));
                    System.out.println("CPU WON!");
                    cnt++;
                    System.out.println("CPU SCORE: "+ cnt);
                }
                else {
                    System.out.println("Your choice :" + choice.get(n));
                    System.out.println("CPU Choice :"+ choice.get(CPU));
                    System.out.println("YOU WON!");
                    cnt1++;
                    System.out.println("CPU SCORE: "+ cnt1);
                }
            }
    
            else if(n==1) {
                if(CPU==2) {
                    System.out.println("Your choice :" + choice.get(n));
                    System.out.println("CPU Choice :"+ choice.get(CPU));
                    System.out.println("CPU WON!");
                    cnt++;
                    System.out.println("CPU SCORE: "+ cnt);
                }
                else {
                    System.out.println("Your choice :" + choice.get(n));
                    System.out.println("CPU Choice :"+ choice.get(CPU));
                    System.out.println("YOU WON!");
                    cnt1++;
                    System.out.println("CPU SCORE: "+ cnt1);
                }
            }
    
            else if(n==2) {
                if(CPU==0) {
                    System.out.println("Your choice :" + choice.get(n));
                    System.out.println("CPU Choice :"+ choice.get(CPU));
                    System.out.println("CPU WON!");
                    cnt++;
                    System.out.println("CPU SCORE: "+ cnt);
                }
                else {
                    System.out.println("Your choice :" + choice.get(n));
                    System.out.println("CPU Choice :"+ choice.get(CPU));
                    System.out.println("YOU WON!");
                    cnt1++;
                    System.out.println("CPU SCORE: "+ cnt1);
                }
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        System.out.println("YOUR SCORE: "+cnt1 + " || " + "CPU'S SCORE: "+cnt);
        char ans;
        System.out.print("Want to replay?(Y/N) ");
        ans=sc.next().charAt(0);
        if(ans=='y' || ans=='Y') {
            rps();
        }
        else {
                System.out.println("GAME OVER");
        }
    }
    public static void main(String[] args) {

        rps();
        // Random random = new Random();
        // ArrayList<String> choice=new ArrayList<String>();
        // Scanner sc=new Scanner(System.in);
        // int rounds;
        // System.out.print("Enter number of rounds: ");
        // rounds=sc.nextInt();
        
        // System.out.println();

        // choice.add("Rock");
        // choice.add("Paper");
        // choice.add("Scissor");
        
        // System.out.print("Choices: ");
        // for(int i=0; i<choice.size(); i++) {
        //     System.out.print((i) + "."+ choice.get(i) + " ");
        // }
        // int n; 
        // int cnt=0, cnt1=0;
        // System.out.println();
        // for(int i=0; i<rounds; i++) {
        //     System.out.print("Enter Your Choice: ");
        //     n=sc.nextInt();
        //     int CPU=random.nextInt(0, 3);
        //     if(CPU==n) {
        //         System.out.println("Your choice :" + choice.get(n));
        //         System.out.println("CPU Choice :"+ choice.get(CPU));
        //         System.out.println("ITS A DRAW!");
        //     }
        //     else if(n==0){
        //         if(CPU==1) {
        //             System.out.println("Your choice :" + choice.get(n));
        //             System.out.println("CPU Choice :"+ choice.get(CPU));
        //             System.out.println("CPU WON!");
        //             cnt++;
        //             System.out.println("CPU SCORE: "+ cnt);
        //         }
        //         else {
        //             System.out.println("Your choice :" + choice.get(n));
        //             System.out.println("CPU Choice :"+ choice.get(CPU));
        //             System.out.println("YOU WON!");
        //             cnt1++;
        //             System.out.println("CPU SCORE: "+ cnt1);
        //         }
        //     }
    
        //     else if(n==1) {
        //         if(CPU==2) {
        //             System.out.println("Your choice :" + choice.get(n));
        //             System.out.println("CPU Choice :"+ choice.get(CPU));
        //             System.out.println("CPU WON!");
        //             cnt++;
        //             System.out.println("CPU SCORE: "+ cnt);
        //         }
        //         else {
        //             System.out.println("Your choice :" + choice.get(n));
        //             System.out.println("CPU Choice :"+ choice.get(CPU));
        //             System.out.println("YOU WON!");
        //             cnt1++;
        //             System.out.println("CPU SCORE: "+ cnt1);
        //         }
        //     }
    
        //     else if(n==2) {
        //         if(CPU==0) {
        //             System.out.println("Your choice :" + choice.get(n));
        //             System.out.println("CPU Choice :"+ choice.get(CPU));
        //             System.out.println("CPU WON!");
        //             cnt++;
        //             System.out.println("CPU SCORE: "+ cnt);
        //         }
        //         else {
        //             System.out.println("Your choice :" + choice.get(n));
        //             System.out.println("CPU Choice :"+ choice.get(CPU));
        //             System.out.println("YOU WON!");
        //             cnt1++;
        //             System.out.println("CPU SCORE: "+ cnt1);
        //         }
        //     }
        //     else{
        //         System.out.println("Invalid Input");
        //     }
        // }
    }
}
