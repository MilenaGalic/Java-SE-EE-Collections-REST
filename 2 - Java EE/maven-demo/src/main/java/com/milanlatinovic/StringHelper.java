package com.milanlatinovic;

public class StringHelper {

	public String swapLast2Chars(String string) {
		// TODO Auto-generated method stub
		int length = string.length();
		String strMinusLast2Chars = string.substring(0, length - 2);
		char secondLastChar = string.charAt(length - 2);
		char lastChar = string.charAt(length - 1);
		return strMinusLast2Chars + lastChar + secondLastChar;
	}

}
