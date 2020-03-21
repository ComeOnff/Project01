package com.hunan.java;

import com.hunan.bean.Customer;

import java.util.ArrayList;

/**
 * @author 猫咚
 * @date 2020/3/21 - 16:10
 */

public class TemplatesTest {

    private static final Customer customer = new Customer();
    public static final int i = 1;
    public static final int num = 1;
    public static final String s = "";
    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num = 1;
        int num1 = 2;
        System.out.println("num = " + num);
        System.out.println(num1);

        String[] arr =  new String[]{"Tom","Jerry","Kobe","James"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {

        }

        for (int i = list.size() - 1; i >= 0; i--) {

        }

        if (list == null) {

        }

        if (list != null) {

        }

        if (list == null) {

        }

        if (list != null) {

        }

    }

}
