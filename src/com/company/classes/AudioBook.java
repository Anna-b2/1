package com.company.classes;

import com.company.interfaces.Multiplication;
import com.company.interfaces.Audio;

public abstract class AudioBook implements Multiplication, Audio {
    protected Integer lengh;
    protected Integer height;
    protected Integer a;
    protected Integer b;
    protected Integer c;
    protected String type;

    public AudioBook(Integer lengh, Integer height, Integer a, Integer b, Integer c, String type) {
        this.lengh = lengh;
        this.height = height;
        this.type = type;
    }

    public AudioBook() {
    }

    public AudioBook(Integer lengh, Integer height) {
        this.lengh = lengh;
        this.height = height;
    }

    public Integer getlengh() {
        return lengh;
    }

    public void setlengh(Integer lengh) {
        this.lengh = lengh;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public abstract String getType();
}
