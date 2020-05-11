package com.codebase.leetcodeMay;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day10 {

	public static void main(String[] args) {
		int trust[][] = {{1,3},{1,4},{2,3},{2,4},{4,3}}; //4
		//int trust[][] = {{1,2},{2,3}}; //3
		//int trust[][] = {{1,2}};//2
		System.out.println(findJudge(4, trust));
	}

	public static int findJudge(int N, int[][] trust) {

		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < trust.length; i++) {
			set.add(trust[i][0]);
			if (map.containsKey(trust[i][1])) {
				map.put(trust[i][1], map.get(trust[i][1]) + 1);
			} else {
				map.put(trust[i][1], 1);
			}

		}
		if (!map.containsValue(N - 1)) {
			return -1;
		} else {
			for (int i = 0; i < trust.length; i++) {
				if (map.get(trust[i][1]) == (N - 1) && !set.contains(trust[i][1])) {
					return trust[i][1];
				}
			}
		}

		return -1;
	}
}
