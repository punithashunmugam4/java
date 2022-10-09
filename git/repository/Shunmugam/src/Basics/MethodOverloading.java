package Basics;

public class MethodOverloading {
	public static void details(String name,String address,String qualification) {
		System.out.println("2/103,Amman kovil sreet,puthantharuvai");
		System.out.println("BE Mechanical");
	}
	public static void details(String name,String address) {
		System.out.println("2/103,Amman kovil sreet,puthantharuvai");
	}
	public static void main(String []args) {
		String name="prakash";
		String address="";
		String qualification="";
	details(name,address);
	details(name,address,qualification);
}
}
