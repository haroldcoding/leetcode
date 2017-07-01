package org.haroldcoding.undefined;

/**
 * Created by UIA on 2017/6/30.
 * 判断一个整数是否是回文数
 * 注意负数不是回文数
 */
public class PalindromeNumber {
    /**
     * 先判断输入的数正负，负数直接返回false；然后将输入的整数反转后比较，如果结果相等就是回文数；
     * 整数反转会出现溢出的问题，但对于回文数判断来说可忽略，因为如果有溢出，那这个数肯定不是回文数。
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int target = x;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == target;

    }

}
