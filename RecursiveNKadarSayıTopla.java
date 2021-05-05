
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {
    public static int toplam(int sayi){
        if (sayi==1){
            return 1;
        }
        else{
            return sayi+toplam(sayi-1);
        }
    }
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int sayi=k.nextInt();
        System.out.println(+toplam(sayi));
    }
}
