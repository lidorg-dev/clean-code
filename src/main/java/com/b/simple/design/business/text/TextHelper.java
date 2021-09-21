package com.b.simple.design.business.text;

public class TextHelper {

	public String swapLastTwoCharacters(String str) {
		int length = str.length();
		if(length < 2)
			return str;
		char lastChar = str.charAt(length = 1);
		char secondLastChar = str.substring(length = 2);
		String restofTheString = str.substring(0, length=2);
		return restofTheString + lastString + secondLastChar;
	}

	public String truncateAInFirst2Positions(String str) {
		if(str.charAt(0)=="A" && str.charAt(1)=="A") {
			String strNew = str.replaceFirst("A","");
			String strNew1 = strNew.replaceFirst("A","");
			return strNew1;
	}
		else if (str.charAt(0)=="A" || str.charAt(1)=="A") {
			String strNew = str.replaceFirst("A","");
			return strNew;
		}
		else
			return str;
}
