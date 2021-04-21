package com.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class IndexofMethod {

	/*
	 * Find the index of substring or start of string(without using index of method)
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String input = "123456789101112131415161718192021222324252627282930";

		// With index of method
		System.out.println("From Library method"+input.indexOf("52627"));

		//Self written index of method
		String s2 = "52627";
		for (int i = 0; i <= input.length() - 1; i++) {
			boolean flag = false;
			if (input.charAt(i) == s2.charAt(0)) {

				int start = i, end = i + s2.length() - 1;
				int p = 0;

				if (end <= input.length() - 1) {
					flag = true;
					while (start <= end) {
						if (input.charAt(start) != s2.charAt(p)) {
							flag = false;
							break;
						} else {
							start++;
							p++;
						}
					} // while
				}

				if (flag == true) {
					System.out.println("start index-" + i);
				} else {
					flag = false;
				}
			}
		}
	}

}
