
package javaapplication21;

public class JavaApplication21 {

    public static void main(String[] args) {
        int fib[]=new int[1000];
        fib[0]=1;
        fib[1]=1;
        int toplam;
        for (int i = 0; i < fib.length; i++) {
            toplam=fib[0]+fib[1];
            fib[0]=fib[1];
            fib[1]=toplam;
            System.out.println(fib[1]);
        }
    }
    
}
