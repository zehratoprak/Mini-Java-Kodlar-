package sinav;

import java.util.Scanner;

public class sinav {
 
    public static void main(String[] args) {

	System.out.println("Ogrencinin not ortalamasýný giriniz");
            
	Scanner scanner = new Scanner(System.in);
	int not = scanner.nextInt();
	
	if(not>=90 && not<= 100){
	    System.out.println("AA");
	}
        else if(not>=80 && not <= 89){
	    System.out.println("BA");
	}
	else if(not>= 70 && not <= 79){
	    System.out.println("BB");
	}
	else if(not>= 60 && not <=69){
	    System.out.println("CB");
	}
	else if(not >= 0 && not <=59){
	    System.out.println("CC");
        }
        else if(not >= 0 && not <=49.5){
	    System.out.println("FF");
        
	}
    }
}