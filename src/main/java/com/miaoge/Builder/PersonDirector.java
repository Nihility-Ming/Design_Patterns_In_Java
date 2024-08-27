package com.miaoge.Builder;

import com.miaoge.Builder.PersonBuilder.PersonBuilder;

public class PersonDirector {

    private PersonBuilder builder;

    private PersonDirector(){}

    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void createPerson() {
        this.builder.buildHead();
        this.builder.buildBody();
    }

    public void createAbstractPerson() {
        this.builder.buildHead();
    }

    public PersonBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(PersonBuilder builder) {
        this.builder = builder;
    }
}
