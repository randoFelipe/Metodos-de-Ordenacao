/**
 * main
 */
import java.util.*;
import java.text.MessageFormat;


public class main {
    public static void main(String[] args){
        int [] array = createRandomArray();
        /*for (int numero : array) {
            System.out.print(numero+"; ");
        }*/
        
        System.out.println(measureTime()+" segundos");
    }

    public static int[] createRandomArray(){
        Random random = new Random();
        int[] array = new int[50000];
        //populando array com numero randomicos
        for(int i = 0; i< array.length;i++){
           array[i] = random.nextInt(50000);
        }
        return array;
    }
    public static long measureTime(){
        long startTime = System.nanoTime();
        createRandomArray();
        long endTime = System.nanoTime();
        long total = endTime - startTime;
        return total;
    }
    public static void bubbleSort(int[] numArray) {
        
        int n = numArray.length;
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
        
                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                    }
        
                }
            }
        }
}


