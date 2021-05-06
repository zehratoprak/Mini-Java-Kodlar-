import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class dikdortgen {
 
 public static void main(String[] args) {

 int genislik= 0;
 int yukseklik= 0;
 
 try{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Dikdortgenin yuksekligini giriniz");
 yukseklik = Integer.parseInt(br.readLine());
 
 System.out.println("Dikdortgenin genisligini giriniz");
 genislik = Integer.parseInt(br.readLine());

 }
 catch(NumberFormatException ne){
 System.out.println("Gecersiz karakter" + ne);
 System.exit(0);
 }
 
 catch(IOException ioe){
 System.out.println("Hata" + ioe);
 System.exit(0);
 }
 int alan = yukseklik*genislik;
 System.out.println("Dikdortgenin alani: " + alan);
 
 int cevre = 2*(genislik+yukseklik);
 System.out.println("Dikdortgenin cevresi: " + cevre);
 
 }
}