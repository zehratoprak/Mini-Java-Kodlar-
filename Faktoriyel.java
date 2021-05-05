
package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {

    public static void main(String[] args) {
        int sayi=0;
        int  faktoriyel=1;
        Scanner k= new Scanner(System.in);
        sayi=k.nextInt();
        for(int i=sayi; i>=1; i--){
            faktoriyel=faktoriyel*i;
        }
        System.out.println(faktoriyel);
    }
}
