package com.rb.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPractice {

	private static void practiceString() {
        String word="HELLO INDIA NAMASTHE";
        System.out.println(word);
        String[] words=word.split(" ");
        for(String s:words) {
        	System.out.println(s);
        }
        char[] cArr=word.toCharArray();
        System.out.println(cArr[2]);
        
        
	}
	static void stringBufferPractice() {
		// String Buffer is Thread safe and synchronised. similar to String Builder and
		// String Buffer is Immutable class.
		String s="Ramya";
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1);
		System.out.println(sb.insert(s.length(), 1));
		System.out.println(sb.insert(s.length(), true));
		System.out.println(sb.delete(0, 1));
		System.out.println(sb);
		System.out.println(sb.deleteCharAt(sb.length()-1));
		System.out.println(sb.append("Budhi"));
		System.out.println(sb.replace(0, 4, "RAMYA"));
		System.out.println(sb.reverse());
		
	}
	static void stringBuilderPractice() {
		// String Buffer is Thread safe and synchronised. similar to String Builder and
		// String Buffer is Mutable class.
		String s="Ramya";
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.insert(s.length(), 1));
		System.out.println(sb.insert(s.length(), true));
		System.out.println(sb.delete(0, 1));
		System.out.println(sb);
		System.out.println(sb.deleteCharAt(sb.length()-1));
		System.out.println(sb.append("Budhi"));
		System.out.println(sb.replace(0, 4, "RAMYA"));
		System.out.println(sb.reverse());
	}
	static void vowelsCount() {
		// word="HELLO INDIA NAMASTHE" print count of vowels and non vowels
		String word="HELLO INDIA NAMASTHE";
		//System.out.println(word.replace(" ", ""));
		int countA=0;
		int countB=0;
		char[] cArr=word.replace(" ", "").toUpperCase().toCharArray();
		for(char c: cArr) {
			if(c == 'A' || c =='E'||c=='I'||c=='O'||c=='U') {
				countA+=1;
			}else {
				countB+=1;
			}
		}
		System.out.println("Vowels Count :"+countA);
		System.out.println("Non Vowels count :"+countB);
	}
	static void reverseEachWord() {
		String word="HELLO INDIA NAMASTHE";
		System.out.println("Original Word :\n"+word);
		String revWord="";
		String[] sArr = word.split(" ");
		for (String s : sArr) {
			StringBuilder sb = new StringBuilder(s);
			revWord = revWord + sb.reverse() + " ";
		}
		System.out.println("Reversing Each word \n"+revWord);
	}

	public static void main(String[] args) {
//		StringPractice.practiceString();
//		StringPractice.stringBufferPractice();
//		StringPractice.stringBuilderPractice();
//		StringPractice.vowelsCount();
		StringPractice.reverseEachWord();
	}

}
