public class GenericMergesort <T extends Comparable<T>>{

    public void sort(Comparable[] a) {
        mergesort (a, 0, a.length - 1);
    }
    
    private void mergesort(Comparable[] a, int i, int j) {
        if (j <= i) return; /* already sorted */ 
        int midpoint = (i+j)/2;
        mergesort(a, i, midpoint);
        mergesort(a, midpoint+1, j);
        merge(a, i, midpoint, j);
    }
    
    private void merge(Comparable[] a, int start, int mid, int end) {
        Comparable[] aux = new Comparable[end-start+1];
        int i = start, j = mid+1, k = 0;
        while (i <= mid && j <= end) {
            if (a[i].compareTo(a[j]) <= 0) {
                aux[k++] = a[i++];
            } else {
                aux[k++] = a[j++];
            }
        }
        while (i <= mid) {
            aux[k++] = a[i++];
        }
        while (j <= end) {
            aux[k++] = a[j++];
        }
        for (i = start; i <= end; i++)
            a[i] = aux[i-start];
    }

    public static void main(String[] args)
    {
        Integer[] inteiros = {34, 5, 3, 7, 2, 0, 6, 3, -10, 34, 5, 8};
        Double [] reais = {33.2,33.4,0.1,0.4};
        String [] palavras = {"a","b","e","h","j","f","s","e","t"};

        GenericMergesort<Integer> sorterI = new GenericMergesort<Integer>();
        GenericMergesort<Double> sorterDb = new GenericMergesort<Double>();
        GenericMergesort<String> sorterSt = new GenericMergesort<String>();

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