package com.leetcode.daily.question;

import com.leetcode.daily.tags.Array;
import com.leetcode.daily.tags.difficulty.Simple;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 *  示例 1：
 *
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 
 * 
 *  示例 2：
 *
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 
 * 
 *  示例 3：
 *
 * 输入：digits = [0]
 * 输出：[1]
 *
 * @author: 李钢 2580704698@qq.com
 * @date: 2022/8/24 14:27
 * @Copyright: Copyright (c) 2019
 */
public class Question66 implements Array  ,Simple {


    @Test
    public void plusOneTest() {
        int[] nums = new int[]{1, 3, 5, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
        System.out.println("===============");

        nums = new int[]{1, 3, 9, 6};
        System.out.println(Arrays.toString(plusOne(nums)));
        System.out.println("===============");


        nums = new int[]{9,9, 9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
        System.out.println("===============");

    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            // 如何当前位不是9,直接+1
            if (digits[i] != 9) {
                ++digits[i];
                // 如果当前位+1，说明比当前位低的位，全是9，都置成0
                for (int j = i + 1; j < n; ++j) {
                    digits[j] = 0;
                }
                return digits;
            }
        }

        // digits 中所有的元素均为 9
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;

    }
}
