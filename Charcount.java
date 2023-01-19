import java.util.*;
// import java.lang.*;
public class Charcount {
    public static void main(String[] args) {
        String str;  
        int arr[] = new int[256]; 

        Scanner sc = new Scanner(System.in);  

        System.out.print("Please enter a string: ");  
        
        str = sc.nextLine();  
         
        int n = str.length(); 
        String str1=str.toLowerCase();
        
        for (int i = 0; i < n; i++){  
            arr[(int) str1.charAt(i)]++;  
        }  
        
        for (int i = 0; i < 127; i++){  
            if (arr[i] != 0){
                System.out.println((char) i + " = " + arr[i]); 
            } 
        }  
    }
}
