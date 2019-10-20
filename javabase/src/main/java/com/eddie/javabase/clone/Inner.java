package com.eddie.javabase.clone;

import java.io.Serializable;

public class Inner implements Serializable {
    private static final long serialVersionUID = -2474162598229482090L;
    public String name = "";

    public Inner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Inner{" +
                "name='" + name + '\'' +
                '}';
    }
}
