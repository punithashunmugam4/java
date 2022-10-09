package Graph;

public class Print {
	public static void main(String []args) {
		Graph obj=new Graph(5);
		obj.addEdge(1,2,8);
		obj.addEdge(1,3,6);
		obj.addEdge(0,3,7);
		obj.addEdge(3,4,12);
		obj.addEdge(2,4,18);
		obj.printGraph();
	}
}
