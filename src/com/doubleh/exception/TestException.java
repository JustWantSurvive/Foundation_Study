package com.doubleh.exception;

import java.util.ArrayList;
import java.util.List;

public class TestException {
    public static void main(String[] args) {
//        listException1();
        arrayException1();
    }

    /**
     * list集合下标越界exception - IndexOutOfBoundsException
     */
    public static void listException1(){
        List<String> demoList = new ArrayList<>();
        demoList.add("aa");
        String s = demoList.get(2);
        System.out.println(s);
    }

    /**
     * array下标越界exception - ArrayIndexOutOfBoundsException
     */
    public static void arrayException1(){
        String[] sarr = new String[]{"1","2"};
        System.out.println(sarr[2]);
    }


}
