package com.rb.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionsPractice {
	
	static void practiceHashtable() {
		// HASHTABLE IS TREAD SAFE AND WONT ALLO NULL KEYSANDVALUES
		Hashtable<Integer,String> table = new Hashtable<>();
		table.put(1, "RAMYA");
		table.put(2, "Budhi");
		System.out.println(table.contains("Budhi"));
		System.out.println(table.containsKey(2));
	}
	static void practiceHashMap() {
		
		//HASHMAP
		HashMap<String, Integer> map= new HashMap<>();
		map.put("RAMYA", 100);
		map.put("BUDHI", 200);
		map.put("ABC", 97);
		System.out.println(map);
		// GET SET oF KEYS
		Set<String> keys=map.keySet();
		// VAlue=97 will print respective Key
		// INITIALISE ITERATOR TO GET EACH KEYS
		Iterator<String> keyItr=keys.iterator();
		while(keyItr.hasNext()) {
			System.out.println(keyItr.next());
		}
		// ANOTHER WAY TO PRINT KEYS
		List<String> listKeys = new ArrayList<>();
		for(String key:keys) {
			System.out.println(key);
			listKeys.add(key);
		}
		System.out.println("KEYS WITHOUT SORT "+ listKeys);
		// SORT WILL WORK ONLY ON LIST --> COLLECTIONS.SORT(LIST_object)
		Collections.sort(listKeys);
		System.out.println("KEYS AFTER SORT "+listKeys);
		
		// CONVERT SET TO LIST
		List<String> l=new ArrayList<>(keys);
		System.out.println(l);
		
		// CONVERT LIST TO SET
		Set<String> s= new HashSet<>(l);
		System.out.println(s);
		
		// GET KEY USING VALUE
		Collection<Integer> values=map.values();
		System.out.println(values);
	}
	static void practiceCollections() {
		// Sort, Max, Min values and iterator, distinct, addAll
		String[] sArr= {"Budhi","Ramya","Abhi","Pranay","Priya","Abhi"};
		List<String> list= Arrays.asList(sArr);
		System.out.println("BEFORE SORT "+list);
		Collections.sort(list);
		List<String> distinct =list.stream().distinct().toList();
		System.out.println("DISTINCT ELEMENTS ARE "+distinct);
		System.out.println("AFTER SORT "+list);
		System.out.println(Collections.min(list, null));
		
		String max=Collections.max(list);
		String min=Collections.min(list);
		System.out.println("MAX and MIN values are :"+max+" "+min);
		
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			String v=itr.next();
			System.out.println(v);
			if(v.equalsIgnoreCase(max)) {
				System.out.println("MAX value found");
			}
		}
		String[] stArr= {"Abhi","Priya"};
		List<String> listS=new ArrayList<>();
		System.out.println(listS);
		Collections.addAll(listS, stArr);
		System.out.println(listS);
		
	}
	static void practiceArrays() {
		// Arrays can Sort, Distinct, Stream.
		int[] ages= {12,54,89,12,45};
		char[] c= {'A','D','Z','A','W'};
		// Print Arrays
		System.out.println("BEFORE SORT: ");
		for(int age:ages) {
			System.out.print(age+" ");
		}
		// Sort
		Arrays.sort(ages);
		System.out.println();
		System.out.println("AFTER SORT: ");
		for(int age:ages) {
			System.out.print(age+" ");
		}
		System.out.println();
		int[] distinctArray=Arrays.stream(ages).distinct().toArray();
		System.out.println("DISTINCT VALUES ARE ");
		for(int age:distinctArray) {
			System.out.print(age+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		// List --> ArrayList, LinkedList, Vector
		// Set  --> HashSet,LinkedHashSet, TreeSet
		// Queue--> PriorityQueue, Deque
		// Map  --> HashMap, LinkedHashMap, TreeMap
		// Collections, Arrays, Iterator
		//CollectionsPractice.practiceHashtable();
//		CollectionsPractice.practiceHashMap();
		CollectionsPractice.practiceCollections();
//		CollectionsPractice.practiceArrays();
	}
}
