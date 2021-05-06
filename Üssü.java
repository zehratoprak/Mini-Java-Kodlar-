import java.util.Scanner;
public class Us{
	public static void main(String[] args) {
		System.out.println("Bir tamsayi ve kuvvet giriniz:");
		Scanner scanner = new Scanner(System.in);
		int tamsayi = scanner.nextInt();
		int kuvvet = scanner.nextInt();
		System.out.println("sonuc= "+ calcPower(tamsayi, kuvvet));
	}
        
	public static int calcPower(int numara, int kuvvet) {
		int sonuc=1;
		for(int i=1;i<=kuvvet;i++) {
			sonuc= sonuc * numara;
		}
		return sonuc;
    }
}