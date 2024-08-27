package com.miaoge.Builder;

import com.miaoge.Builder.PersonBuilder.HighPersonBuilder;
import com.miaoge.Builder.PersonBuilder.PersonBuilder;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new HighPersonBuilder();
        PersonDirector personDirector = new PersonDirector(personBuilder);
        personDirector.createPerson();

        Person person = personBuilder.getPerson();
        System.out.println(person);
    }
}
