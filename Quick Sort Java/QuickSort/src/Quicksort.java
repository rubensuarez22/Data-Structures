public class Quicksort {

    private static void swap (int[] array, int i, int j ){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int partition( int[ ] array, int left, int right ) {
        int i = left, j = right;
        int pivot = array[ (left + right) / 2 ];
        while( i <= j ) {
        while( array[i] < pivot ) i ++; // o for( ; array[i] < pivot ; i++)
        while( array[j] > pivot ) j --; // o for( ; array[i] > pivot ; j--)
        if( i <= j ) { swap ( array, i ++, j -- );}
        }
        return i;
        }


    public static void quickSort( int[ ] array, int left, int right ) {
        int index = partition( array, left, right );
        if( left < index - 1 )
        quickSort( array, left, index-1 );
        if( index < right )
        quickSort( array, index, right );
        }
    }
