public class elmain 
{
    public static void main(String[] args) throws Exception 
    {

    
        CircleList list = new CircleList();
    
        list.insert('E');
        list.insert ('D');
        list.insert('C');
        list.insert ('B');
        list.insert ('A');
        list.insertAfter (list, 'X');
        
        list.display("Lista:");
        






       // list.copy(list);
//list.insend ('J');
    //copy.insert(list);


    }

}
