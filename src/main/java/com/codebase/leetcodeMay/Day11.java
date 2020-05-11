package com.codebase.leetcodeMay;

import java.util.Arrays;

public class Day11 {

	public static void main(String[] args) {

		int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		int sr = 1, sc = 1, newColor = 2;
		image = floodFill(image, sr, sc, newColor);
		for (int i = 0; i < image.length; i++) {
			System.out.println(Arrays.toString(image[i]));
		}

	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

		if (image[sr][sc] != newColor) {
			image = changeColor(image, sr, sc, image.length, image[0].length, newColor, image[sr][sc]);
		}
		return image;
	}

	private static int[][] changeColor(int[][] image, int sr, int sc, int length, int length2, int newColor,
			int oldColor) {

		if ((sr >= 0 && sr < length) && (sc >= 0 && sc < length2)) {
			if (image[sr][sc] == oldColor) {
				image[sr][sc] = newColor;
			} else {
				return image;
			}

			image = changeColor(image, sr, sc + 1, image.length, image[0].length, newColor, oldColor);
			image = changeColor(image, sr, sc - 1, image.length, image[0].length, newColor, oldColor);
			image = changeColor(image, sr + 1, sc, image.length, image[0].length, newColor, oldColor);
			image = changeColor(image, sr - 1, sc, image.length, image[0].length, newColor, oldColor);
		}

		return image;
	}

}
