import java.util.*;
class Stack {

    private int[] arr;
    private int len;
    private int maxlen;

    Stack(int a) {
        this.maxlen=a;
        arr=new int[maxlen];
        this.len=0;
    }

    int getlen() {
        return len;
    }
    
    void display() {
        for(int i=0; i<len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void push(int e) {
        if(len<maxlen) {
            arr[len]=e;
            this.len++;
        }
        else {
            System.out.println("Stack Overflow!");
        }
    }

    void pop() {
        int [] array=new int[maxlen];
        if(arr!=null) {

            for(int i=0; i<len-1; i++) {
                array[i]=arr[i];
            }
            len--;
        }
        else {
            System.out.println("Stack is empty");
        }
    }
    
    void clear() {
        arr=null;
        len=0;
    }

    public static void main(String[] args) {
        Stack s1=new Stack(5);
        // System.out.println(s1);
        s1.getlen();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.display();
        System.out.println();
        System.out.println(s1.getlen());

        s1.pop();
        s1.display();
        System.out.println();
        System.out.println(s1.getlen());

        s1.clear();
        System.out.println(s1.getlen());
    }
}
