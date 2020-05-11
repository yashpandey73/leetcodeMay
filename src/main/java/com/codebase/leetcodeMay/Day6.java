package com.codebase.leetcodeMay;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day6 {
	static int result = 0;
	public static void main(String[] args) {
		int arr [] = {1,1,1,2,2,2,2,3};
		System.out.println(majorityElement(arr));
	}

	public static int majorityElement(int[] nums) {

		
		Set<Integer> set = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		if (set.size() <= 2)
			return nums[0];

		else {
			for (int i = 0; i < nums.length; i++) {
				if (map.containsKey(nums[i])) {
					map.put(nums[i], map.get(nums[i]) + 1);
				} else {
					map.put(nums[i], 1);
				}
			}

			for (int i = 0; i < set.size(); i++) {
				set.forEach(el -> {
					if (map.get(el) >= nums.length / 2)
						result = el;
				});
			}
		}

		return result;
	}
}
