package org.haroldcoding.array.twosum;


import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2017/6/30.
 */
public class Solution {
    /**
     * 第一种方法 循环遍历每个数组元素 x，看是否存在与 target - x 相等的元素
     * 这是我第一次的做法,当然抛出异常是写完之后参考了 leetcode 的解答又加上的
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 第二种方法，找出所有比 target 小的数组元素，以值为 key ，索引为 value 存到一个 Map 集合中
     * 然后遍历 Map 集合元素， 判断是否存在与 target 差值相同的 key 并且 对应的 value 与当前的 value不同的元素
     *
     * 第一次做的时候虽然想到将小于 target 的数组元素放入一个 Map 中， 但将索引作为 key ， 数组元素作为 value ，所以
     * 接下来处理就比较麻烦了
     *
     * 这段代码来自 leetcode
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                map.put(nums[i], i);
            }
        }
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            int complement = target - item.getValue();
            if (map.containsKey(complement) && (int) map.get(complement) != item.getValue()) {
                return new int[]{item.getValue(), map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 循环将数组元素依次放入一个 Map 集合中，在每次循环内进行判断
     *
     * 这段代码来自 leetcode
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum3(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
