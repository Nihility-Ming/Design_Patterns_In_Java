package com.miaoge.Iterator.Interator;

import java.util.ArrayList;
import java.util.List;

/**
 * Iterator迭代器抽象类，迭代器模式的关键
 */
public abstract class Iterator<T> {
    public Integer current;
    public List<T> list;

    public Iterator() {

    }

    // 第一个
    public abstract T getFirst();
    // 下一个
    public abstract T nextObject();
    // 是否结束
    public abstract Boolean isDone();
    // 当前对象
    public abstract T getCurrentItem();

    public Iterator(List<T> list) {
        this.list = list;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
