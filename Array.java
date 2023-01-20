import java.util.*;
public class Array {

    public static int Add(int[][][] array){
        int sum=0;
        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                for(int k=0; k<3; k++) {
                    sum+=array[i][j][k];
                }
            }
        }

        return sum;
    }

    public static void Transpose(int[][][] array) {
        System.out.println("Transposed Matrix");
        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                for(int k=0; k<3; k++) {
                    System.out.print(array[i][k][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[][][] array = new int[2][3][3];
        Scanner sc=new Scanner(System.in);

        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                for(int k=0; k<3; k++) {
                    System.out.print("Enter Element: ");
                    array[i][j][k]=sc.nextInt();
                }
            }
        }

        System.out.println();

        System.out.println("The sum of all elements is " + Add(array));
        System.out.println();
        System.out.println("Before Tansposing: ");

        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                for(int k=0; k<3; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
        Transpose(array);
        // Subtract(array);
        // Multiplication(array);
    }
}
