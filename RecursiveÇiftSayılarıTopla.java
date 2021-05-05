
package javaapplication36;

public class JavaApplication36 {
    
    public static int bul(int x){
        if(x>=100) return x;
        else return x+bul(x+=2);
}
    public static void main(String[] args) {
        System.out.println(bul(0));
    }
}
