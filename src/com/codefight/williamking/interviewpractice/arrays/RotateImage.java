package com.codefight.williamking.interviewpractice.arrays;

public class RotateImage {
	int[][] rotateImage(int[][] a) {
	    int[][] rotateA = new int[a.length][a.length];
	    for (int i = 0 ; i < a.length ; i++) {
	        for (int j = 0 ; j < a.length ; j++) {
	            rotateA[j][a.length - 1 - i] = a[i][j];
	        }
	    }
	    
	    return rotateA;
	}
}
