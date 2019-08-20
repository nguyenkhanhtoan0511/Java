package com.nokia.java.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetDemo {

    public static void main(String args[]) {
        HashMap hm = new HashMap();
        hm.put("Zara", 3434.34);
        hm.put("Mahnaz", 123.22);
        hm.put("Ayan", 1378.00);
        hm.put("Daisy", 99.22);
        hm.put("Qadir", -19.08);
        hm.put("Qadir", -10);
        Set set = hm.entrySet();
        System.out.println(hm);
        System.out.println(set);
        Iterator i = set.iterator();
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = ((Double)hm.get("Zara")).doubleValue();
        hm.put("Zara", balance + 1000);
        System.out.println("Balance moi cua Zara la: " +
                hm.get("Zara"));
    }
}