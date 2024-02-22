public class CircleLista {

    private char info;
    private CircleLista Llink;
    private CircleLista Rlink;

    public CircleLista() {
        info = '0';
        Rlink = this;
        Llink = this;                                    // lista vacia
    }
    
    public char getInfo() {
        return info;
    }
    
    public CircleLista getLLink() {
        return Llink;
    }
    
    public CircleLista getRLink() {
        return Rlink;
    }



    public void insert(char v) {
        CircleLista node = new CircleLista();            // nuevo elemento
        node.info = v;

        node.Llink = this.Llink;
        node.Rlink = this.Rlink;

        this.Llink = node;
        this.Rlink = node;
    }

    
    public CircleLista find(char v) {
        CircleLista node = this.Llink;
        
        do {
            // verificar si es el nodo
            if(node.info == v) {
                return node;
            }
            // pasar al siguiente nodo
            node = node.Llink;
        } while(node != this);
        
        // el nodo con valor v no estÃ¡ en la lista
        return null;
    }
    
    public CircleLista get(int p) {
        // inicializa la bÃºsqueda del nodo en la posiciÃ³n p
        CircleLista node = this.Llink;
        
        for(int i=0; i <= p-1; i++){
            // pasa al siguiente nodo
            node = node.Llink;
            
            // verifica si hay mÃ¡s nodos
            if(node == this) {
                return null;
            }
        }
        
        // regresa el nodo en la posiciÃ³n P
        return node;
    }
    
    public void delete(CircleLista e) throws Exception {
        
        // Inicializa la bÃºsqueda del nodo e
        CircleLista node = this, pred = this;
        do{
            pred = node;
            node = node.Llink;

        }while (node != this && node !=e);
        
        if (node ==this ){
            throw new Exception ("Nodo no encontrado");
        }
        pred.Llink = e.Llink;  
        pred.Rlink = e.Rlink;
    
    }



    public void display(String mensaje) {
        
        System.out.println();
        System.out.println(mensaje);
        
        CircleLista node = this.Llink;
        
        for(int i = 0; node != this; i++) {
            System.out.println(i + ": " + node.info);
            node = node.Llink;
        }
    }

}

