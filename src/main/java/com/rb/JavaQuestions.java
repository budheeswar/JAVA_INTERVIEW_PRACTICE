package com.rb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class JavaQuestions {

	static void Fibonacci(int n) {
		int f = 1, s = 2, next = 0;
		System.out.println("FIBONACCI SERIES OF " + n);
		for (int i = 1; i <= n; i++) {
			System.out.print(f);
			next = f + s;
			f = s;
			s = next;
		}
		System.out.println();
	}

	static void ArmstrongNumber(int n) {
		// 123 -- 1*1*1+2*2*2+3*3*3 == 123
		int originalNumber = n;
		int singleDigit = 0;
		double Result = 0;
		while (n != 0) {
			singleDigit = n % 10;
			Result = Result + Math.pow(singleDigit, 3);
			n = n / 10;
		}
		if (Result == originalNumber) {
			System.out.println(originalNumber + " is ArmStrong Number");
		} else {
			System.out.println(originalNumber + "NOT ARMSTRONG NUMBER");
		}
	}

	static void checkPrimeOrNot(int n) {
		int count = 0;
		if (n < 2) {
			System.out.println(n + " IS NOT PRIME");
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					count += 1;
				}
			}
			if (count == 0) {
				System.out.println(n + " is PRIME");
			} else {
				System.out.println(n + " IS NOT PRIME");
			}
		}

	}

	static void characterCountFromString(String s) {
		// BUDDEESWAR
		char[] cArr = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : cArr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.print("Character Count is \n" + map);
		// Practice hashMap
		Set<Character> keys = map.keySet();
		System.out.println("KEYS ARE:");
		for (char c : keys) {
			System.out.print(c + " ");
		}
		System.out.println("\n VALUES ARE");
		Collection<Integer> c = map.values();
		for (int n : c) {
			System.out.print(n + " ");
		}
	}

	static void reverseStringAndArray(String s) {
		// RAMYA
		char[] cArr = s.toCharArray();
		System.out.println("ORIGINAL ARRAY is " + String.valueOf(cArr));
		char[] output = new char[cArr.length];
		for (int i = cArr.length - 1; i >= 0; i--) {
			output[i] = cArr[cArr.length - 1 - i];
		}
//		O[4] = N[0]
//		o[3] = N[1]
//		O[2] = N[2]
//		O[1] = N[3]
//		O[0] = N[4]

		System.out.println("Reversed Array is " + String.valueOf(output));
	}

	static void conversionsPractice() {
		String word = "RAMYA";
		// COnvert Array to List and print
		char[] cArr = word.toCharArray();
		System.out.println("Original Array " + String.valueOf(cArr));
		// System.out.println(cArr);
		List<Character> list = new ArrayList<>();
		System.out.println("PRINTING ARRAYS AS LIST ");
		for (char c : cArr) {
			list.add(c);
			System.out.print(c + " ");
		}

		// COnvert List to Array and print
		Object[] newArr = list.toArray();
		System.out.println("\n NEW ARRAY IS " + newArr.toString());
		// COnvdert String to Chars Array and print

	}

	static void longestConsecutinveIntegerInArray() {
		int[] iArr = { 1, 3, 2, 2, 2, 3, 4, 4, 2, 2, 5, 6, 6, 1, 3, 3, 3, 3 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : iArr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1); // HOW TO FIND VALUE USING KEY
			} else {
				map.put(i, 1);
			}
		}
		Collection<Integer> values = map.values();
		int max = Collections.max(values);
		// HOW TO FIND KEY USING VALUE
		List<Integer> keyList = new ArrayList<>();
		Set<Integer> keys = map.keySet();
		for (int i : keys) {
			if (map.get(i) == max) {
				keyList.add(i);
			}

		}
		System.out.println("LARGEST OCCURED KEY VALUE PAIR IS " + keyList + " " + max);
	}

	static void printCharsUsingLogic(String s) {
		// A1F3D2
		String output = "";
		System.out.println(s.length());
		for (int i = 0; i < s.length() - 1; i++) {
			if (i % 2 == 0) {
				char c = s.charAt(i);
				char c1 = s.charAt(i + 1);
				int count = Integer.parseInt(String.valueOf(c1));
				for (int j = 1; j <= count; j++) {
					output = output + c;
				}

			} else {
				// Nothing
			}

		}
		System.out.println("OUTPUT OF THE LOGIC IS " + output);
		//R1A3C3
		System.out.println("ANOTHER LOGIC \n");
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				System.out.print(s.charAt(i));
			} else {
				int count = Character.getNumericValue(s.charAt(i));
				for (int j = 1; j < count; j++) {
					System.out.print(s.charAt(i - 1));

				}
			}

		}

	}
	static void secondLargestNumberInArray() {
		int[] arr= {1,4,7,8,12,2};		
		Optional<Integer> x = Arrays.stream(arr).distinct().boxed().sorted((a,b) -> b-a).skip(1).findFirst();
		System.out.println("Second Largest Number is "+ x.get());
		
		Arrays.stream(arr).forEach(x1->System.out.println(x1));
		
		// Another Method.
		Arrays.sort(arr);
		System.out.println("Second Largest number is "+arr[arr.length-2]);
		
	}
	
	static void practiceString() {
		String s="RAMYA ";
		System.out.println(s.length());
		System.out.println(s.trim().length());
		System.out.println(s.concat("BUDHI"));
		System.out.println(s);
		s=s.concat("BUDHI");
		System.out.println(s.concat(" ").repeat(3));
	}

	public static void main(String[] args) {
//		JavaQuestions.Fibonacci(5);
//		JavaQuestions.ArmstrongNumber(153);
		// JavaQuestions.checkPrimeOrNot(123);
//		JavaQuestions.characterCountFromString("BUDDEESWAR");
//		JavaQuestions.reverseStringAndArray("RAMYA");
		// JavaQuestions.conversionsPractice();
		// JavaQuestions.longestConsecutinveIntegerInArray();
//		JavaQuestions.printCharsUsingLogic("R3B1S4");
//		JavaQuestions.secondLargestNumberInArray();
		JavaQuestions.practiceString();
	}
}
