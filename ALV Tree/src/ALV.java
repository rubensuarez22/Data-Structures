public class ALV {

        private ALV left;
        private ALV right;
        private String value;
    
        public ALV(String value )
        {
            this.value = value;
        }
    
    
            public ALV( String value, ALV left, ALV right) 
            {
            
                this.value = value;
                this.left = left;
                this.right = right;
            }
            static ALV print_preordered(ALV root)
            { 
                if (root == null)
                {
                    return root;
                }
                    //Preorder - 1. ROOT 2. LEFT 3. RIGHT 
                    System.out.println(root.value + "");
                    print_preordered(root.left);
                    return print_preordered(root.right);
            }   

            static ALV rightrotation(ALV root)
            { 
               //Comprar si la izquierda esta desbalanceado de la dererecha o viceversa if ()


               
                return print_preordered(root.right);
            }
        
}
