
package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
      int dizi[]=new int[10];
      dizi[0]=1;
      dizi[1]=1;
        System.out.print(dizi[0]+ " "+ dizi[1]);
        for(int i=2;i<=dizi.length;i++){
            dizi[i]=dizi[i-2]+dizi[i-1];
            System.out.print(" "+ dizi[i]);
        }
    }
    
}
