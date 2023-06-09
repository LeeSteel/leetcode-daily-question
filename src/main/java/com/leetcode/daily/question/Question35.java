package com.leetcode.daily.question;

import com.leetcode.daily.tags.Array;
import com.leetcode.daily.tags.difficulty.Simple;
import com.leetcode.daily.tags.search.BinarySearch;
import org.junit.jupiter.api.Test;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 
 *  请必须使用时间复杂度为 O(log n) 的算法。
 *  示例 1:
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * 
 * 
 *  示例 2:
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 * 
 * 
 *  示例 3:
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
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
        System.out.println("===============");



        nums = new int[]{1, 3, 5, 6};
          target = 7;
        System.out.println(searchInsert(nums, target));
        System.out.println(binarySearch(nums, target));
        System.out.println("===============");


        nums = new int[]{1, 3, 5, 6};
        target = 2;
        System.out.println(searchInsert(nums, target));
        System.out.println(binarySearch(nums, target));
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

    /**
     * 二分查找
     * @param nums
     * @param target
     * @return
     */
    public int searchInsertLeetCode(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];
            // key 在右半区, 左边起始区间调整
            if (midVal < key) {
                low = mid + 1;
            }
            // key 在左半区, 右边结束区间调整
            else if (midVal > key) {
                high = mid - 1;
            } else {
                // key found
                return mid;
            }
        }
        // key not found
        return low;
    }

}
