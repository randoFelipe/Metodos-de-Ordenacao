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
}


