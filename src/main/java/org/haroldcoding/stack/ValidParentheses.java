package org.haroldcoding.stack;

import java.util.Stack;
import org.junit.Test;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
 * input string is valid.  The brackets must close in the correct order, "()" and "()[]{}" are all
 * valid but "(]" and "([)]" are not.
 *
 * 考察栈数据结构
 *
 * @author UIA
 * @created 2017-07-06-22:07
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null || s.isEmpty() || s.length() % 2 == 1) {
            return false;
        }
        char[] schar = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : schar) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (c == ')' && stack.pop() != '(') {
                    return false;
                } else if (c == '}' && stack.pop() != '{') {
                    return false;
                } else if (c == ']' && stack.pop() != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
