package org.haroldcoding.undefined;

/**
 * Created  on 2017/6/30.
 * 整数反转
 * 输入一个32-bit 有符号整数
 */
public class ReverseInteger {
    public int reverse(int x) {
        char[] numCharArray = null;
        boolean flag = true;
        int result = 0;
        if (x > 0) {
            numCharArray = String.valueOf(x).toCharArray();
        } else if (x < 0) {
            numCharArray = String.valueOf(x).substring(1).toCharArray();
            flag = false;
        }

        StringBuffer sb = new StringBuffer();
        if (numCharArray != null) {
            int index = 0;
            for (int i = numCharArray.length - 1; i >= 0; i--) {
                if (numCharArray[i] != 0) {
                    index = i;
                    break;
                }
            }
            for (int i = index; i >= 0; i--) {
                sb.append(numCharArray[i]);
            }
            try {
                result = flag ? Integer.parseInt(sb.toString()) : (0 - Integer.parseInt(sb.toString()));
            } catch (Exception ex) {
            }
        }

        return result;
    }

    public int reverse1(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        long r= Integer.MAX_VALUE + 1;
        if(r == (int)r){
            System.out.println("EQUAL, which is wrong");
        } else {
            System.out.println("NOT EQUAL, which is incorrect");
        }
    }
}
