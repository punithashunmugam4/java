package Basics;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.*;
// don't change the name of this class
// you can add inner classes if needed
class EvotingMachine {
	public static void main (String[] args) throws IOException {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int id[]=new int[n];
    String party[]=new String[n];
    HashMap<Integer,String> hm=new HashMap<>();
	HashMap<String,Integer> sm=new HashMap<>();
    for(int i=0;i<n;i++) {
    	id[i]=sc.nextInt();
    	party[i]=sc.next();
	if(!hm.containsKey(id[i])) {
	hm.put(id[i],party[i]);
	if(sm.containsKey(party[i])) {
		sm.put(party[i],1+sm.get(party[i]));
	}
	else
		sm.put(party[i],1);
    }
	}
    TreeMap<String,Integer> sorted=new TreeMap<>();
    sorted.putAll(sm);
    int max=Collections.max(sm.values());
    for(String key:sorted.keySet()) {
    	if(sm.get(key)==max) {
    		System.out.println(key+" "+sorted.get(key));
    	}
    }
}
}