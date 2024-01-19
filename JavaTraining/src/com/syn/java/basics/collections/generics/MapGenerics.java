package com.syn.java.basics.collections.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.syn.java.basics.constructors.Person;

public class MapGenerics {

	
	public static void main(String[] args) {
		Map<String, Person> mp = new HashMap<String, Person>();
		mp.put("VoterID1", new Person("aravinda1", 41, 5.8, 76));
		mp.put("VoterID2", new Person("aravinda2", 42, 5.8, 76));
		mp.put("VoterID3", new Person("aravinda3", 43, 5.8, 76));
		mp.put("VoterID4", new Person("aravinda4", 44, 5.8, 76));
		mp.put("VoterID5", new Person("aravinda5", 45, 5.8, 76));
		
		
		Set<String> keys = mp.keySet();
		Iterator<String> it = keys.iterator();
		String key=null;
		while(it.hasNext())
		{
			key = it.next();
//			System.out.println(key + " : " + mp.get(key));
			System.out.println(mp.get(key));
		}
		
		
	}
}
