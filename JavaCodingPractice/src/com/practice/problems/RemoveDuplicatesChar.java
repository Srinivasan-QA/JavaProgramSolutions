package com.practice.problems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class RemoveDuplicatesChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Inputmessage";
		System.out.println("Duplicate characters : ");
		
		char[] charArray = s.toCharArray();
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0;i<charArray.length;i++) {
			if(!set.add(charArray[i])) {
				System.out.println("Index position :: " + i + " character : "+ charArray[i]);
			}
		}
		
		System.out.println("************************");
		Iterator<Character> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

}
