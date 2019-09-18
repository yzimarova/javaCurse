package com.playtika.javacurse.lesson11;

public class Ganeric {

    static class ObjectHolder<T> {
        private T object;


        public void set(T obj) {
            this.object = obj;
        }

        public T get() {
            return object;
        }
    }
    public static void main (String[] args) {
        ObjectHolder<String> holder = new ObjectHolder<>();

    }
}
