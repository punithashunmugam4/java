package StackImplementation;
import java.util.*;
public class NextMaxElement {
	static List<Integer> printnextGreatest(int arr[],int n) {
		Stack<Integer> stack=new Stack<>();
		List<Integer> list=new ArrayList<>();
		stack.push(arr[0]);
		int poped;
		for(int i=1;i<n;i++) {
			int cur=arr[i];
			poped=stack.pop();
			while(cur>poped) {
				 list.add(cur);
				 if(stack.isEmpty())
						break;
				 else
				 poped=stack.pop();
			}
			if(cur<poped) {
				stack.push(poped);
			}
			stack.push(cur);
		}
		 while(!stack.isEmpty()){
	            list.add(-1);
	            stack.pop();
	        }
		 return list;
	}
public static void main(String []args) {
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();

      int arr[]=new int[n];

      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      List<Integer> list=printnextGreatest(arr,n);
      System.out.println(list);
}
}
