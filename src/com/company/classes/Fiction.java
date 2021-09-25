package com.company.classes;

import com.company.interfaces.Volume;
import com.company.interfaces.Price;

public class Fiction extends Book implements Volume,Price {
    private Integer a;
    private Integer b;

    public Fiction(String type, Integer a, Integer b) {
        super(type);
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

    public Fiction(String type) {
        super(type);
    }

    @Override
    public String getType() {
        return "Художественная литература";
    }

    @Override
    public Integer calcLength(Integer a, Integer b) {
        return (Integer) (a*b );
    }

    @Override
    public String printColor(String color) {
        return "Цвет: " + color;
    }

    @Override
    public Integer  calcPrice(Integer a, Integer b) {
        return  a * b;
    }

    @Override
    public Integer calcMultiplication(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public void printInfo(String info) {
        System.out.println(info);
    }

    @Override
    public String toString() {
        return "Fiction{" +
                "a=" + a +
                ", b=" + b +
                ", type='" + type + '\'' +
                '}';
    }
}
