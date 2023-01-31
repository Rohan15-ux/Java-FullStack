public class Evenspaced {
    public static void main(String[] args){
        int a=4,b=6,c=2;
        int max=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;

        if(a>b && a>c) {
            if(b>c) {
                max3=c;
                max2=b;
                max=a;
            }
            else {
                max3=b;
                max2=c;
                max=a;
            }
        }

        if(b>a && b>c) {
            if(a>c) {
                max3=c;
                
                max2=a;
                max=b;
            }
            else {
                max3=a;
                max2=c;
                max=b;
            }
        }

        if(c>b && c>a) {
            if(b>a) {
                max3=a;
                max2=b;
                max=c;
            }
            else {
                max3=b;
                max2=a;
                max=c;
            }
        }

        if((max-max2)==(max2-max3)) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
