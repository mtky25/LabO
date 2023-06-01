import java.util.Arrays;
import java.util.Collections;

public class Sorter <T extends Comparable<T>>{
    public static final int DEFAULT_METODO = 1;
    public static final int QUICKSORT_METODO = 1;
    public static final int MERGESORT_METODO = 2;  

    public void sort(T[] a, int metodo,Boolean decrescente) {

        if(metodo == DEFAULT_METODO || metodo == QUICKSORT_METODO){
            quicksort(a);
            
        
        }
        else if (metodo == MERGESORT_METODO){
            mergesort(a);
        }    
        
        if(decrescente == true){
            inverte(a);
        }
    }

    public void quicksort(T[] a){
        GenericQuicksort quicksort = new GenericQuicksort<>();
        quicksort.sort(a);

        
    }

    public void mergesort(T[] a){
        GenericMergesort mergesort = new GenericMergesort<>();
        mergesort.sort(a);


    }

    public void inverte(T[] a){
        
        Collections.reverse(Arrays.asList(a));
        /*for (int i = 0; i < (a.length/2); i++){
            T aux = a[i];
            a[i] = a[a.length -(1+i)];
            a[a.length - (1+1)] = aux;
        }
*/
    }


    public void print(T[] ordenado){
        for(int i = 0; i < ordenado.length; i++){
            System.out.println(ordenado[i]);
        }
    }
}