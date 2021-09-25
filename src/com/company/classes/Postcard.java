package com.company.classes;

import com.company.interfaces.Weight;

public class Postcard implements Weight {
    private Integer a;
    private Integer b;

    public Postcard() {
    }

    public Postcard(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Postcard{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public Integer calcPrice(Integer a, Integer b) {
        if (a > b)
            return a - b;
        else
            return b - a;
    }

    @Override
    public void printInfo(String info) {
        System.out.println(info);
    }
}
