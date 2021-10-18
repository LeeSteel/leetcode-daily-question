package com.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description: 3. 无重复字符的最长子串
 *
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * @author: 李钢 2580704698@qq.com
 * @date: 2020/8/13 17:03
 * @Copyright: Copyright (c) 2019
 */
public class Question3  extends  BaseQuestion{

    public  static  void main(String[] args){


        timeBegin();
        String str="abcabcbb";
        int length =  lengthOfLongestSubstring(str);
        System.out.println(length);
        timeEnd();

        str="bbbbb";
        length =  lengthOfLongestSubstring(str);
        System.out.println(length);
        timeEnd();


        str="pwwkew";
        length =  lengthOfLongestSubstring(str);
        System.out.println(length);
        timeEnd();
    }


    /**
     *
     * @param s
     * @return
     */
    public  static  int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map  = new LinkedHashMap<Character, Integer>();
        int maxLength =0;
        for (int i=0;i<chars.length;i++
             ) {
          Integer oldIndex =  map.put(chars[i],i);
          if(oldIndex == null){
              continue;
          }
            Integer tempIndex = i-oldIndex;
          if(tempIndex > maxLength){
              maxLength  = tempIndex ;
          }
        }

        return maxLength;
    }
}

