package ru.geekbrains.java3.lesson1;

public class SimpleGenApp {
    public static void main(String args[]) {
        TwoGen<Integer, String> twoGenObj = new TwoGen<Integer, String>(555, "Hello");
        twoGenObj.showTypes();
        int intValue = twoGenObj.getObj1();
        String strValue = twoGenObj.getObj2();
        System.out.println(intValue);
        System.out.println(strValue);
    }
}

