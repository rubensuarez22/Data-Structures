
public class elmain {
    public static void main(String[] args) throws Exception {

    
        CircleLista list = new CircleLista();
    
        list.insert('E');
        list.insert ('D');
        list.insert('C');
        list.insert ('B');
        list.insert ('A');
        list.display("Lista:");
    
        CircleLista result = list.find('C');
        System.out.println(result.getInfo());
        
        result = list.get(2);
        System.out.println(result.getInfo());

        list.delete(list.find('C'));
        list.display("Lista:");
    
        list.delete(list.find('A'));
        list.display("Lista:");
    
        list.delete(list.find('E'));
        list.display("Lista:");
    }
}
