/**
 * main
 */
import java.util.*;
import java.text.MessageFormat;


public class main {
    public static void main(String[] args){
        int [] array = createRandomArray(100);
        /*for (int numero : array) {
            System.out.print(numero+"; ");
        }*/

        //System.out.println(measureTime()+" segundos");
        //System.out.println("Bubble: ");
        //bubbleSort(array);
        printArray(array);
        System.out.println("Counting: ");
        coutingSort(array, array.length);
        System.out.println("Tamanho da array: "+array.length);
        printArray(array);
    }
    public static void printArray(int[]array){
        for (int numero : array) {
            System.out.print(numero+"; ");            
        }
    }

    public static int[] createRandomArray(int tamanho){
        Random random = new Random();
        
        int[] array = new int[tamanho];
        //populando array com numero randomicos
        for(int i = 0; i<array.length;i++){
            int numGen=random.nextInt(tamanho);
            if(numGen==0){
                array[i] = numGen+1;                
            }else{
                array[i] = numGen;
            }
        }
        return array;
    }
    public static long measureTime(){
        long startTime = System.nanoTime();
        createRandomArray(10);
        long endTime = System.nanoTime();
        long total = endTime - startTime;
        return total;
    }
    public static void bubbleSort(int[] numArray) {
        long startTime = System.nanoTime();
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
            long endTime = System.nanoTime();
            long total = (endTime - startTime);
            System.out.println("Demorou "+total );
        }
        public static void coutingSort(int[] a, int m){
            long startTime = System.nanoTime();            
            int n = a.length;
             
            int vetorAuxiliar[] = new int[m];
             
            //1ª - (Inicializar com zero)
            for(int i = 0; i < m; i++){
                vetorAuxiliar[i] = 0;
            }
             
            //2ª - Contagem das ocorrencias
            for(int i = 0; i < n; i++){
                vetorAuxiliar[a[i]]++;
            }
     
            //3ª - Ordenando os indices do vetor auxiliar
            int sum = 0;                
            for(int i = 1; i < m; i++){
                int dum = vetorAuxiliar[i];
                vetorAuxiliar[i] = sum;
                sum += dum;
            }       
            int vetorOrdenado[] = new int[n];
            for(int i = 0; i < n; i++){
                vetorOrdenado[vetorAuxiliar[a[i]]] = a[i];
                vetorAuxiliar[a[i]]++;
            }
             
            //4ª Retornando os valores ordenados para o vetor de entrada
            for (int i = 0; i < n; i++){
                a[i] = vetorOrdenado[i];
            }
            long endTime = System.nanoTime();
            long total = (endTime - startTime);
            System.out.println("Demorou "+total );
        }
}


