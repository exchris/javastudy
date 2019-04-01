package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 对字符串进行自然排序
 */
 public class StringSort {
     
     public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<String>();
         list.add("zfdsfd");
         list.add("dee");
         list.add("z");
         list.add("fsdfdsfd");
         list.add("abd");
         list.add("z");
         System.out.println("未排序:" + list);
         // 自然排序
         Collections.sort(list);
         System.out.println("排序后:" + list);
     }
 }
