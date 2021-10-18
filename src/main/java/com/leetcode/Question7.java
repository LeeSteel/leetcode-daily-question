package com.leetcode;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description: 7. 整数反转
 * <p>
 * <p>
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 123
 * 输出：321
 * <p>
 * 示例 2：
 * <p>
 * 输入：x = -123
 * 输出：-321
 * <p>
 * 示例 3：
 * <p>
 * 输入：x = 120
 * 输出：21
 * <p>
 * 示例 4：
 * <p>
 * 输入：x = 0
 * 输出：0
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * -231 <= x <= 231 - 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author: 李钢 2580704698@qq.com
 * @date: 2021/10/18 17:12
 * @Copyright: Copyright (c) 2019
 */
public class Question7 extends BaseQuestion {
    public static void main(String[] args) {
        int inputNum = 123456789;
        timeBegin();
        int outputNum = reverse1(inputNum);
        timeEnd();
        System.out.println(outputNum);
    }

    public static int reverse1(int x) {
        int res = 0;
        while (x != 0) {
            //每次取末尾数字
            int tmp = x % 10;
            //判断是否 大于 最大32位整数
            if (res > 214748364 || (res == 214748364 && tmp > 7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res < -214748364 || (res == -214748364 && tmp < -8)) {
                return 0;
            }
            res = res * 10 + tmp;
            x /= 10;
        }
        return res;

    }
}
