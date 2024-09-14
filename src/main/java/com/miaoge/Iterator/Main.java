package com.miaoge.Iterator;

import com.miaoge.Iterator.Interator.Impl.ConcreteIterator;
import com.miaoge.Iterator.Interator.Impl.ConcreteIteratorDesc;
import com.miaoge.Iterator.Interator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("=========== 我的迭代器 ===========");
        Iterator<Integer> iterator = new ConcreteIterator<>(list);
        Integer i = iterator.nextObject();
        while(i != null) {
            System.out.println(i);
            i = iterator.nextObject();
        }

        System.out.println("========= 我的反向迭代器 =========");
        Iterator<Integer> reverseIterator = new ConcreteIteratorDesc<>(list);
        Integer y = reverseIterator.nextObject();
        while(y != null) {
            System.out.println(y);
            y = reverseIterator.nextObject();
        }
    }
}
