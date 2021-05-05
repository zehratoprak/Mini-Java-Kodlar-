
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
        int sayi=0;
        int enbuyuk=0;
        Scanner k=new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            sayi=k.nextInt();
            if(sayi>enbuyuk){
                enbuyuk=sayi;
            }
            
        }
        System.out.println(enbuyuk);
    }
    
}
