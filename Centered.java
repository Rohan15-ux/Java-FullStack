public class Centered {
    public static void main(String[] args) {
        int[]arr={-10,-4,-2,-4,-2,0};
        int max=arr[0],min=arr[0],sum=0,cnt=0;

        for(int i=0; i<arr.length; i++) {
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
            sum+=arr[i];
            cnt++;
        }

        System.out.println((sum-(min+max))/(cnt-2));
    }
}
