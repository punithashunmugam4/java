package Strings;

public class ReverseEvenWords {
public static void main(String[] args) {
	String str="superman batman catwoman";
	String[] c=str.split("\\s+");
	for(int i=0;i<c.length;i++) {
		if(i%2==0) {
			System.out.print(c[i]+" ");
		}
		else {
			String reverse= new StringBuffer(c[i]).reverse().toString();
			System.out.print(reverse+" ");
		}
	}
}
}
