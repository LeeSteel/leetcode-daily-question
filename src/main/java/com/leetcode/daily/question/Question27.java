package com.leetcode.daily.question;

import com.leetcode.daily.degreeofdifficulty.Simple;
import com.leetcode.daily.tags.Array;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description: 27. 移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * <p>
 * <p>
 * 说明:
 * <p>
 * 为什么返回数值是整数，但输出的答案是数组呢?
 * <p>
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 * <p>
 * 你可以想象内部操作如下:
 * <p>
 * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
 * int len = removeDuplicates(nums);
 * <p>
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
 * for (int i = 0; i < len; i++) {
 * print(nums[i]);
 * }
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [3,2,2,3], val = 3
 * 输出：2, nums = [2,2]
 * 解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
 *
 * <p>
 * 示例 2：
 * <p>
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,4,0,3]
 * 解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面的元素。
 *
 *
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * nums 已按升序排列
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: 李钢 2580704698@qq.com
 * @date: 2021/10/19 14:40
 * @Copyright: Copyright (c) 2019
 */
public class Question27 implements Array, Simple {

    @Test
    public void removeDuplicatesTest() {
        int[] nums = new int[]{3, 2, 2, 3};
        int  val = 3  ;

        int numsLength = removeElement(nums,val);

        System.out.println(numsLength);
        System.out.println(Arrays.toString(nums));
    }

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            // 把不等于 val 的移动到前面
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;

    }

    public int removeElement1(int[] nums, int val) {

        int left = 0;
        for (int index = 0; index < nums.length; index++) {
            // 把不等于 val 的移动到前面
            if (nums[index] != val) {
                nums[left] = nums[index];
                left++;
            }
        }
        return left;

    }

}
