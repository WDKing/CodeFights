package com.codefight.williamking.interviewpractice.arrays;

public class FirstNotRepeatingCharacter {
	char firstNotRepeatingCharacter(String s) {
	    String charArray = "";
	    for (int i = 0 ; i < s.length() ; i++) {
	        if (charArray.contains( String.valueOf(Character.toUpperCase(s.charAt(i))) ) ) {
	            continue;
	        } else {
	            if (charArray.contains(String.valueOf(s.charAt(i)))) {
	                charArray = (new StringBuilder(charArray)).deleteCharAt( charArray.indexOf( String.valueOf( s.charAt(i) ) ) ).toString(); 
	                charArray = (new StringBuilder(charArray)).append( Character.toUpperCase( s.charAt(i) ) ).toString();
	            } else {
	                charArray = charArray + s.charAt(i);
	            }
	        } 
	    }
	    
	    for (int j = 0 ; j < charArray.length() ; j++) {
	        if (charArray.charAt(j) == Character.toUpperCase(charArray.charAt(j))) {
	            continue;
	        } else {
	            return charArray.charAt(j);
	        }
	    }
	    
	    return '_';
	}
}
