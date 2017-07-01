package org.haroldcoding.undefined;

/**
 * Created by UIA on 2017/7/1.
 */
public class RomanToInteger {
    public int romanToInt(String s){
        if(s.isEmpty() || s == null){
            throw new IllegalArgumentException("error argument");
        }
        int result = 0;
        int[] nums = new int[s.length()];
        char[] numsCharArray = s.toLowerCase().toCharArray();
        for(int i = 0; i < s.length(); i++){
            switch (numsCharArray[i]){
                case 'i':
                    nums[i] = 1;
                    break;
                case 'v':
                    nums[i] = 5;
                    break;
                case 'x':
                    nums[i] = 10;
                    break;
                case 'l':
                    nums[i] = 50;
                    break;
                case 'c':
                    nums[i] = 100;
                    break;
                case 'd':
                    nums[i] = 500;
                    break;
                case 'm':
                    nums[i] = 1000;
                    break;
                default:
                    break;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(i+1 >= nums.length || nums[i] >= nums[i+1]){
                result+=nums[i];
            } else if(nums[i] < nums[i+1]){
                result-=nums[i];
            }
        }
        return result;
    }

}
