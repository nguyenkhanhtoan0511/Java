package com.nokia.java.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HashSetDemo {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println(list);
        System.out.println("max: " + Collections.max(list));
        System.out.println("min: " + Collections.min(list));
    }
}
