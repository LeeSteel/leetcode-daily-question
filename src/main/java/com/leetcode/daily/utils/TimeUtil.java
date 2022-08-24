package com.leetcode.daily.utils;

import lombok.experimental.UtilityClass;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: 李钢 2580704698@qq.com
 * @date: 2022/8/24 13:49
 * @Copyright: Copyright (c) 2019
 */

@UtilityClass
public class TimeUtil {
    private static long beginTimeMillis = 0;
    private static long endTimeMillis = 0;

    /**
     * 计时开始
     *
     * @return 开始时的时间毫秒数
     */
    public long timeBegin() {
        beginTimeMillis = System.currentTimeMillis();
        return beginTimeMillis;
    }

    /**
     * 计时结束
     *
     * @return 返回花费的时间毫秒数
     */
    public long timeEnd() {
        endTimeMillis = System.currentTimeMillis();
        long takeTimeMillis = endTimeMillis - beginTimeMillis;
        beginTimeMillis = endTimeMillis;
        System.out.println("耗时:" + takeTimeMillis + "毫秒");
        return takeTimeMillis;
    }
}
