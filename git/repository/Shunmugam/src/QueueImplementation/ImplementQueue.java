package QueueImplementation;
import java.util.*;
public class ImplementQueue {
	static Queue<Integer> que=new LinkedList<>();
//	public static void shuffle() {
//		Queue<Integer> temp=new LinkedList<>();
//	int half=que.size()/2;
//		for(int i=0;i<=half;i++) {
//			temp.add(que.remove());
//		}
//		for(int i=0;i<=half;i++) {
//			int a=temp.remove();
//			System.out.print(a+" ");
//			int b=que.remove();
//			System.out.print(b+" ");
//			
//		}
//	}
	public static void shuffle() {
		if(que.size()%2!=0) {
			System.out.println("que size is not even");
			return;
		}
		Stack<Integer> stack=new Stack<>();
		int half=que.size()/2;
		for(int i=0;i<half;i++)
		stack.push(que.remove()); 
		for(int i=0;i<half;i++)
			que.add(stack.pop());
		for(int i=0;i<half/2;i++)
			que.add(que.remove());
		for(int i=0;i<half;i++)
			stack.push(que.remove());
		for(int i=0;i<half;i++) {
			 que.add(stack.pop());
	         que.add(que.remove());
		}
	}
	public static void printMyQueue(){// iterator/ foreach
        for (Integer in : que) {
            System.out.print(in + " ");
        }
	}
public static void main(String[] args) {
	que.add(43);
	que.add(8);
	que.add(5);
	que.add(4);
	que.add(3);
	que.add(9);
	printMyQueue();
	System.out.println();
	System.out.println(que.size());
	shuffle();
	printMyQueue();
}
}
