public class CircleList {

    private char info;
    private CircleList before;
    private CircleList after;
    
    
    public CircleList() {

        info = '0';
        before = this; 
        after = this;
        // lista vacia
    }
    
    public char getInfo() {
        return info;
    }
    
    //private CircleList root;

    public CircleList getLLink() {
        return before;
    }
    
    public CircleList getRLink() {
        return after;
    }



    public void insert(char v) {
        CircleList node = new CircleList();            // nuevo elemento
        node.info = v;

        node.before = this.before;
        node.after = this.after;

        this.before = node;
        this.after = node;
    }

    public  void insend( char v) {
        CircleList node= new CircleList();
        node.info = v;
        CircleList end = this;
        //node.before;
        
            this.after = node;
            this.before = end;
            this.before = node;
            end.after = node;
            //this.node = node;
    }

    void insertAfter(CircleList nodo, char v)
    {
    CircleList new_node = new CircleList();
    new_node.info = v; // Inserting the info
 
    // Find node having value2 and next node of it
    CircleList temp = this;
    while (temp.info != new_node.info)
        temp = temp.after;
    CircleList next = temp.after;
 
    // insert new_node between temp and next.
    temp.after = new_node;
    new_node.before = temp;
    new_node.after = next;
    next.before = new_node;
}
    
    public CircleList find(char v) {
        CircleList node = this.before;
        
        do {
            // verificar si es el nodo
            if(node.info == v) {
                return node;
            }
            // pasar al siguiente nodo
            node = node.before;
        } while(node != this);
        
        // el nodo con valor v no estÃ¡ en la lista
        return null;
    }
    
    public CircleList get(int p) {
        // inicializa la bÃºsqueda del nodo en la posiciÃ³n p
        CircleList node = this.before;
        
        for(int i=0; i <= p-1; i++){
            // pasa al siguiente nodo
            node = node.before;
            
            // verifica si hay mÃ¡s nodos
            if(node == this) {
                return null;
            }
        }
        
        // regresa el nodo en la posiciÃ³n P
        return node;
    }
    
    public void delete(CircleList e) throws Exception {
        
        // Inicializa la bÃºsqueda del nodo e
        CircleList node = this, pred = this;
        do{
            pred = node;
            node = node.before;

        }while (node != this && node !=e);
        
        if (node ==this ){
            throw new Exception ("Nodo no encontrado");
        }
        pred.before = e.before;  
        pred.after = e.after;
    
    }

    public CircleList copy(CircleList nodo) {
        CircleList nodoCopia = nodo;
        return nodoCopia;
    }



    public void display(String mensaje) {
        
        System.out.println();
        System.out.println(mensaje);
        
        CircleList node = this.before;
        
        for(int i = 0; node != this; i++) {
            System.out.println(i + ": " + node.info);
            node = node.before;
        }
    }

}

