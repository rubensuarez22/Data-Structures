/*
 *  encabezados del programa
 */

#include <stdio.h>
#include <stdlib.h>

#define SUCCESS 1           // la funcion main termina con Ã©xito

typedef struct node {
    char info;
    struct node * link;
    struct node * random;
    int info2;
} NODE;


/*
 *  crea un nodo de lista
 */

NODE * new(char v) {
    
    NODE * node = (NODE *) malloc(sizeof(NODE));        // obtiene el siguiente nodo en el HEAP
    
    if(node == NULL) {
        printf("ERROR: No hay memoria disponible\n");
        exit(1);                                        // abandonamos el programa!
        
    } else {
        node->info = v;                                 // inicializa y liga el nuevo nodo
        return node;
    }
}


/*
 *  crea el primer nodo de una lista
 */

NODE * create_list() {
    
    NODE * node = new('0');                             // elemento HEAD
    node->link = node;                                  // la cabeza se apunta a si misma
    
    return node;
}


void insert(NODE * l, char v) {
    
    NODE * node = new(v);                               // nuevo nodo
    node->link = l->link;                               // lo inserta como primer elemento
    l->link = node;
}

void insend(NODE * l, char v) {
    
    NODE *node = new(v);
    NODE *temp ;
        node->info = v;

         temp = l;
        while(temp->link != l)
        {
         temp = temp->link;
        }
        temp->link = node;
        node->link = l;
        }
        



NODE * copy(NODE *l)
{

NODE *node = l ;
NODE *copy;

copy->link = NULL;
while(node !=NULL)
{
    copy->info = node->info;
    copy->link = node->link;

    copy = copy->link;
    node = node->link;
}
return copy;

}


NODE * find(NODE * l, char v) {

    // inicializa la bÃºsqueda del nodo con el valor v
    NODE * node = l->link;                              // saltar el nodo cabeza
    
    while(node != l) {
        // verificar si es el nodo
        if(node->info == v) {
            return node;
        }
        // pasar al siguiente nodo
        node = node->link;
    }
    
    // el nodo con valor v no estÃ¡ en la lista
    return NULL;
}


NODE * get(NODE * l, int p) {
    
    // inicializa la bÃºsqueda del nodo en la posiciÃ³n p
    NODE * node = l->link;                              // saltar el nodo cabeza
    
    for(int i=0; i <= p-1; i++){
        // verifica si hay mÃ¡s nodos
        if(node == l) {
            return NULL;
        }
        
        // pasa al siguiente nodo
        node = node->link;
    }
    
    // regresa el nodo en la posiciÃ³n P
    return node;
}


void delete(NODE * l, NODE * e) {

    // Â¿Lista vacÃ­a?
    if(l == l->link) {
        printf("Lista vacía\n");
        return;
    }
    
    // Inicializa la bÃºsqueda del nodo X
    NODE * node = l->link, * pred = l;

    // Mientras no sea el nodo buscado
    while(node != l && node != e) {
        // Pasa al siguiente nodo
        pred = node;
        node = node->link;
    }
    
    // Verifica si el elemento fue encontrado
    if(node == l) {
        printf("Nodo no encontrado\n");
        
    } else {
        
        // Elimina el nodo X
        pred->link = e->link;                              // equivalente a poner node->link
    
        // Regresa el nodo a memoria libre del SO
        free(e);                                           // tambiÃ©n podemos pasar la variable node!
    }
}


void display(NODE * l, char * message) {
    
    NODE * node = l->link;                                 // saltar el nodo cabeza
    printf("\n%s\n", message);
    
    while(node != l) {
        printf("El valor del elemento es: %c\n", node->info);
        printf("La direccion es: %p\n", l);
        printf("La direccion es: %p\n", node);

        node = node->link;
    }
}

void displayCopy(NODE *l, char * message)
{
    //NODE * asd = new("a");
    NODE * copy = l->link;                                 // saltar el nodo cabeza
    printf("\n%s\n", message);
    
    while(copy != l) {
        printf("El valor del elemento es: %c\n", copy->info);
        printf("La direccion es: %p\n", l);
        printf("La direccion es: %p\n", copy);

        copy = copy->link;
    }
}

    

int main()
{
    //copy2(head);    
    NODE * list = create_list();                       // lista vacia
    
    insert(list, 'D');
    insert(list, 'C');
    insert(list, 'B');
    insert(list, 'A');
    insend(list, 'L');
    insend(list, 'A');
    insend(list, 'S');
    insend(list, 'T');

    display(list, "Lista");
    displayCopy(list, "copy");
    
    NODE * e = get(list, 0);

    printf("Dirección del elemento: %p\n", e);
    if(e != NULL) {
        printf("El valor del elemento es: %c\n", e->info);
    }
    
    e = get(list, 3);
    printf("Dirección del elemento: %p\n", e);
    
    if(e != NULL) {
        printf("El valor del elemento es: %c\n", e->info);
    }

    printf("Dirección del elemento: %p\n", e);
    
    delete(list,find(list, 'A'));
    display(list, "Imprimir todos los valores despuÃ©s de borrar A");
    
    delete(list,find(list, 'F'));
    display(list, "Imprimir todos los valores despuÃ©s de borrar F");
    
    delete(list,find(list, 'L'));
    display(list, "Imprimir todos los valores despuÃ©s de borrar L");
    
    printf("\nTamaño de un nodo: %li\n", sizeof(NODE));                    // 16 bytes
    printf("Tamaño de un nodo: %li\n", sizeof(NODE *));                  //  8 bytes
    printf("Tamaño de un nodo: %li\n", sizeof(struct node *));           //  8 bytes





    

    
    
    return SUCCESS;             // regresa el control al sistema operativo!
}