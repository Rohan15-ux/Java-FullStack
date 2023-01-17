public class ArrayShift {
    public static void main(String [] args) {
        int[] arr={3,7,5,1,6,8,13,14,9};
        int f=arr[0];

        for(int i=1; i<arr.length; i++) {
            arr[i-1]=arr[i];
        }

        arr[(arr.length)-1]=f;

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    } 
}
