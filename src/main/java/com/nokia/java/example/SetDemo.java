package com.nokia.java.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetDemo {

    public static void main(String args[]) {
        // Tao mot hash map
        HashMap hm = new HashMap();
        // Dat cac phan tu vao map
        hm.put("Zara", 3434.34);
        hm.put("Mahnaz", 123.22);

        hm.put("Ayan", 1378.00);

        hm.put("Daisy", 99.22);

        hm.put("Qadir", -19.08);

        hm.put("Qadir", -10);

        // Lay mot set cac entry
        Set set = hm.entrySet();
        System.out.println(hm);
        System.out.println(set);
        // Lay mot iterator
        Iterator i = set.iterator();
//        System.out.println(i);
        // Hien thi cac phan tu
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // Gui 1000 vao trong tai khoan cua Zara
        double balance = ((Double)hm.get("Zara")).doubleValue();
        hm.put("Zara", balance + 1000);
        System.out.println("Balance moi cua Zara la: " +
                hm.get("Zara"));
    }
}