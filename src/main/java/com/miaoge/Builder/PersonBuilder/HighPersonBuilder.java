package com.miaoge.Builder.PersonBuilder;

public class HighPersonBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        this.person.setHeader("建造高人的头部");
    }

    @Override
    public void buildBody() {
        this.person.setBody("建造高人的身体");
    }
}
