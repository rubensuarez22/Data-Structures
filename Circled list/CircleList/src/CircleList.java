public class CircleList {

    private char info;
    private CircleList link;
    
    public CircleList() {
        info = '0';
        link = this;                                    // lista vacia
    }
    
    public char getInfo() {
        return info;
    }
    
    public CircleList getLink() {
        return link;
    }
    
    public void insert(char v) {
        CircleList node = new CircleList();            // nuevo elemento
        node.info = v;
        
        node.link = this.link;
        this.link = node;
    }
    
    public CircleList find(char v) {
        CircleList node = this;
        
        do {
            // verificar si es el nodo
            if(node.info == v) {
                return node;
            }
            // pasar al siguiente nodo
            node = node.link;
        } while(node != this);
        
        // el nodo con valor v no estÃ¡ en la lista
        return null;
    }
    
    public CircleList get(int p) {
        // inicializa la bÃºsqueda del nodo en la posiciÃ³n p
        CircleList node = this;
        
        for(int i=0; i <= p-1; i++){
            // pasa al siguiente nodo
            node = node.link;
            
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
        
        // Mientras no sea el nodo buscado
        do {
            // Pasa al siguiente nodo
            pred = node;
            node = node.link;
        } while(node != this && node != e);
        
        // Verifica si el elemento fue encontrado
        if(node == this) {
            throw new Exception("Nodo no encontrado");
        }
        
        // Elimina el nodo X
        pred.link = e.link;                 // equivalente a poner node->link
    }
    
    public void display(String mensaje) {
        
        System.out.println();
        System.out.println(mensaje);
        
        CircleList node = this.link;
        
        for(int i = 0; node != this; i++) {
            System.out.println(i + ": " + node.info);
            node = node.link;
        }
    }
}



