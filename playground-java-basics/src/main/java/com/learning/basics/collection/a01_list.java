package com.learning.basics.collection;

import java.util.Iterator;
import java.util.List;

public class a01_list {
    public static void main(String[] args) {

        /*
        使用iterator进行遍历
         */
        List<String> list = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9"); // 创建list可以使用List.of方法，但这种方法不接受null值
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
        List和Array转换
         */
        List<Integer> list1 = List.of(12, 34, 56);
//        Object[] array = list1.toArray(); // 不推荐，此类转换会丢失类型信息
        Integer[] array = list1.toArray(new Integer[3]); // 推荐转换写法
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
