public class Maxmin {
    public static void main(String[] args) {
        int[] array={7,2,10,9};
        int max=array[0],min=array[0];

        for(int i=0; i<array.length; i++) {
            max=Math.max(max, array[i]);
            min=Math.min(min, array[i]);
        }

        System.out.println("The difference is: " + (max-min));
    }
}
