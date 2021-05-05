
package javaapplication40;

public class JavaApplication40 {
    public static int sayiyazdir(int sayi){
        if(sayi==10){
            System.out.println(sayi);
            return sayi;
        }
        else{
            System.out.println(sayi);
            return sayiyazdir(sayi+1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sayiyazdir(1));
        }
    }
   
