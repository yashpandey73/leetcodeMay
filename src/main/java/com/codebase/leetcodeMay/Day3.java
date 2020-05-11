package com.codebase.leetcodeMay;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Day3 {

	public static void main(String[] args) {

		String ransomNote = "ab", magazine = "abc";
		System.out.println(canConstruct(ransomNote, magazine));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		boolean flag = true;
		Map<Character, Integer> strMap = new HashMap<>();
		Map<Character, Integer> stMap = new HashMap<>();

		for (int i = 0; i < ransomNote.length(); i++) {
			if (strMap.containsKey(ransomNote.charAt(i))) {
				strMap.put(ransomNote.charAt(i), strMap.get(ransomNote.charAt(i)) + 1);
			} else {
				strMap.put(ransomNote.charAt(i), 1);
			}
		}
		for (int i = 0; i < magazine.length(); i++) {
			if (stMap.containsKey(magazine.charAt(i))) {
				stMap.put(magazine.charAt(i), stMap.get(magazine.charAt(i)) + 1);
			} else {
				stMap.put(magazine.charAt(i), 1);
			}
		}
		for (Entry<Character, Integer> map : strMap.entrySet()) {
			if (stMap.containsKey(map.getKey())) {
				if (stMap.get(map.getKey()) < map.getValue()) {
					flag = false;
					break;
				}
			} else {
				flag = false;
				break;
			}
		}

		return flag;
	}
}
