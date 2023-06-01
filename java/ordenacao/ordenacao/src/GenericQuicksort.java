
public class GenericQuicksort <T extends Comparable<T>>{

    public void sort(Comparable[] a) {
        quicksort (a, 0, a.length - 1);
    }
    
    private void quicksort(Comparable[] a, int i, int j) {
        if (i>=j) return;

        int pivot = partition(a, i, j);

        quicksort(a, i, pivot-1);
        quicksort(a, pivot+1, j);
    }
    
    private int partition(Comparable[] array, int start, int end) {
        Comparable pivot = array[end];
        int balancePoint = start;
        System.out.println(array.getClass()); 



        for (int i = start; i < end; i++) 
            if(array[i].compareTo(pivot) <= 0) {
                Comparable tmp = array[i];
                array[i] = array[balancePoint];
                array[balancePoint] = tmp;
                balancePoint++;
        }

        Comparable tmp = array[end];
        array[end] = array[balancePoint];
        array[balancePoint] = tmp;

        return balancePoint;
    }

    public static void main(String[] args)
    {
        Integer[] inteiros = {34, 5, 3, 7, 2, 0, 6, 3, -10, 34, 5, 8};
        Double [] reais = {33.2,33.4,0.1,0.4};
        String [] palavras = {"a","b","e","h","j","f","s","e","t"};

        GenericQuicksort<Integer> sorterI = new GenericQuicksort<Integer>();
        GenericQuicksort<Double> sorterDb = new GenericQuicksort<Double>();
        GenericQuicksort<String> sorterSt = new GenericQuicksort<String>();

        sorterI.sort(inteiros);
        sorterDb.sort(reais);
        sorterSt.sort(palavras);


        for (int elem : inteiros)
            System.out.print(elem + " ");
        
        System.out.println();

        for (double elem : reais)
            System.out.print(elem + " ");

        System.out.println();    

        for (String elem : palavras)
            System.out.print(elem + " ");

    }
}


