package com.test;

import java.util.HashMap;
import java.util.Stack;

public class RapidAI {

	public static void main(String[] args) {
		String testString = "{()()}";
		boolean flag = isValid2(testString);
		System.out.println(flag);
	}

	public static boolean isValid2(String inputString) {
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		hm.put('(', ')');
		hm.put('{', '}');
		hm.put('[', ']');

		Stack<Character> st = new Stack();
		for (int i = 0; i <= inputString.length() - 1; i++) {
			if (hm.containsValue(inputString.charAt(i))) {
				if (inputString.charAt(i) != hm.get(st.peek())) {
					return false;
				}
				st.pop();
			} else {
				st.push(inputString.charAt(i));
			}
		}

		if (st.empty()) {
			return true;
		} else
			return false;

	}

}
