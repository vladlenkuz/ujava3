package ru.geekbrains.java3.dz.hamidulovVlad1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String [] arrint  = new String[5];
        for (int i = 0; i < arrint.length; i++) {
            arrint[i] = "str" + i;
        }

        System.out.println("\nNew  :");
        Arays<?> arr = new Arays<>(new Man(), new Women(), new Women());
        arr.info();

        System.out.println("\nExchange  :");
        arr.arraElementsExchange(0,2);
        arr.info();

        System.out.println("\nList  :");
        ArrayList<?> list = arr.arrayToArrayList();
        for (Object o : list) System.out.println(o.getClass().getName());

        System.out.println("\nArr to list :");
        List<String> arrayList  = convertToList(arrint);
        for (Object o : arrayList) System.out.println(o.toString());

    }
    private static <E> List<E> convertToList(E[] array) {
        List<E> arrays = new ArrayList<>();
        for (E o: array) {
            arrays.add(o);
        }
        return arrays;
    }
}
