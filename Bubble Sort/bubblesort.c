#include <stdio.h>
#include <stdlib.h>

#define SUCCESS 1

void bubble_sort(int arr[], int size)
{
  int j;
  int i;
  int pivot;
  for (j = 1; j < size; j++)
  {
    pivot = arr[j];
    i = j - 1;

    while (i >= 0 && arr[i] < pivot)
    { // if < pivot then + -> - , if > pivot then - -> +
      arr[i + 1] = arr[i];
      i = i - 1;
    }
    arr[i + 1] = pivot;
  }
}

void printArray(int array[], int size)
{
  printf("[");
  for (int i = 0; i < size; ++i)
  {
    printf(" %d ", array[i]);
  }
   printf("] \n ");
}

void SelSort(int array[], int n)
{
  int i, j, position, swap;
  for (i = 0; i < (n - 1); i++)
  {
    position = i;
    for (j = i + 1; j < n; j++)
    {
      if (array[position] > array[j])
        position = j;
    }
    if (position != i)
    {
      swap = array[i];
      array[i] = array[position];
      array[position] = swap;
    }
  }
}

void seqsearch(int array[], int n)
{
  printf("\n Numero a buscar : ");
  scanf("%d", &n);
  int i;
  int comprobador;
  int posicion;
  for (i = 0; i < 10; i++)
  {
    if (n == array[i])

      comprobador = 1;
  }
  if (comprobador == 1)
    printf("\nEl numero %d esta dentro del arreglo ", n);
  else
    printf("\n El numero %d no esta dentro del arreglo", n);
}

int binarySearch(int a[], int menor, int mayor, int num)    
{    
    int mitad;    
    if(mayor >= menor)     
    {        mitad = (menor + mayor)/2;    
      if(a[mitad] == num)    
        {                 
          return mitad+1;    
        }    
        else if(a[mitad] < num)     
        {  
            return binarySearch(a, mitad+1, mayor, num);    
        }    
        else     
        {  
         return binarySearch(a, menor, mitad-1, num);    
        }          
    }    
    return -1;     
}   



int main()

{

  int A[] = {8, 10, 3, 4, 3, 5,9};

  int size = sizeof(A) / sizeof(A[0]);

  /*
  int last = size-1;
  int mitaddle = (0+last)/2;*/
  
  //printf("aaa %d", mitaddle);
  // bubble_sort(A, size);
  // seqsearch(A, size);



 int n = 4;
 SelSort(A, size);
 int res = binarySearch(A, 0, size-1, n);
  printf("\nNumero a buscar %d", n);  
  if (res == -1)  
  printf("\nEl numero no se encuentra en el arreglo");  
  else  
  printf("\nEl numero se encuentra en la posicion %d del arreglo \n", res); 

  printArray(A, size); 
 //*/


  return SUCCESS;
}