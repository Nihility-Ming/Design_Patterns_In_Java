package com.miaoge.Iterator.Interator.Impl;

import com.miaoge.Iterator.Interator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator <T> extends Iterator<T> {
    @Override
    public T getFirst() {
        return this.list.get(0);
    }

    @Override
    public T nextObject() {
        T ret = null;
        current++;
        if(current < this.list.size()) {
            ret = this.list.get(current);
        }

        return ret;
    }

    @Override
    public Boolean isDone() {
        if (this.current >= this.list.size()) {
            return true;
        }

        return false;
    }

    @Override
    public T getCurrentItem() {
        return this.list.get(this.current);
    }

    private ConcreteIterator() {
        super();
    }

    public ConcreteIterator(List<T> list) {
        this.list = list;
        current = -1;
    }
}
