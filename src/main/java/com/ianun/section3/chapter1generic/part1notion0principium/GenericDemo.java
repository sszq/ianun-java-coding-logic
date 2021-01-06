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

        PairTV<String, Double> computer = new PairTV<>("Lenovo", 7299.88);
        System.out.println(computer.getFirst() + ", " + computer.getSecond());
    }
}

class Pair<A> {
    public A first;
    public A second;

    public Pair (A first, A second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public A getSecond() {
        return second;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public void setSecond(A second) {
        this.second = second;
    }

    @Override
    public String toString() {
       return "first:" + first + ", second:" + second;
    }

}

class PairTV<T, V> {
    T first;
    V second;

    public PairTV(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
