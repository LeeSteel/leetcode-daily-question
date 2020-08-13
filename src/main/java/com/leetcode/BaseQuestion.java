package com.leetcode;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description: 基础问题 类
 * @author: 李钢 2580704698@qq.com
 * @date: 2020/8/13 11:03
 * @Copyright: Copyright (c) 2019
 */
public abstract class BaseQuestion {
    private static long beginTimeMillis = 0;
    private static long endTimeMillis = 0;

    /**
     *  计时开始
     * @return 开始时的时间毫秒数
     */
    protected static long timeBegin() {
        beginTimeMillis = System.currentTimeMillis();
        return beginTimeMillis;
    }
    /**
     *  计时结束
     * @return 返回花费的时间毫秒数
     */
    protected static long timeEnd() {
        endTimeMillis = System.currentTimeMillis();
        long takeTimeMillis = endTimeMillis - beginTimeMillis;
        beginTimeMillis = endTimeMillis;
        System.out.println("耗时:" + takeTimeMillis + "毫秒");
        return takeTimeMillis;
    }
}
