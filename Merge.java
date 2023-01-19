import java.util.*;

public class Merge {
    public static void main(String [] args) {
        ArrayList<String> l1=new ArrayList<String>();

        l1.add("Rohan");
        l1.add("Rimpi");
        l1.add("Rishav");
        l1.add("Rinsina");

        System.out.print(l1);

        ArrayList<String> l2=new ArrayList<String>();

        l2.add("Chetry");
        l2.add("Singh");
        l2.add("Verma");
        l2.add("Agarwal");

        System.out.print(l2);
        
        l1.addAll(l2);

        System.out.print(l1);
        
    }
}
