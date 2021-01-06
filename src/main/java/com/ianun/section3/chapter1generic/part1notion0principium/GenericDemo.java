package com.ianun.section3.chapter1generic.part1notion0principium;

/**
 * @author ....: WangQk
 * @project....: ianun-java-coding-logic
 * @description:
 * @date ......: 2021-01-06
 */
public class GenericDemo {

    public static void main(String[] args) {

        Pair<String> shoes = new Pair<>("left", "right");

        System.out.println(shoes.toString());

        Pair<Integer> doub = new Pair<>(1, 2);
        System.out.println(doub.toString());
    }
}

class Pair<T> {
    public T first;
    public T second;

    public Pair (T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
       return "first:" + first + ", second:" + second;
    }

}
