package com.miaoge.Proxy;

public class TableView {
    public TableViewDataSource dataSource;

    public void show() {
        System.out.println(dataSource.getRows());
    }
}
