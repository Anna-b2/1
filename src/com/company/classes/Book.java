package com.company.classes;

import com.company.interfaces.Color;

public abstract class Book implements Color {
    protected String type;

    public Book(String type) {
        this.type = type;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Figure{" +
                "type='" + type + '\'' +
                '}';
    }
}
