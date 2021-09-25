package com.company.classes;

import com.company.interfaces.Weight;

public abstract class Magazine implements Weight {
    protected Integer a;
    protected Integer b;
    protected Integer c;
    protected Integer d;
    protected String type;

    public Magazine () {
    }

    public Magazine (Integer a) {
        this.a = a;
    }

    public Magazine (Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Magazine (Integer a, Integer b, Integer c, Integer d, String type) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.type = type;
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

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Magazine{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", type='" + type + '\'' +
                '}';
    }
}
