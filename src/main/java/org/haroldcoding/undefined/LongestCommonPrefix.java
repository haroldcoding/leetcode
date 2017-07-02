package org.haroldcoding.undefined;

/**
 * Created  on 2017/7/2.
 * 题目:
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 思路：
 * 第一次做：  题目要求找出字符串数组中所有元素的最长共同前缀，所以考虑先找出元素中长度最小的字符串，
 * 然后循环从该字符串的0索引开始截取子字符串，每次截取长度加1，如果在循环结束前有元素不包含该子字符串，则
 * 返回上次循环中的子字符串，否则就返回该字符串。
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String minLengthStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLengthStr.length()) {
                minLengthStr = strs[i];
            }
        }
        for (int i = 0; i < minLengthStr.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(minLengthStr.substring(0, i + 1))) {
                    return minLengthStr.substring(0, i);
                }
            }
        }
        return minLengthStr;
    }
}
