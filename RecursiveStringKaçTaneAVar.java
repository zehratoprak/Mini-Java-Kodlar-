
package javaapplication38;

public class JavaApplication38 {

    public static void main(String[] args) {
        goster("Zehra", Zehra.lenght(),0);
        System.out.println(sayac);
    }
        public static int sayac=0;
        public static void goster(String s, int boy, int i){
            if(i>=boy) System.exit(0);
            if(s.charAt(i)=='a'){
                sayac++;
            }
            goster(s, boy, i++);
        }
}
        