package com.ianun.section3.chapter1generic.part1notion0principium;

/**
 * @author ....: WangQk
 * @project....: ianun-java-coding-logic
 * @description:
 * @date ......: 2021-01-06
 */
public class GenericPrincipium {
    public static void main(String[] args) {
        PairO funds = new PairO("2021", 1440);
        System.out.println(funds.first + ", " + funds.second);
    }
}

class PairO {
    Object first;
    Object second;

    public PairO(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }
}
