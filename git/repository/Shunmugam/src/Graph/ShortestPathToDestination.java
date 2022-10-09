package Graph;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class ShortestPathToDestination {
	    static class point{
		int row;
		int col;
		//make point 
		point(int m,int n){
			this.row=m;
			this.col=n;
		} 
	};

	//defining node
	static class node{
		point p;
		int d;
		node(point p,int dis){ 
			this.p=p;
			this.d=dis;
		}
	};
	    public static boolean isvalid(int i,int j,int n,int m){
	        return (i>=0 && i<n && j>=0 && j<m);
	    }
	    public static int path(int arr[][],int m,int n,int x,int y){
	    if(arr[0][0]==0)//base case
			return -1;

		boolean visited[][]=new boolean[m][n];

		//declare queue by STL 
		Queue<node> q=new LinkedList<>();

		point curr=new point(0,0);

		node t=new node(curr,0); 

		//ENQUEUE source node
		q.offer(t); 
	    
		//direction matrices
		int arrx[]={-1,0,1,0};
		int arry[]={0,1,0,-1};

		point c;
		node v;
		while(!q.isEmpty()){
			//DEQUEUE
			v=q.peek();

			c=v.p;
			//if destnation node is reached
			if(x==c.row && y==c.col ){ 
				return v.d;
			}
			q.poll();
			//check for all four neighbours
			for(int i=0;i<4;i++){ 
				int nextx=c.row+arrx[i];
				int nexty=c.col+arry[i];
	            
				//if valid node && not visited yet
				if(isvalid(nextx,nexty,m,n) && arr[nextx][nexty]==1 && !visited[nextx][nexty]){
					point temp=new point(nextx,nexty);
	                node pre=new node(temp,v.d+1);
					q.offer(pre); //EnQueue
					//mark as visited
					visited[nextx][nexty]=true;
				}
			}
		}
		return -1;
	    }
	    public static void main(String []args) throws IOException{
	        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	        String in[]=new String[2];
	        in=rd.readLine().split(" ");
	        int n=Integer.parseInt(in[0]);
	        int m=Integer.parseInt(in[1]);
	        int arr[][]=new int[n][m];
	        String input[]=new String[n*m];
	        input=rd.readLine().split(" ");
	        int k=0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                arr[i][j]=Integer.parseInt(input[k++]);
	            }
	        }
	        String inp[]=new String[2];
	        inp=rd.readLine().split(" ");
	        int x=Integer.parseInt(inp[0]);
	        int y=Integer.parseInt(inp[1]);
	      System.out.println(path(arr,n,m,x,y));
	    }
	}
