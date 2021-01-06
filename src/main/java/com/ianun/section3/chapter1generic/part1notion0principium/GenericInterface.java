package com.ianun.section3.chapter1generic.part1notion0principium;

import java.util.Comparator;

/**
 * @author ....: WangQk
 * @project....: ianun-java-coding-logic
 * @description:
 * @date ......: 2021-01-07
 */
public class GenericInterface {

}

class comparableDemo implements Comparable<Integer> {

    @Override
    public int compareTo(Integer o) {
        return o;
    }
}

class comparatorDemo implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
