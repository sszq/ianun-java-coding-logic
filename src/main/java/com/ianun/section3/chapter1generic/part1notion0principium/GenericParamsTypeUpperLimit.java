package com.ianun.section3.chapter1generic.part1notion0principium;

/**
 * @author ....: WangQk
 * @project....: ianun-java-coding-logic
 * @description:
 * @date ......: 2021-01-07
 */
public class GenericParamsTypeUpperLimit {
    public static void main(String[] args) {

        NumberPair numberPair = new NumberPair(10, 13.278);
        System.out.println(numberPair.sum());
    }
}

/**
 * upper limit is one class.
 * @param <T>
 * @param <V>
 */
class NumberPair<T extends Number, V extends Number> extends PairTV<T, V> {

    public NumberPair(T first, V second) {
        super(first, second);
    }

    Double sum() {
        return first.doubleValue() + second.doubleValue();
    }
}
