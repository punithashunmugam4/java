package Strings;

import java.io.*;
import java.util.*;

public class MathchingPattern {
	public static boolean match(String word,String pattern) {
		HashMap<Character,Character> hash1=new HashMap<>();
		HashMap<Character,Character> hash2=new HashMap<>();
		for(int i=0;i<word.length();i++) {
			char a=word.charAt(i);
			char b=pattern.charAt(i);
			if(!hash1.containsKey(a))
				hash1.put(a,b);
			if(!hash2.containsKey(b))
				hash2.put(b,a);
			if(hash1.get(a)!=b || hash2.get(b)!=a) {
				return false;
			}
		}
		return true;
	}
	public static List<String> matchPattern(String []arr,String pattern){
		List<String> res=new ArrayList<>();
		for(String word:arr) {
			if(match(word,pattern)) res.add(word);
		}
		return res;
	}
public static void main(String []args) {
	String arr[]= {"abb","bee","sge","afe"};
	String pattern="baa";
	List<String> res=matchPattern(arr,pattern);
	System.out.println(res);
}
}
