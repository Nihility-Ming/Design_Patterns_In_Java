package com.miaoge.Builder.PersonBuilder;

public class FatPersonBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        this.person.setHeader("建造肥人的头部");
    }

    @Override
    public void buildBody() {
        this.person.setBody("建造肥人的身体");
    }
}
