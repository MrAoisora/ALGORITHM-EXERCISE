package com.algorithmexercise;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 两数之和
 * <p>
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 */
public class AlgorithmEercise01 {
    private static final int target = 9;
    private static int[] arr = {2,7,11,15};

    /**
     * 暴力双循环
     */
    @Test
    public void test01() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (target == arr[i] + arr[j]) {
                    System.out.println("target=" + target + "时的索引下标为[" + i + "," + j + "]");
                }
            }
        }
    }

    /**
     * 哈希表
     */
    @Test
    public void Test02() {
        int arrLength = arr.length;
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>(arrLength - 1);
        //把数数组第一个值放入哈希表中，key是数组的值，value是索引下标
        hashtable.put(arr[0], 0);
        //所以从数组下标1开始遍历
        for (int i = 1; i < arr.length; ++i) {
            if (hashtable.containsKey(target - arr[i])) {
                //如果包含该键，将对应的键的索引下标返回，并输出遍历到的数组下标
                System.out.println("target=" + target + "时的索引下标为[" + hashtable.get(target - arr[i]) + "," + i + "]");
            }
            //如果没有该键，将数组的值作为键放入哈希表中
            hashtable.put(arr[i], i);
        }
    }
}
