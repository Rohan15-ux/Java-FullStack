public class Questions {

    static void summ(int[] arr, int sum){
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }

        System.out.println("Sum of array: " + sum);
    }

    static void maxele(int[] arr, int max){
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Maximum ele: " + max);
    }

    static void minele(int[] arr, int min){
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Minimum ele: " + min);
    }

    public static void main(String[] args) {
        int[] arr={2,6,4,9,5,3};
        int max=arr[0];
        int min=arr[0];
        int sum=0;

        summ(arr, sum);
        maxele(arr, max);
        minele(arr,min);
    }
}
