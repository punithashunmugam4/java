package Strings;
import java.util.*;
public class Anagram {
	public static List<List<String>> anagram(String []str){
		if(str==null || str.length==0) {
			return new ArrayList<>();
		}
		HashMap<String,List<String>> stringAnagramMap=new HashMap<>();
		for(String s:str) {
			char[] c=s.toCharArray();
			Arrays.sort(c);
			String key=String.valueOf(c);
			if(!stringAnagramMap.containsKey(key)) {
				stringAnagramMap.put(key, new ArrayList<>());
			}
			stringAnagramMap.get(key).add(s);
		}
			List<List<String>> resultlist=new ArrayList<>();
			for(Map.Entry<String,List<String>> stringAnagram:stringAnagramMap.entrySet()) {
				resultlist.add(stringAnagram.getValue());
			
		}
			return resultlist;
	}
public static void main(String[] args) {
	String[] str= {"eat","hat","bat","tab","bat","abt","tah","hta","ate","tea","eat"};
	System.out.println(anagram(str));
}
}
