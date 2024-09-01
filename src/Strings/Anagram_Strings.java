package Strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram_Strings {
    public static void main(String[] args) {
        // Test Case 1: Anagram strings
        String s1 = "listen";
        String t1 = "silent";
        System.out.println("Test Case 1: " + isAnagram(s1, t1)); // Expected output: true

        // Test Case 2: Non-anagram strings
        String s2 = "hello";
        String t2 = "world";
        System.out.println("Test Case 2: " + isAnagram(s2, t2)); // Expected output: false

        // Test Case 3: Same length but not anagram
        String s3 = "abc";
        String t3 = "def";
        System.out.println("Test Case 3: " + isAnagram(s3, t3)); // Expected output: false

        // Test Case 4: Anagrams with repeating characters
        String s4 = "aabbcc";
        String t4 = "ccbbaa";
        System.out.println("Test Case 4: " + isAnagram(s4, t4)); // Expected output: true

        // Test Case 5: Empty strings (edge case)
        String s5 = "";
        String t5 = "";
        System.out.println("Test Case 5: " + isAnagram(s5, t5)); // Expected output: true
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);
    }
}
