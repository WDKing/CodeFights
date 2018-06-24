package com.codefight.williamking.interviewpractice.arrays;

public class FirstDuplicate {
	int firstDuplicate(int[] a) {

	    int duplicateLoc = a.length + 1;
	    int[] singleList = new int[a.length];
	    int currLength = 0;
	    
	    for(int i = 0; i < a.length; i++) {
	        if (findIfSingle(singleList,a[i],currLength)) {
	            if (duplicateLoc == a.length + 1) {
	                duplicateLoc = i;
	            }
	        }
	        else {
	            singleList = addToSingle(singleList,a[i],currLength);
	            currLength++;
	        }
	    }
	    
	    return duplicateLoc != a.length + 1 ? a[duplicateLoc] : -1;
	}

	boolean findIfSingle(int[] c, int numToCheck, int currentLength) {
	    for(int j = 0; j < currentLength; j++) {
	        if (c[j] == numToCheck) {
	            return true;
	        }
	    }
	    
	    return false;
	}

	int[] addToSingle(int[] h, int numToAdd, int length) {
	    h[length] = numToAdd;
	    return h;
	}
}
