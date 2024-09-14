package com.miaoge.Iterator.Interator.Impl;

import com.miaoge.Iterator.Interator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIteratorDesc <T> extends Iterator<T> {
    @Override
    public T getFirst() {
        return list.get(list.size() - 1);
    }

    @Override
    public T nextObject() {
        T ret = null;

        this.current --;
        if(this.current >= 0) {
            ret = this.list.get(this.current);
        }

        return ret;
    }

    @Override
    public Boolean isDone() {
        return this.current<0;
    }

    @Override
    public T getCurrentItem() {
        return this.list.get(this.current);
    }

    private ConcreteIteratorDesc() {}

    public ConcreteIteratorDesc(List<T> list) {
        this.list = list;
        current = list.size();
    }
}
