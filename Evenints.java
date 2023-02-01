public class Evenints {
    public static void main(String[] args) {
        int[] arr={1,3,5};
        int cnt=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==0) {
                cnt++;
            }
        }

        System.out.println("Number of even ints: "+ cnt);
    }
}
