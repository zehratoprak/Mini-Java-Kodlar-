
package sinav;
 
import java.util.Scanner;
 
public class sinav {
 
    public static void main(String[] args) {
        
	System.out.println("Ogrencinin final notunu giriniz");
        Scanner scanner = new Scanner(System.in);
        int puan = scanner.nextInt();
        if (puan >= 50) { 
            System.out.println("Gectin");
        }
        else{
            System.out.println("Kaldin");
            
        }	
    }
}