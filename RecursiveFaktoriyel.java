
package javaapplication37;

public class JavaApplication37 {

    
    public static int fak(int x){
        if(x<=2) return 2;
        else
            return x*fak(x-1);
    }
    public static void main(String[] args) {
        System.out.println(fak(6));
    }
}    
