package Graph;

public class NumberOfIsland {
	static final int row=5,col=5;
	public static boolean valid(int graph[][],int rowc,int colc,boolean [][]visited) {
		return rowc<row && rowc>=0 && colc<col && colc>=0 && graph[rowc][colc]==1 && visited[rowc][colc]==false;
	}
	public static void checkForIsland(int [][]graph,int r,int c,boolean visited[][]) {
		int rowc[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int colc[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
		visited[r][c]=true;
		for(int i=0;i<8;i++) {
			if(valid(graph,r+rowc[i],c+colc[i],visited)) {
			checkForIsland(graph,r+rowc[i],c+colc[i],visited);
			}
		}
	}
	public static int numberOfIsland(int [][]graph) {
		boolean visited[][]=new boolean[row][col];
		int count=0;
		for(int i=0;i<row;i++) 
			for(int j=0;j<col;j++) 
				if(graph[i][j]==1 && visited[i][j]==false) {
					checkForIsland(graph,i,j,visited);
					count++;
				}
		return count;
	}
public static void main(String []args){
	int [][]graph={ { 1, 1, 0, 0, 0 },
            		{ 0, 1, 0, 0, 1 },
            		{ 1, 0, 0, 1, 1 },
            		{ 0, 0, 0, 0, 0 },
            		{ 1, 0, 1, 0, 1 } };
	int count=numberOfIsland(graph);
	System.out.println(count);
}
}
