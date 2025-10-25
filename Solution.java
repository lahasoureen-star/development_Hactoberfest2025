import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> stack = new ArrayList<>();

        for (String word : words) {
            if (!stack.isEmpty()) {
                String top = stack.get(stack.size() - 1);
                if (isAnagram(top, word)) {
                    continue; // delete current word
                }
            }
            stack.add(word);
        }
        return stack;
    }

    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
