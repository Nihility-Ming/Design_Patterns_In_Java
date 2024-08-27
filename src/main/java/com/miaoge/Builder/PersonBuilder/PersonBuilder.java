package com.miaoge.Builder.PersonBuilder;

import com.miaoge.Builder.Person;

public abstract class PersonBuilder {
    public Person person = new Person();
    abstract public void buildHead();
    abstract public void buildBody();

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
