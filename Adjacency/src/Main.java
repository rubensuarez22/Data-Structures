public class Main {

	public static void main(String[] args) {
		
		Graph graph = new Graph(9);
		
		graph.addNode(new Node('J'));
		graph.addNode(new Node('H'));
		graph.addNode(new Node('L'));
		graph.addNode(new Node('G'));
		graph.addNode(new Node('I'));
		graph.addNode(new Node('K'));
		graph.addNode(new Node('N'));
		graph.addNode(new Node('M'));
		graph.addNode(new Node('O'));
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
        graph.addEdge(1, 3); 
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(2, 6);
		graph.addEdge(6, 7);
		graph.addEdge(6, 8);

		
		graph.print();
		
	}
}
