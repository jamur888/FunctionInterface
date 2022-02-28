package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main implements Suplier {
    public static void main(String[] args) {


        List<Cat> catList = getCatList();
        Predicat<Cat> p = emp -> emp.getAge() <= 2;

        for (Cat emp : catList) {
            if (p.test(emp)) {
                System.out.println("name....." + emp.getName());
            }

        }

    }

    public static List<Cat> getCatList() {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("kolya", 2));
        cats.add(new Cat("wasya", 4));
        cats.add(new Cat("garfild", 1));
        cats.add(new Cat("sima", 3));
        return cats;
    }


    @Override
    public Object get() {
        return null;
    }

}
