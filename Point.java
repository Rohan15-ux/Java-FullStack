import java.util.*;
class Point {
    int x,y,dis=0;
    public Point(int a,int b){
        this.x=a;
        this.y=b;
    }

    public void points(){
        System.out.println("("+ x +","+ y +")");
        System.out.println("Distance"+ dis);
    }

    public static Point distance(Point p1, Point p2){
        Point res=new Point(0,0);

        res.x=(int)Math.pow((p2.x-p1.x),2);
        res.y=(int)Math.pow((p2.y-p1.y),2);

        res.dis=(int)Math.pow(res.x+res.y,0.5);

        return res;

    }


    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     int x,y,x1,y1;
    //     x=sc.nextInt();
    //     y=sc.nextInt();
    //     x1=sc.nextInt();
    //     y1=sc.nextInt();

    //     Point c1=new Point(x,y);
    //     // c1.points();
    //     Point c2=new Point(x1,y1);
    //     // c2.points();

    //     Point c3=distance(c1,c2);
    //     c3.points();
    // }
}

class Stline extends Point{
    int slope;
    public Stline(int a) {
        super(a, a);
        this.slope=a;
    }

    public void show(){
        System.out.println("Slope: "+slope);
    }

    public static Stline msl(Point p1,Point p2) {

        Stline res=new Stline(0);

        res.slope=(p2.y-p1.y)/(p2.x-p1.x);
        return res;
    }

    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int x,y,x1,y1;
            x=sc.nextInt();
            y=sc.nextInt();
            x1=sc.nextInt();
            y1=sc.nextInt();
    
            Point c1=new Point(x,y);
            // c1.points();
            Point c2=new Point(x1,y1);
            // c2.points();
    
            Point c3=distance(c1,c2);
            c3.points();

            Stline c4=msl(c1,c2);
            c4.show();
        }
}
