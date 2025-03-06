public class LongestSubstringWithoutRepeatingChars {

  static int lengthOfLongestSubstring(String s) {
    HashMap<Charachter, Integer> charIdx = new HashMap<>();
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
}
