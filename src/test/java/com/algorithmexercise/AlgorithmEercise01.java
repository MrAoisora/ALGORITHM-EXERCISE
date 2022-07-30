package com.algorithmexercise;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 两数之和
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 */
public class AlgorithmEercise01 {
    private static final int target = 9;
    private static int[] arr = {2, 7, 2, 7};

    /**
     * 暴力双循环
     */
    @Test
    public void test01(){
        for (int i = 0; i < arr.length; i++) {
            for(int j = arr.length-1;j>i;j--){
                if(target ==arr[i]+arr[j]){
                    System.out.println("target="+target+"时的索引下标为["+i+","+j+"]");
                }
            }
        }
    }
}
