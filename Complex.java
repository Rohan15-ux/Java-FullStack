import java.util.*;
class Complex {
    int real,img;
    public Complex (int a, int b) {
        this.real=a;
        this.img=b;
    }

    public void show() {
        System.out.println(real + " + i" + img);
    }
    
    public static Complex add(Complex o1, Complex o2) {
        Complex res = new Complex(0,0); 
  
        // adding real parts of both complex numbers
        res.real = o1.real + o2.real;
        
        // adding imaginary parts
        res.img = o1.img + o2.img;

        return res;
    }
    
    public static Complex subtract (Complex o1, Complex o2) {
        Complex res = new Complex(0,0); 
  
        // adding real parts of both complex numbers
        res.real = o1.real - o2.real;
        
        // adding imaginary parts
        res.img = o1.img - o2.img;

        return res;
    }

    public static Complex multiply (Complex o1, Complex o2) {
        Complex res = new Complex(0,0); 
  
        // adding real parts of both complex numbers
        res.real = (o1.real*(o2.real)) - (o1.img*(o2.img));
        
        // adding imaginary parts
        res.img = (o1.real*(o2.img)) + (o1.img*(o2.real));

        return res;
    }

    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int real,img,real2,img2;
        real=sc.nextInt();
        img=sc.nextInt();
        real2=sc.nextInt();
        img2=sc.nextInt();

        Complex c1=new Complex(real,img);
        c1.show();
        Complex c2=new Complex(real2,img2);
        c2.show();

        Complex c3 = add(c1,c2);
        c3.show();

        c3=subtract(c1, c2);
        c3.show();

        c3=multiply(c1, c2);
        c3.show();

    }
}
