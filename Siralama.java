package javaapplication7;
public class JavaApplication7 {
    private static void siralama(int[] intArray) {

int n = intArray.length;
int x = 0;
 
for(int i=0; i < n; i++){
  for(int j=1; j < (n-i); j++){
 
   if(intArray[j-1]<intArray[j]){
       
      x = intArray[j-1];
      intArray[j-1]= intArray[j];
     intArray[j]= x;
   }
  }
}
    }
}
