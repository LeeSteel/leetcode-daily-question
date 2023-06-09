package com.leetcode.daily.question;

import com.leetcode.daily.utils.TimeUtil;
import org.junit.jupiter.api.Test;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 示例 1：
 *
 * 输入：s = ["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 示例 2：
 *
 * 输入：s = ["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 * 提示：
 *
 * 1 <= s.length <= 105
 * s[i] 都是 ASCII 码表中的可打印字符
 * Related Topics
 * 双指针
 * 字符串
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/reverse-string/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: 李钢 2580704698@qq.com
 * @date: 2020/8/13 10:54
 * @Copyright: Copyright (c) 2019
 */
public class Question344_ReverseString {
    @Test
    public void method2Test() {
        TimeUtil.timeBegin();
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        TimeUtil.timeEnd();
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
