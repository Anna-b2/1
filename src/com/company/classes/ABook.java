package com.company.classes;

import com.company.interfaces.Price;

public class ABook extends AudioBook implements Price{
    public ABook(Integer radius, Integer hight) {
        super(radius,hight);
    }

    @Override
    public String getType() {
        return "Аудиокнига";
    }

    @Override
    public Integer calcPrice(Integer a, Integer b) {
        return 2 * lengh;
    }

    @Override
    public Integer calcMultiplication(Integer a, Integer b) {
        return lengh * height;
    }

    @Override
    public Integer calcAudio(Integer a, Integer b) {
        return lengh * lengh * height;
    }

    @Override
    public void printInfo(String info) {
        System.out.println(info);
    }

    @Override
    public String toString() {
        return "Художественная литература{" +
                "lengh=" + lengh +
                ", width=" + height +
                ", type='" + type + '\'' +
                '}';
    }
}
