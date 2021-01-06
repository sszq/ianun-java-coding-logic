package com.ianun.section3.chapter1generic.part1notion0principium;

import javafx.util.Pair;

/**
 * @author ....: WangQk
 * @project....: ianun-java-coding-logic
 * @description:
 * @date ......: 2021-01-07
 */
public class GenericMethod {

    public static void main(String[] args) {
        String[] funds = {"富国", "中欧", "南方"};

        int i = indexOf(funds, "南方");
        System.out.println(i);

        PairTV pairTV = makePair(1, "tiger");
        System.out.println(pairTV.getFirst() + ", " + pairTV.getSecond());
    }

    public static <T,V> PairTV<T, V> makePair(T first, V second) {
        PairTV<T, V> pairTV = new PairTV<>(first, second);
        return pairTV;
    }

    /**
     * Must add <T> before the return type.
     * @param arr
     * @param elm
     * @param <T>
     * @return
     */
    public static <T> int indexOf(T[] arr, T elm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(elm)) {
                return i;
            }
        }
        return -1;
    }
}
