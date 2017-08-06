package com.technicalyorker.codetest.skyhubdigital.brackets.util;

import java.util.Stack;

/**
 * Ensure that the string is properly escaped
 * 
 * @author achuth
 *
 */
public final class BracketsUtil {
	public static boolean checkBracket(String str) {
		Stack<Character> s = new Stack<>();
		for (char c : str.toCharArray()) {
			switch (c) {
			case '{':
				s.add(c);
				break;
			case '(':
				s.add(c);
				break;
			case '[':
				s.add(c);
				break;
			case ']':
				if (s.pop() != '[') {
					return false;
				}
				break;
			case '}':
				if (s.pop() != '{') {
					return false;
				}
				break;
			case ')':
				if (s.pop() != '(') {
					return false;
				}
				break;
			}
		}
		if (!s.isEmpty()) {
			return false;
		}
		return true;
	}
}
