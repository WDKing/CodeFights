package com.codefight.williamking.interviewpractice.arrays;

public class Sudoku2 {
	boolean sudoku2(char[][] grid) {
	    boolean valid = true;
	    for(int i = 0; i < grid.length; i++) {
	        valid = valid && validColumn(grid, i) && validRow(grid, i) && validBox(grid, i);
	        if (!valid) {
	            return valid;
	        }
	    }
	    return valid;
	}

	boolean validColumn(char[][] grid, int i) {
	    return noMatches(grid[i][0], grid[i][1], grid[i][2], 
	                     grid[i][3], grid[i][4], grid[i][5], 
	                     grid[i][6], grid[i][7], grid[i][8]);
	}

	boolean validRow(char[][] grid, int i) {
	    return noMatches(grid[0][i], grid[1][i], grid[2][i],
	                     grid[3][i], grid[4][i], grid[5][i],
	                     grid[6][i], grid[7][i], grid[8][i]);
	}

	boolean validBox(char[][] grid, int i) {
	    switch(i) {
	        case 0:    
	            return noMatches(grid[0][0], grid[0][1], grid[0][2],
	                             grid[1][0], grid[1][1], grid[1][2],
	                             grid[2][0], grid[2][1], grid[2][2]);
	        case 1:
	            return noMatches(grid[0][3], grid[0][4], grid[0][5],
	                             grid[1][3], grid[1][4], grid[1][5],
	                             grid[2][3], grid[2][4], grid[2][5]);
	        case 2:
	            return noMatches(grid[0][6], grid[0][7], grid[0][8],
	                             grid[1][6], grid[1][7], grid[1][8],
	                             grid[2][6], grid[2][7], grid[2][8]);
	        case 3:
	            return noMatches(grid[3][0], grid[3][1], grid[3][2],
	                             grid[4][0], grid[4][1], grid[4][2],
	                             grid[5][0], grid[5][1], grid[5][2]);
	        case 4:
	            return noMatches(grid[3][3], grid[3][4], grid[3][5],
	                             grid[4][3], grid[4][4], grid[4][5],
	                             grid[5][3], grid[5][4], grid[5][5]);
	        case 5:
	            return noMatches(grid[3][6], grid[3][7], grid[3][8],
	                             grid[4][6], grid[4][7], grid[4][8],
	                             grid[5][6], grid[5][7], grid[5][8]);
	        case 6:
	            return noMatches(grid[6][0], grid[6][1], grid[6][2],
	                             grid[7][0], grid[7][1], grid[7][2],
	                             grid[8][0], grid[8][1], grid[8][2]);
	        case 7:
	            return noMatches(grid[6][3], grid[6][4], grid[6][5],
	                             grid[7][3], grid[7][4], grid[7][5],
	                             grid[8][3], grid[8][4], grid[8][5]);
	        case 8:
	            return noMatches(grid[6][6], grid[6][7], grid[6][8],
	                             grid[7][6], grid[7][7], grid[7][8],
	                             grid[8][6], grid[8][7], grid[8][8]);
	        default:
	            return false;
	    }
	}

	boolean noMatches(char... numberList) {
	    for (char inputChar : numberList) {
	        System.out.print(inputChar + " ");
	    }
	    System.out.println();
	    
	    if (numberList.length <= 1) {
	        return true;
	    }
	    
	    boolean noMatch = true;
	    
	    for (int i = 1; i < numberList.length; i++) {
	        noMatch = noMatch && (numberList[0] == '.' || numberList[0] != numberList[i]);
	    }
	    
	    if (noMatch) {
	        return noMatches( java.util.Arrays.copyOfRange(numberList, 1, numberList.length));
	    } else {
	        return false;
	    }
	}
}
