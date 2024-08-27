package com.miaoge.Builder;

public class Person {
    private String header;
    private String body;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Person{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
