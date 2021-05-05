
package javaapplication20;

public class JavaApplication20 {

    public static void main(String[] args) {
        int dizi[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<dizi.length; i++){
            if(2%dizi[i]!=0){
            } else {
                System.out.println(dizi[i]+"cift");
            }
            if(dizi[i]%2!=0){
                System.out.println(dizi[i]+"tek");
            }
        }
    }
    
}
