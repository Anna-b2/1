package com.company.classes;

public class Literary extends Magazine  {
    public Literary(Integer a) {
        super(a);
    }

    @Override
    public String toString() {
        return "Literary{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public String getType() {
        return "Литературный журнал";
    }

    @Override
    public Integer calcPrice(Integer a, Integer b) {
        return 4 * a;
    }

    @Override
    public void printInfo(String info) {
        System.out.println(info);
    }
}
