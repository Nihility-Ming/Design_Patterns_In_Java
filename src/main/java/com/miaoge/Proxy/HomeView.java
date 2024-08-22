package com.miaoge.Proxy;

import java.util.List;

public class HomeView implements TableViewDataSource{
    public TableView tableView;
    public HomeView() {
        tableView = new TableView();
        tableView.dataSource = this;
    }

    @Override
    public List<String> getRows() {
        return List.of("text1", "text2", "text3");
    }

    public void show() {
        System.out.println("tableview:");
        tableView.show();
    }
}
