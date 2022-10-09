package Graph;
import java.io.*; // for handling input/output
import java.util.*; 

public class CycleDetctionTopological {
		public static boolean topologicalSorting(List<List<Integer>> adj,int v) {
			int indegree[]=new int[v+1];
			int index=0,count=0;
			for(int i=0;i<=v;i++) {
				for(Integer it:adj.get(i))
				indegree[it]++;
			}
	    int sum=0;
	    for(int i=0;i<=v;i++) sum+=indegree[i];
			if(sum>=v) return false;
	        else return true;
		}
	public static void main(String []args) {
//		Scanner sc=new Scanner(System.in);
//		int v=sc.nextInt();
//		int e=sc.nextInt();
//		List<List<Integer>> adj=new ArrayList<>();
//		for(int i=0;i<=v;i++) {
//			adj.add(new ArrayList<>());
//		}
//		// topological sorting is done only in direct and Acyclic graph DAG
//		for(int i=0;i<e;i++) {
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			adj.get(a).add(b);
//		}
		int v=5;
		List<List<Integer>> adjList=new ArrayList<>();
		for(int i=0;i<=v;i++)
		adjList.add(new ArrayList<>());
		//diected graph
		adjList.get(1).add(2);
		adjList.get(2).add(3);
		adjList.get(3).add(4);
		adjList.get(4).add(5);
//		adjList.get(4).add(1);
		
		System.out.println(topologicalSorting(adjList,v));
	}

	}
