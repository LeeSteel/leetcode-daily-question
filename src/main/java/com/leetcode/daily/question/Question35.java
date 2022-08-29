package com.leetcode.daily.question;

import com.leetcode.daily.tags.difficulty.Simple;
import com.leetcode.daily.tags.Array;
import com.leetcode.daily.tags.search.BinarySearch;
import org.junit.jupiter.api.Test;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 *
 *
 *
 * @author: 李钢 2580704698@qq.com
 * @date: 2022/8/24 14:27
 * @Copyright: Copyright (c) 2019
 */
public class Question35 implements Array, BinarySearch,Simple {


    @Test
    public void searchInsertTest() {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));

        nums = new int[]{1, 3, 5, 6};
          target = 7;
        System.out.println(searchInsert(nums, target));


        nums = new int[]{1, 3, 5, 6};
        target = 2;
        System.out.println(searchInsert(nums, target));
    }

    /**
     * 常规 for解题思路, 时间复杂度 O(1)
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        for (; left < nums.length; left++) {
            if (nums[nums.length - 1] < target) {
                left = nums.length;
                break;
            }
            if (nums[left] >= target) {
                break;
            }
        }
        return left;
    }
}
