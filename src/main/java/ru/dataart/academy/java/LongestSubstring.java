package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        int maxLength = 0;
        int currLength = 0;
        boolean flag = false;
        int firstIndex = 0;
        int lastIndex = 0;
        char[] chars = checkString.toCharArray();
        if (chars.length == 1) {
            return 1;
        } // chars[i] != chars[firstIndex] &&
        for (int i = 0; i < chars.length; i++) {
            if (i != firstIndex || i == 0) {
                currLength++;
            }
            if (flag) {
                i = firstIndex;
                flag = false;
                lastIndex = 0;
                currLength = 0;
                continue;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    if (j >= lastIndex && lastIndex != 0 && lastIndex != chars.length - 1) {
                        flag = true;
                        if (maxLength < currLength) {
                            maxLength = currLength;
                        }
                        break;
                    }
                    if (j == i + 1) {
                        firstIndex = i;
                        lastIndex = 0;
                         if (maxLength < currLength) {
                            maxLength = currLength;
                        }
                        currLength = 0;
                        break;
                    }
                    firstIndex = i;
                    lastIndex = j;
                    break;
                }
                if (i + 1 == lastIndex || (lastIndex == j - 1 && lastIndex != 0)) {
                    if (i + 1 == chars.length - 1 && chars[i + 1] != chars[firstIndex]) {
                        currLength++;
                    }
                    flag = true;
                    if (maxLength < currLength) {
                        maxLength = currLength;
                    }
                    break;
                }
                if (j == chars.length - 1 && lastIndex != j) {
                    firstIndex = i;
                    lastIndex = j;
                    break;
                }
            }
        }

        return maxLength;
    }
    
}
