import java.util.HashMap;

/**
 * 3. Longest Substring Without Repeating Characters
 * Diflty : Medium
 * URL    : https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Date   : 05-03-2025
 * Author : Lutfi
 * 
 * Example 1
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingChars {

  static int lengthOfLongestSubstring(String s) {
    HashMap<Character, Integer> charIdx = new HashMap<>();
    int left = 0;
    int maxLength = 0;

    for (int right = 0; right < s.length(); right++) {
      char c = s.charAt(right);

      if (charIdx.containsKey(c) && charIdx.get(c) >= left) {
         left = charIdx.get(c) + 1;
      }

      charIdx.put(c, right);
      maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
  }
}`
