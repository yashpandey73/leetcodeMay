package com.codebase.leetcodeMay;

public class Day8 {

	public static void main(String[] args) {
		int coordinates[][] = { { 1, 1 }, { 2, 2 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 7, 7 } };
		//System.out.println(checkStraightLine(coordinates));
		System.out.println((int)Math.sqrt(14));
	}

	public static boolean checkStraightLine(int[][] coordinates) {

		int len = coordinates.length;

		int xdiff = Math.abs(coordinates[1][0] - coordinates[0][0]);
		int ydiff = Math.abs(coordinates[1][1] - coordinates[0][1]);

		int cxdiff, cydiff = 0;

		for (int i = 2; i < len; i++) {
			cxdiff = Math.abs(coordinates[i][0] - coordinates[i - 1][0]);
			cydiff = Math.abs(coordinates[i][1] - coordinates[i - 1][1]);

			if (ydiff * cxdiff != xdiff * cydiff) {
				return false;
			}

		}
		return true;
	}

}
