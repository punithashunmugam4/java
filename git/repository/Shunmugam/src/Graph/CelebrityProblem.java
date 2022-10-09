package Graph;

public class CelebrityProblem {
	public static int findCelebrity(int n,int matrix[][]) {
		int indegree[]=new int[n];
		int outdegree[]=new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				indegree[j]+=matrix[i][j];
				outdegree[i]+=matrix[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			if(indegree[i]==n-1 && outdegree[i]==0) {
				return i;
			}
		}
		return -1;
	}
	 public static void main(String[] args)
	  {
	    int n = 4;
	    int MATRIX[][] = {	{ 0, 0, 1, 0 },
	    					{ 0, 0, 1, 0 },
	    					{ 0, 0, 0, 0 },
	    					{ 0, 0, 1, 0 } };
	    int id = findCelebrity(n,MATRIX);
	    if (id == -1)
	      System.out.print("No celebrity");
	    else
	      System.out.print("Celebrity ID " + id);
	  }
}
