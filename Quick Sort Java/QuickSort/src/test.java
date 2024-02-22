public class test {
    
    public static void main(String[] args){

         Person [] v = { 
         new Person("Jose Andres", 20, 180.0f),
         new Person("Daniel", 8, 120.0f),
         new Person("Fernando", 78, 170.0f),
         new Person("Manuel", 12, 170.5f),
         new Person("Luis", 25, 177.0f),
         }
                
         for (Person e:v){
            System.out.println(e+ ",");
         }
                    
                    };
    }
/* 
        for (int e:v){
            System.out.println(e+ ", ");
        }
        System.out.println();
        System.out.println();
        Quicksort.quickSort(v,0,v.length-1);
        System.out.println();
        for (int e:v){
            System.out.println(e+ ", ");
        }
*/
    }
}
