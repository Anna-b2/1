package com.company.classes;

public class Scentific extends Magazine  {
    public Scentific(Integer a, Integer b) {
        super(a, b);
    }

    @Override
    public String toString() {
        return "Scentific{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public String getType() {
        return "Научный журнал";
    }

    @Override
    public Integer calcPrice(Integer a, Integer b) {
        return (a + b) * 2;
    }

    @Override
    public void printInfo(String info) {
        System.out.println(info);
    }
}
